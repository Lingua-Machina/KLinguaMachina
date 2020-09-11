package parsing.ast.nodes

import parsing.SourcePosition

abstract class Selectable(
    position: SourcePosition,

    var selectors: MutableList<Selectable>
): ASTNode(position)
