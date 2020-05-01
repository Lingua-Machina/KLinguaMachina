package parsing.ast.nodes

import parsing.ast.nodes.impl.NodePosition

abstract class Selectable(
    position: NodePosition,

    var selectors: MutableList<Selectable>
): ASTNode(position)
