package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode
import parsing.ast.nodes.Selectable

class MessageSendingNode(
    position: NodePosition,

    val receiver: ExpressionNode,
    val selectors: Selectable
): ExpressionNode(position)
