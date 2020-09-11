package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode

class IntegerLiteralNode(
    position: SourcePosition,

    val value: Int
): ExpressionNode(position)
