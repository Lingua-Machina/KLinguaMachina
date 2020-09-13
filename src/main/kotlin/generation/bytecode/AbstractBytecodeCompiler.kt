package generation.bytecode

import generation.ModuleCompiler
import generation.exceptions.UnknownVariable
import generation.exceptions.VariableAlreadyDeclared
import interpreter.block.BlockLiteralValue
import interpreter.block.impl.*
import interpreter.module.Module
import interpreter.module.impl.BytecodeModule
import parsing.ast.nodes.impl.*
import parsing.ast.visitors.BaseASTNodeVisitor
import java.util.*

@ExperimentalUnsignedTypes
abstract class AbstractBytecodeCompiler(
    val module: BytecodeModule,
    astRootNode: RootNode
): ModuleCompiler(astRootNode), BaseASTNodeVisitor<Unit> {
    protected val blockStack = LinkedList<CompiledBlock>()

    init {
        blockStack.push(module.mainBlock)
    }

    override fun compile(): Module {
        visit(astRootNode)
        return module
    }

    protected fun addVariable(name: String): Int {
        val variableIndex = blockStack.last.variableMap.size
        blockStack.last.variableMap[name] = variableIndex
        return variableIndex
    }

    protected fun getVariable(name: String) = blockStack.last.variableMap[name]

    protected fun addConstant(value: BlockLiteralValue): Int {
        val constantIndex = blockStack.last.constantMap.size
        blockStack.last.constantMap[value] = constantIndex
        return constantIndex
    }

    protected fun getSymbolFromSelector(selector: MessageSelectorNode) =
        SymbolConstant(selector.keywords.joinToString(separator = ":").let {
            when (selector.values.size) {
                0    -> it
                else -> "$it:"
            }
        })

    override fun defaultValue() = Unit

    override fun visit(node: ArrayLiteralNode) {
        super.visit(node)
        blockStack.last.emitArray(node.items.size)
    }

    override fun visit(node: BlockLiteralNode) {
        super.visit(node)
    }

    override fun visit(node: CharLiteralNode) {
        val charIndex = addConstant(CharConstant(node.value))
        blockStack.last.emitConst(charIndex)
    }

    override fun visit(node: CompileStatementNode) {
        super.visit(node)
    }

    override fun visit(node: PrimitiveDeclStatementNode) {
        super.visit(node)
    }

    override fun visit(node: StatementExprNode) {
        // TODO emit a 'pop' except for last expr in block
        super.visit(node)
    }

    override fun visit(node: DoubleLiteralNode) {
        val doubleIndex = addConstant(DoubleConstant(node.value))
        blockStack.last.emitConst(doubleIndex)
    }

    override fun visit(node: IdentifierNode) {
        blockStack.last.also {
            when (node.value) {
                "self"        -> it.emitSelf()
                "thisContext" -> it.emitContext()
                "true"        -> it.emitTrue()
                "false"       -> it.emitFalse()
                "nil"         -> it.emitNil()
                else          -> {
                    val variableIndex = getVariable(node.value)
                    // TODO check in global pool
                    if (variableIndex == null) {
                        throw UnknownVariable(node.value, node.position)
                    }
                    it.emitGetLocal(variableIndex)
                }
            }
        }
    }

    override fun visit(node: IntegerLiteralNode) {
        blockStack.last.emitConstInt(node.value)
    }

    override fun visit(node: MessageCascadeNode) {
        (1 until node.selectors.size).forEach {
            blockStack.last.emitDup()
        }
        node.selectors.forEachIndexed { i, selectable ->
            visit(selectable)
            if (i < node.selectors.size - 1)
            blockStack.last.emitPop()
        }
    }

    override fun visit(node: MessageSelectorNode) {
        val constantIndex = addConstant(getSymbolFromSelector(node))
        super.visit(node)
        blockStack.last.emitSend(constantIndex)
    }

    override fun visit(node: OperationNode) {
        visit(node.expressions[0])
        var i = 1
        while (i < node.expressions.size) {
            visit(node.expressions[i])
            blockStack.last.also {
                when (node.op) {
                    OperationOp.AND        -> it.emitAnd()
                    OperationOp.OR         -> it.emitOr()
                    OperationOp.PLUS       -> it.emitAdd()
                    OperationOp.MINUS      -> it.emitMinus()
                    OperationOp.TIMES      -> it.emitMul()
                    OperationOp.DIVIDED_BY -> it.emitDiv()
                    OperationOp.MODULO     -> it.emitMod()
                    OperationOp.EQUAL      -> it.emitEq()
                    OperationOp.NOT_EQUAL  -> it.emitNeq()
                    OperationOp.LOWER      -> it.emitLower()
                    OperationOp.LOWER_EQ   -> it.emitLowerEq()
                    OperationOp.GREATER    -> it.emitGreater()
                    OperationOp.GREATER_EQ -> it.emitGreaterEq()
                }
            }
            i++
        }
    }

    override fun visit(node: StringLiteralNode) {
        val stringIndex = addConstant(StringConstant(node.value))
        blockStack.last.emitConst(stringIndex)
    }

    override fun visit(node: SymbolLiteralNode) {
        val symbolIndex = addConstant(SymbolConstant(node.value))
        blockStack.last.emitConst(symbolIndex)
    }

    override fun visit(node: UnaryOperationNode) {
        visit(node.receiver)
        blockStack.last.also {
            when (node.op) {
                UnaryOperationOp.MINUS -> it.emitNeg()
                UnaryOperationOp.NOT   -> it.emitNot()
            }
        }
    }

    override fun visit(node: VarAssignmentNode) {
        val variableIndex = getVariable(node.name)
        // TODO check for global variable
        if (variableIndex != null) {
            visit(node.value)
            blockStack.last.emitSetLocal(variableIndex)
        } else {
            throw UnknownVariable(node.name, node.position)
        }
    }

    override fun visit(node: VarDeclarationNode) {
        var variableIndex = getVariable(node.name)
        if (variableIndex == null) {
            variableIndex = addVariable(node.name)
            visit(node.value)
            blockStack.last.emitSetLocal(variableIndex)
        } else {
            throw VariableAlreadyDeclared(node.name, node.position)
        }
    }
}
