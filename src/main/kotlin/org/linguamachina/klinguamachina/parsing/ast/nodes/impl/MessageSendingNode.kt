package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parsing.ast.nodes.Selectable

class MessageSendingNode(
    position: SourcePosition,

    val receiver: ExpressionNode,
    val selectors: Selectable
): ExpressionNode(position)
