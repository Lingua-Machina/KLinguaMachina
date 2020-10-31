package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ExpressionNode

class UnaryOperationNode(
    position: SourcePosition,

    val receiver: ExpressionNode,
    val op: UnaryOperationOp
): ExpressionNode(position)
