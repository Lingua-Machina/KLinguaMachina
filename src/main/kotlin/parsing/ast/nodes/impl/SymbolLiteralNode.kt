package parsing.ast.nodes.impl

import parsing.SourcePosition
import parsing.ast.nodes.ExpressionNode

class SymbolLiteralNode(
    position: SourcePosition,

    val value: String
): ExpressionNode(position)
