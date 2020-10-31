package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parsing.ast.nodes.Selectable

class MessageSelectorNode(
    position: SourcePosition,

    val keywords: List<String>,
    val values: MutableList<ExpressionNode>
): Selectable(position, mutableListOf())
