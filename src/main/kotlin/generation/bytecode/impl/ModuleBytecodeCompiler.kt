package generation.bytecode.impl

import generation.ModuleCompiler
import generation.exceptions.UnknownVariable
import interpreter.block.impl.CompiledBlock
import interpreter.module.Module
import interpreter.module.impl.BytecodeModule
import parsing.ast.nodes.impl.*
import parsing.ast.visitors.BaseASTNodeVisitor
import java.util.*

@ExperimentalUnsignedTypes
class ModuleBytecodeCompiler(
    val module: BytecodeModule,
    astRootNode: RootNode
): ModuleCompiler(astRootNode), BaseASTNodeVisitor<Unit> {
    private val blockStack = LinkedList<CompiledBlock>()

    init {
        blockStack.push(module.mainBlock)
    }

    override fun compile(): Module {
        visit(astRootNode)
        return module
    }

    fun addVariable(name: String): Int {
        val variableIndex = blockStack.last.variableMap.size
        blockStack.last.variableMap[name] = variableIndex
        return variableIndex
    }

    fun getVariable(name: String) = blockStack.last.variableMap[name]

    override fun defaultValue() = Unit

    override fun visit(node: ArrayLiteralNode) {
        super.visit(node)
    }

    override fun visit(node: BlockLiteralNode) {
        super.visit(node)
    }

    override fun visit(node: CharLiteralNode) {
        super.visit(node)
    }

    override fun visit(node: CompileStatementNode) {
        super.visit(node)
    }

    override fun visit(node: PrimitiveDeclStatementNode) {
        super.visit(node)
    }

    override fun visit(node: DoubleLiteralNode) {
        super.visit(node)
    }

    override fun visit(node: IdentifierNode) {
        val variableIndex = getVariable(node.value)
        // TODO check in global pool
        if (variableIndex == null) {
            throw UnknownVariable(node.value, node.position)
        }
        blockStack.last.emitGetLocal(variableIndex)
    }

    override fun visit(node: IntegerLiteralNode) {
        blockStack.last.emitConstInt(node.value)
    }

    override fun visit(node: LocalReturnNode) {
        visit(node.expression)
        blockStack.last.emitReturn()
    }

    override fun visit(node: MessageCascadeNode) {
        super.visit(node)
    }

    override fun visit(node: MessageChainNode) {
        super.visit(node)
    }

    override fun visit(node: MessageSelectorNode) {
        super.visit(node)
    }

    override fun visit(node: MessageSendingNode) {
        super.visit(node)
    }

    override fun visit(node: NonLocalReturnNode) {
        visit(node.expression)
        blockStack.last.emitNonLocalReturn()
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
        super.visit(node)
    }

    override fun visit(node: SymbolLiteralNode) {
        super.visit(node)
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
        super.visit(node)
    }

    override fun visit(node: VarDeclarationNode) {
        val variableIndex = addVariable(node.name)
        visit(node.value)
        blockStack.last.emitSetLocal(variableIndex)
    }
}
