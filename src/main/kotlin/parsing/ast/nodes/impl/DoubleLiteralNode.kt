package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode

class DoubleLiteralNode(
    position: NodePosition,

    val value: Double
): ExpressionNode(position)
