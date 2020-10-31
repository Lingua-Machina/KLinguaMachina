package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ExpressionNode

class IntegerLiteralNode(
    position: SourcePosition,

    val value: Int
): ExpressionNode(position)
