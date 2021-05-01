package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode

class StringLiteralNode(
    position: SourcePosition,

    val value: String
): ExpressionNode(position)
