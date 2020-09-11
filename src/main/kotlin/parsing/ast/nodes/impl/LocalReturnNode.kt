package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode
import parsing.ast.nodes.StatementNode

class LocalReturnNode(
    position: SourcePosition,

    val expression: ExpressionNode
): StatementNode(position)
