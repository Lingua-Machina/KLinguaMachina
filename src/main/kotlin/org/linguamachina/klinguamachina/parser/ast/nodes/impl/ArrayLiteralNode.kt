package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode

class ArrayLiteralNode(
    position: SourcePosition,

    val items: List<ExpressionNode>
): ExpressionNode(position)
