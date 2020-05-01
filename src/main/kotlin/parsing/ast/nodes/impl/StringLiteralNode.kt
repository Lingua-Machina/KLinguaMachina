package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode

class StringLiteralNode(
    position: NodePosition,

    val value: String
): ExpressionNode(position)
