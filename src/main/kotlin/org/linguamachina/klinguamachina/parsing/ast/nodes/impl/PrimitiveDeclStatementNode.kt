package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parsing.ast.nodes.StatementNode

class PrimitiveDeclStatementNode(
    position: SourcePosition,

    val receiver: ExpressionNode,
    val keywords: List<String>,
    val paramNames: List<String>,
    val primitiveName: String
): StatementNode(position)
