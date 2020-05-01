package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode

class IntegerLiteralNode(
    position: NodePosition,

    val value: Int
): ExpressionNode(position)
