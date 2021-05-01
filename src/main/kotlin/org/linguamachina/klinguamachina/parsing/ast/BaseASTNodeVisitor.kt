package org.linguamachina.klinguamachina.parsing.ast

import org.linguamachina.klinguamachina.parsing.ast.nodes.*
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.*

interface BaseASTNodeVisitor<R>: ASTNodeVisitor<R> {
    fun defaultValue(): R

    fun visit(node: ExpressionNode) = when (node) {
        is ArrayLiteralNode -> visit(node)
        is BlockLiteralNode -> visit(node)
        is CharLiteralNode -> visit(node)
        is DoubleLiteralNode -> visit(node)
        is IdentifierNode -> visit(node)
        is IntegerLiteralNode -> visit(node)
        is MessageSendingNode -> visit(node)
        is OperationNode -> visit(node)
        is StringLiteralNode -> visit(node)
        is SymbolLiteralNode -> visit(node)
        is UnaryOperationNode -> visit(node)
        else -> throw IllegalStateException()
    }

    fun visit(node: StatementNode) = when (node) {
        is VarDeclarationNode -> visit(node)
        is VarAssignmentNode -> visit(node)
        is StatementExprNode -> visit(node)
        is LocalReturnNode -> visit(node)
        is NonLocalReturnNode -> visit(node)
        is CompileStatementNode -> visit(node)
        is PrimitiveDeclStatementNode -> visit(node)
        else -> throw IllegalStateException()
    }

    fun visit(node: Selectable) = when (node) {
        is MessageCascadeNode -> visit(node)
        is MessageChainNode -> visit(node)
        is MessageSelectorNode -> visit(node)
        else -> throw IllegalStateException()
    }

    override fun visit(node: ArrayLiteralNode): R {
        node.items.forEach { visit(it) }
        return defaultValue()
    }

    override fun visit(node: BlockLiteralNode): R {
        node.statements.forEach { visit(it) }
        return defaultValue()
    }

    override fun visit(node: CharLiteralNode): R {
        return defaultValue()
    }

    override fun visit(node: CompileStatementNode): R {
        visit(node.receiver)
        visit(node.block)
        return defaultValue()
    }

    override fun visit(node: PrimitiveDeclStatementNode): R {
        visit(node.receiver)
        return defaultValue()
    }

    override fun visit(node: DoubleLiteralNode): R {
        return defaultValue()
    }

    override fun visit(node: IdentifierNode): R {
        return defaultValue()
    }

    override fun visit(node: IntegerLiteralNode): R {
        return defaultValue()
    }

    override fun visit(node: LocalReturnNode): R {
        visit(node.expression)
        return defaultValue()
    }

    override fun visit(node: MessageCascadeNode): R {
        node.selectors.forEach { visit(it) }
        return defaultValue()
    }

    override fun visit(node: MessageChainNode): R {
        node.selectors.forEach { visit(it) }
        return defaultValue()
    }

    override fun visit(node: MessageSelectorNode): R {
        node.selectors.forEach { visit(it) }
        node.values.forEach { visit(it) }
        return defaultValue()
    }

    override fun visit(node: MessageSendingNode): R {
        visit(node.receiver)
        visit(node.selectors)
        return defaultValue()
    }

    override fun visit(node: NonLocalReturnNode): R {
        visit(node.expression)
        return defaultValue()
    }

    override fun visit(node: OperationNode): R {
        node.expressions.forEach { visit(it) }
        return defaultValue()
    }

    override fun visit(node: RootNode): R {
        node.statements.forEach { visit(it) }
        return defaultValue()
    }

    override fun visit(node: StatementExprNode): R {
        visit(node.expression)
        return defaultValue()
    }

    override fun visit(node: StringLiteralNode): R {
        return defaultValue()
    }

    override fun visit(node: SymbolLiteralNode): R {
        return defaultValue()
    }

    override fun visit(node: UnaryOperationNode): R {
        visit(node.receiver)
        return defaultValue()
    }

    override fun visit(node: VarAssignmentNode): R {
        visit(node.value)
        return defaultValue()
    }

    override fun visit(node: VarDeclarationNode): R {
        visit(node.value)
        return defaultValue()
    }
}
