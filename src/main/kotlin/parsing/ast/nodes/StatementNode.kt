package parsing.ast.nodes

import parsing.SourcePosition

abstract class StatementNode(
    position: SourcePosition
): ASTNode(position)
