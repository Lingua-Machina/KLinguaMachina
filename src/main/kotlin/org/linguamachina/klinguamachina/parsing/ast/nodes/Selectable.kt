package org.linguamachina.klinguamachina.parsing.ast.nodes

import org.linguamachina.klinguamachina.parsing.SourcePosition

abstract class Selectable(
    position: SourcePosition,

    var selectors: MutableList<Selectable>
): ASTNode(position)
