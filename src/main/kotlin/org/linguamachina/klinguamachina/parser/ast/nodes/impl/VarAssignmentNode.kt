package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parser.ast.nodes.StatementNode

class VarAssignmentNode(
    position: SourcePosition,

    val name: String,
    val value: ExpressionNode
): StatementNode(position)
