package parsing.ast.nodes

import parsing.ast.nodes.impl.NodePosition

abstract class ExpressionNode(
    position: NodePosition
): ASTNode(position)
