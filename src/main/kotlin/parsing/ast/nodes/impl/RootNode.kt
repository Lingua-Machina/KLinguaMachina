package parsing.ast.nodes.impl

import parsing.ast.nodes.ASTNode
import parsing.ast.nodes.StatementNode

class RootNode(
    position: NodePosition,

    val statements: List<StatementNode>
): ASTNode(position)
