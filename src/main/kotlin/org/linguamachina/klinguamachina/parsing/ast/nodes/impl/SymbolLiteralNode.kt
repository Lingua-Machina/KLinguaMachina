package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ExpressionNode

class SymbolLiteralNode(
    position: SourcePosition,

    val value: String
): ExpressionNode(position)
