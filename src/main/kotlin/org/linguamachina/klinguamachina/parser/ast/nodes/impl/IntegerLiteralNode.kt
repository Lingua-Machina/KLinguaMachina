package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode

class IntegerLiteralNode(
    position: SourcePosition,

    val value: Int
): ExpressionNode(position)
