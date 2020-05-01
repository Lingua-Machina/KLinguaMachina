package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode

class ArrayLiteralNode(
    position: NodePosition,

    val items: List<ExpressionNode>
): ExpressionNode(position)
