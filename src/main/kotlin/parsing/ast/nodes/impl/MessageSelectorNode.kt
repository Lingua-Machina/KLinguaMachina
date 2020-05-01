package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode
import parsing.ast.nodes.Selectable

class MessageSelectorNode(
    position: NodePosition,

    val keywords: List<String>,
    val values: MutableList<ExpressionNode>
): Selectable(position, mutableListOf())
