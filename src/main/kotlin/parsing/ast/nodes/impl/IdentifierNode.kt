package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode

class IdentifierNode(
    position: NodePosition,

    val value: String
): ExpressionNode(position)
