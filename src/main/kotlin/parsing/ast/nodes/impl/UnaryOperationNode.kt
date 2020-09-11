package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode

class UnaryOperationNode(
    position: SourcePosition,

    val receiver: ExpressionNode,
    val op: UnaryOperationOp
): ExpressionNode(position)
