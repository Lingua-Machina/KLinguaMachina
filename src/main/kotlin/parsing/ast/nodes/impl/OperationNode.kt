package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode

class OperationNode(
    position: NodePosition,

    val expressions: List<ExpressionNode>,
    val op: OperationOp
): ExpressionNode(position)
