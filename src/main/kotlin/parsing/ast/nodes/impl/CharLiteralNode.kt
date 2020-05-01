package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode

class CharLiteralNode(
    position: NodePosition,

    val value: Char
): ExpressionNode(position)
