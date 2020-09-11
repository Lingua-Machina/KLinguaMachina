package parsing.ast.nodes

import parsing.SourcePosition

abstract class ExpressionNode(
    position: SourcePosition
): ASTNode(position)
