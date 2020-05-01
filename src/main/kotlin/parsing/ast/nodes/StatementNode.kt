package parsing.ast.nodes

import parsing.ast.nodes.impl.NodePosition

abstract class StatementNode(
    position: NodePosition
): ASTNode(position)
