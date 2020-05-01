package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode

class UnaryOperationNode(
    position: NodePosition,

    val receiver: ExpressionNode,
    val op: UnaryOperationOp
): ExpressionNode(position)
