package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.Selectable

class MessageCascadeNode(
    position: SourcePosition,

    selectors: MutableList<Selectable>
): Selectable(position, selectors)
