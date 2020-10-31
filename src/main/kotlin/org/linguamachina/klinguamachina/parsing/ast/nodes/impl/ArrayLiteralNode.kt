package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ExpressionNode

class ArrayLiteralNode(
    position: SourcePosition,

    val items: List<ExpressionNode>
): ExpressionNode(position)
