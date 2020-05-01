package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode
import parsing.ast.nodes.StatementNode

class StatementExprNode(
    position: NodePosition,

    val expression: ExpressionNode
): StatementNode(position)
