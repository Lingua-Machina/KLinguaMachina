package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode

class ArrayLiteralNode(
    position: SourcePosition,

    val items: List<ExpressionNode>
): ExpressionNode(position)
