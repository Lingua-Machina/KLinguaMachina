package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode

class StringLiteralNode(
    position: SourcePosition,

    val value: String
): ExpressionNode(position)
