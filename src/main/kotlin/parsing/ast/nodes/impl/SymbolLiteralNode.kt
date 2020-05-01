package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode

class SymbolLiteralNode(
    position: NodePosition,

    val value: String
): ExpressionNode(position)
