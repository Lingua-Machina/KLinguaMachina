package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode
import parsing.ast.nodes.StatementNode

class VarDeclarationNode(
    position: NodePosition,

    val name: String,
    val value: ExpressionNode
): StatementNode(position)
