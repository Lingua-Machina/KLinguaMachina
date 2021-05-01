package org.linguamachina.klinguamachina.parsing.ast

import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.*

interface ASTNodeVisitor<R> {
    fun visit(node: ArrayLiteralNode): R

    fun visit(node: BlockLiteralNode): R

    fun visit(node: CharLiteralNode): R

    fun visit(node: CompileStatementNode): R

    fun visit(node: PrimitiveDeclStatementNode): R

    fun visit(node: DoubleLiteralNode): R

    fun visit(node: IdentifierNode): R

    fun visit(node: IntegerLiteralNode): R

    fun visit(node: LocalReturnNode): R

    fun visit(node: MessageCascadeNode): R

    fun visit(node: MessageChainNode): R

    fun visit(node: MessageSelectorNode): R

    fun visit(node: MessageSendingNode): R

    fun visit(node: NonLocalReturnNode): R

    fun visit(node: OperationNode): R

    fun visit(node: RootNode): R

    fun visit(node: StatementExprNode): R

    fun visit(node: StringLiteralNode): R

    fun visit(node: SymbolLiteralNode): R

    fun visit(node: UnaryOperationNode): R

    fun visit(node: VarAssignmentNode): R

    fun visit(node: VarDeclarationNode): R
}
