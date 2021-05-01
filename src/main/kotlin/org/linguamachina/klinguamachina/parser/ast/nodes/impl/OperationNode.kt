package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode

class OperationNode(
    position: SourcePosition,

    val expressions: List<ExpressionNode>,
    val op: OperationOp
): ExpressionNode(position)
