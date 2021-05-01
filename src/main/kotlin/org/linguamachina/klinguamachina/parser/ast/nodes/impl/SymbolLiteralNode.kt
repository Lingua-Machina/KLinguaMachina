package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode

class SymbolLiteralNode(
    position: SourcePosition,

    val value: String
): ExpressionNode(position)
