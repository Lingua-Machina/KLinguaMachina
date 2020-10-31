package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ExpressionNode

class DoubleLiteralNode(
    position: SourcePosition,

    val value: Double
): ExpressionNode(position)
