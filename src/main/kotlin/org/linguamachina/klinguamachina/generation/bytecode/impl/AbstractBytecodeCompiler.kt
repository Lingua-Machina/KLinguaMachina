package org.linguamachina.klinguamachina.generation.bytecode.impl

import org.linguamachina.klinguamachina.generation.exceptions.VariableAlreadyDeclared
import org.linguamachina.klinguamachina.generation.Compiler
import org.linguamachina.klinguamachina.generation.Scope
import org.linguamachina.klinguamachina.generation.bytecode.Bytecode
import org.linguamachina.klinguamachina.generation.closure.ClosureVariablesUsageAnalysis
import org.linguamachina.klinguamachina.generation.exceptions.PrimitiveBindingBadArity
import org.linguamachina.klinguamachina.generation.exceptions.UnknownVariable
import org.linguamachina.klinguamachina.generation.exceptions.UnregisteredPrimitive
import org.linguamachina.klinguamachina.generation.impl.BlockScope
import org.linguamachina.klinguamachina.interpreter.block.BlockLiteralValue
import org.linguamachina.klinguamachina.interpreter.block.impl.*
import org.linguamachina.klinguamachina.interpreter.primitive.PrimitiveRegistry
import org.linguamachina.klinguamachina.parser.ast.nodes.ASTNode
import org.linguamachina.klinguamachina.parser.ast.nodes.impl.*
import org.linguamachina.klinguamachina.parser.ast.BaseASTNodeVisitor
import org.linguamachina.klinguamachina.util.getSelectorFromKeywords
import org.linguamachina.klinguamachina.util.getSymbolFromSelector
import org.linguamachina.klinguamachina.util.messageSelectorArity

@OptIn(ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class)
abstract class AbstractBytecodeCompiler<T>(
    protected val astRootNode: ASTNode,
    private var currentScope: Scope,
    protected val compiledBlock: CompiledBlock,
    private val primitiveRegistry: PrimitiveRegistry
): Compiler<T>, BaseASTNodeVisitor<Unit> {
    protected fun enterScope(newScopeTail: Scope) {
        newScopeTail.parent = currentScope
        currentScope = newScopeTail
    }

    protected fun leaveScope() {
        if (currentScope.hasParent) {
            currentScope = currentScope.parent!!
        } else {
            throw IllegalStateException("Cannot leave topmost scope")
        }
    }

    private fun addLocalVariable(name: String) =
        currentScope.addVariable(name)

    private fun getLocalVariable(name: String) =
        currentScope.getVariable(name)

    private fun addLocalConstant(value: BlockLiteralValue) =
        compiledBlock.constants.add(value)

    override fun defaultValue() = Unit

    private fun createBlockScope(copies: List<String>, copiedRefs: List<String>,
                                 refs: List<String>, params: List<String>): BlockScope {
        val blockScope = BlockScope()
        // Parameters are added first (they will be the first local variables)
        params.forEach {
            blockScope.addVariable(it)
        }
        // Copied variables are added and pushed first on the stack
        copies.forEach {
            blockScope.addVariable(it)
            currentScope.getVariable(it).emitGetVariable(compiledBlock, currentScope)
        }
        // Copied references are added and pushed on the stack as values
        copiedRefs.forEach {
            val index = blockScope.addVariableRef(it)
            // refs are always in current block
            compiledBlock.emitGetLocal(index)
        }
        // Finally the references
        refs.forEach {
            blockScope.addVariableRef(it)
            // refs are always in current block
            compiledBlock.emitCreateRef(currentScope.getVariable(it).index)
        }

        return blockScope
    }

    override fun visit(node: BlockLiteralNode) {
        val (copies, copiedRefs, refs) = ClosureVariablesUsageAnalysis(currentScope).analyse(node)
        val blockScope = createBlockScope(copies, copiedRefs, refs, node.paramNames)

        enterScope(blockScope)

        compiledBlock.emitClosure(copies.size + copiedRefs.size + refs.size, node.paramNames.size) {
            super.visit(node)
            if (node.statements.isNotEmpty()) {
                val lastStmt = node.statements.last()
                when {
                    lastStmt is StatementExprNode -> {
                        if (compiledBlock.bytecodes.last() == Bytecode.POP.ordinal.toUInt()) {
                            compiledBlock.bytecodes.removeLast()
                        }
                        compiledBlock.emitReturn()
                    }
                    lastStmt !is NonLocalReturnNode && lastStmt !is LocalReturnNode -> {
                        compiledBlock.emitNil()
                        compiledBlock.emitReturn()
                    }
                }
            } else {
                compiledBlock.emitNil()
                compiledBlock.emitReturn()
            }
        }

        leaveScope()
    }

    override fun visit(node: ArrayLiteralNode) {
        super.visit(node)
        compiledBlock.emitArray(node.items.size)
    }

    override fun visit(node: CharLiteralNode) {
        val charIndex = addLocalConstant(CharConstant(node.value))
        compiledBlock.emitConst(charIndex)
    }

    override fun visit(node: CompileStatementNode) {
        TODO("Implement compile statement compilation")
    }

    override fun visit(node: PrimitiveDeclStatementNode) {
        visit(node.receiver)

        if (!primitiveRegistry.isRegistered(node.primitiveName)) {
            throw UnregisteredPrimitive(node.primitiveName, node.position)
        }
        val primitiveBlock = primitiveRegistry.getPrimitive(node.primitiveName)
        val selector = getSelectorFromKeywords(node.keywords, node.paramNames.isNotEmpty())

        if (selector.messageSelectorArity != primitiveBlock.arity) {
            throw PrimitiveBindingBadArity(
                selector,
                primitiveBlock.name,
                node.position)
        }
        val selectorIndex = compiledBlock.constants.add(SymbolConstant(selector))
        val primitiveNameIndex = compiledBlock.constants.add(SymbolConstant(primitiveBlock.name))
        compiledBlock.emitBindPrimitive(selectorIndex, primitiveNameIndex)
    }

    override fun visit(node: StatementExprNode) {
        super.visit(node)
        compiledBlock.emitPop()
    }

    override fun visit(node: DoubleLiteralNode) {
        val doubleIndex = addLocalConstant(DoubleConstant(node.value))
        compiledBlock.emitConst(doubleIndex)
    }

    override fun visit(node: IdentifierNode) {
        compiledBlock.apply {
            when (node.value) {
                "self"        -> emitSelf()
                "thisContext" -> emitContext()
                "true"        -> emitTrue()
                "false"       -> emitFalse()
                "nil"         -> emitNil()
                else          -> emitGetVariable(node)
            }
        }
    }

    override fun visit(node: IntegerLiteralNode) {
        compiledBlock.emitConstInt(node.value)
    }

    override fun visit(node: MessageCascadeNode) {
        (1 until node.selectors.size).forEach {
            compiledBlock.emitDup()
        }
        node.selectors.forEachIndexed { i, selectable ->
            visit(selectable)
            if (i < node.selectors.size - 1)
            compiledBlock.emitPop()
        }
    }

    override fun visit(node: MessageSelectorNode) {
        val constantIndex = addLocalConstant(getSymbolFromSelector(node))
        super.visit(node)
        compiledBlock.emitSend(constantIndex)
    }

    override fun visit(node: OperationNode) {
        visit(node.expressions[0])
        var i = 1
        while (i < node.expressions.size) {
            visit(node.expressions[i])
            compiledBlock.also {
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
        val stringIndex = addLocalConstant(StringConstant(node.value))
        compiledBlock.emitConst(stringIndex)
    }

    override fun visit(node: SymbolLiteralNode) {
        val symbolIndex = addLocalConstant(SymbolConstant(node.value))
        compiledBlock.emitConst(symbolIndex)
    }

    override fun visit(node: UnaryOperationNode) {
        visit(node.receiver)
        compiledBlock.also {
            when (node.op) {
                UnaryOperationOp.MINUS -> it.emitNeg()
                UnaryOperationOp.NOT   -> it.emitNot()
            }
        }
    }

    override fun visit(node: VarAssignmentNode) {
        emitSetVariable(node)
    }

    override fun visit(node: VarDeclarationNode) {
        if (!currentScope.hasVariable(node.name)
                || currentScope.getVariable(node.name).isRef) {
            val variableIndex = addLocalVariable(node.name)
            visit(node.value)
            compiledBlock.emitSetLocal(variableIndex)
        } else {
            throw VariableAlreadyDeclared(node.name, node.position)
        }
    }

    override fun visit(node: LocalReturnNode) {
        visit(node.expression)
        compiledBlock.emitReturn()
    }

    override fun visit(node: NonLocalReturnNode) {
        visit(node.expression)
        compiledBlock.emitNonLocalReturn()
    }

    private fun emitGetVariable(node: IdentifierNode) {
        if (currentScope.hasVariable(node.value)
                || currentScope.hasVariableInOuterScopes(node.value)) {
            val variable = currentScope.getVariable(node.value)
            variable.emitGetVariable(compiledBlock, currentScope)
        } else {
            throw UnknownVariable(node.value, node.position)
        }
    }

    private fun emitSetVariable(node: VarAssignmentNode) {
        if (currentScope.hasVariable(node.name)
                || currentScope.hasVariableInOuterScopes(node.name)) {
            val variable = currentScope.getVariable(node.name)
            visit(node.value)
            variable.emitSetVariable(compiledBlock, currentScope)
        } else {
            throw UnknownVariable(node.name, node.position)
        }
    }
}
