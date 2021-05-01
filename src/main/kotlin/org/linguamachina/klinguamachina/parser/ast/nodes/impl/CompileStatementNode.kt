package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parser.ast.nodes.StatementNode

class CompileStatementNode(
    position: SourcePosition,

    val receiver: ExpressionNode,
    val keywords: List<String>,
    val block: BlockLiteralNode
): StatementNode(position)
