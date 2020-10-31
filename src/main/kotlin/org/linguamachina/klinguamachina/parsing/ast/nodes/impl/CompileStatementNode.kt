package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parsing.ast.nodes.StatementNode

class CompileStatementNode(
    position: SourcePosition,

    val receiver: ExpressionNode,
    val keywords: List<String>,
    val block: BlockLiteralNode
): StatementNode(position)
