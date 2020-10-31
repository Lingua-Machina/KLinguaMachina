package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.Selectable

class MessageChainNode(
    position: SourcePosition,

    selectors: MutableList<Selectable>
): Selectable(position, selectors)
