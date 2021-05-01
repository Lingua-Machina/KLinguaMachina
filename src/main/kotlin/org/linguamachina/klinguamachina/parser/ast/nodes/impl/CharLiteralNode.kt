package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode

class CharLiteralNode(
    position: SourcePosition,

    val value: Char
): ExpressionNode(position)
