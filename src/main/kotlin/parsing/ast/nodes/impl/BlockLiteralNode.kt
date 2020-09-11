package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode
import parsing.ast.nodes.StatementNode

class BlockLiteralNode(
    position: SourcePosition,

    val paramNames: List<String>,
    val statements: List<StatementNode>
): ExpressionNode(position)
