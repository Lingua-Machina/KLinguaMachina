package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode
import parsing.ast.nodes.StatementNode

class BlockLiteralNode(
    position: NodePosition,

    val paramNames: List<String>,
    val statements: List<StatementNode>
): ExpressionNode(position)
