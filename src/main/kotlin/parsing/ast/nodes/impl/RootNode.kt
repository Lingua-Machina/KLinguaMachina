package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ASTNode
import parsing.ast.nodes.StatementNode

class RootNode(
    position: SourcePosition,

    var statements: List<StatementNode>
): ASTNode(position)
