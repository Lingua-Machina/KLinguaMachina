package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parsing.ast.nodes.StatementNode

class BlockLiteralNode(
    position: SourcePosition,

    val paramNames: List<String>,
    var statements: List<StatementNode>
): ExpressionNode(position)
