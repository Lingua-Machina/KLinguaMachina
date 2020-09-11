package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode

class CharLiteralNode(
    position: SourcePosition,

    val value: Char
): ExpressionNode(position)
