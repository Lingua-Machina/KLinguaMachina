package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ExpressionNode

class OperationNode(
    position: SourcePosition,

    val expressions: List<ExpressionNode>,
    val op: OperationOp
): ExpressionNode(position)
