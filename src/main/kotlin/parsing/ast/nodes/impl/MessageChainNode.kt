package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.Selectable

class MessageChainNode(
    position: SourcePosition,

    selectors: MutableList<Selectable>
): Selectable(position, selectors)
