package parsing.ast.visitors

import parsing.ast.nodes.*
import parsing.ast.nodes.impl.*

abstract class AbstractBaseASTNodeVisitor<R>: ASTNodeVisitor<R> {
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
        else -> throw IllegalStateException()
    }

    fun visit(node: Selectable) = when (node) {
        is MessageCascadeNode -> visit(node)
        is MessageChainNode -> visit(node)
        is MessageSelectorNode -> visit(node)
        else -> throw IllegalStateException()
    }
}
