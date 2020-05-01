package parsing.ast.nodes.impl

import parsing.ast.nodes.Selectable

class MessageChainNode(
    position: NodePosition,

    selectors: MutableList<Selectable>
): Selectable(position, selectors)
