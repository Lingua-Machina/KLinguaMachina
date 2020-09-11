package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode
import parsing.ast.nodes.Selectable

class MessageSelectorNode(
    position: SourcePosition,

    val keywords: List<String>,
    val values: MutableList<ExpressionNode>
): Selectable(position, mutableListOf())
