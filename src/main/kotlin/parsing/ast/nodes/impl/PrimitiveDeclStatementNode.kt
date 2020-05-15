package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode
import parsing.ast.nodes.StatementNode

class PrimitiveDeclStatementNode(
    position: NodePosition,

    val receiver: ExpressionNode,
    val keywords: List<String>,
    val paramNames: List<String>,
    val primitiveName: String
): StatementNode(position)
