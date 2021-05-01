package org.linguamachina.klinguamachina.parser.ast.nodes

import org.linguamachina.klinguamachina.parser.SourcePosition

abstract class Selectable(
    position: SourcePosition,

    var selectors: MutableList<Selectable>
): ASTNode(position)
