package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parser.ast.nodes.Selectable

class MessageSelectorNode(
    position: SourcePosition,

    val keywords: List<String>,
    val values: MutableList<ExpressionNode>
): Selectable(position, mutableListOf())
