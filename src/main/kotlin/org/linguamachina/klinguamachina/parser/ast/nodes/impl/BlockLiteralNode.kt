package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parser.ast.nodes.StatementNode

class BlockLiteralNode(
    position: SourcePosition,

    val paramNames: List<String>,
    var statements: List<StatementNode>
): ExpressionNode(position)
