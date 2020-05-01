package parsing.ast.nodes.impl

import parsing.ast.nodes.Selectable

class MessageCascadeNode(
    position: NodePosition,

    selectors: MutableList<Selectable>
): Selectable(position, selectors)
