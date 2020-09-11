package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode

class OperationNode(
    position: SourcePosition,

    val expressions: List<ExpressionNode>,
    val op: OperationOp
): ExpressionNode(position)
