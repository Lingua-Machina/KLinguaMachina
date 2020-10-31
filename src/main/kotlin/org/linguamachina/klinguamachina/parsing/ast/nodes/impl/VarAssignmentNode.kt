package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parsing.ast.nodes.StatementNode

class VarAssignmentNode(
    position: SourcePosition,

    val name: String,
    val value: ExpressionNode
): StatementNode(position)
