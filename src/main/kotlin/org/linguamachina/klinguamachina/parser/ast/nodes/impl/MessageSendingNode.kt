package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parser.ast.nodes.Selectable

class MessageSendingNode(
    position: SourcePosition,

    val receiver: ExpressionNode,
    val selectors: Selectable
): ExpressionNode(position)
