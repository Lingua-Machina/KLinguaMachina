package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode
import parsing.ast.nodes.StatementNode

class VarAssignmentNode(
    position: SourcePosition,

    val name: String,
    val value: ExpressionNode
): StatementNode(position)
