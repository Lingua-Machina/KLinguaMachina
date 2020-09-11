package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode

class DoubleLiteralNode(
    position: SourcePosition,

    val value: Double
): ExpressionNode(position)
