package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode

class UnaryOperationNode(
    position: SourcePosition,

    val receiver: ExpressionNode,
    val op: UnaryOperationOp
): ExpressionNode(position)
