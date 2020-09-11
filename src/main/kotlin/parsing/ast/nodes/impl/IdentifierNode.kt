package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode

class IdentifierNode(
    position: SourcePosition,

    val value: String
): ExpressionNode(position)
