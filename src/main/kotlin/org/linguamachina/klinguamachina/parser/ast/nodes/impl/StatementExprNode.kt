package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parser.ast.nodes.StatementNode

class StatementExprNode(
    position: SourcePosition,

    val expression: ExpressionNode
): StatementNode(position)
