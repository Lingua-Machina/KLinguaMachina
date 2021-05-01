package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode

class DoubleLiteralNode(
    position: SourcePosition,

    val value: Double
): ExpressionNode(position)
