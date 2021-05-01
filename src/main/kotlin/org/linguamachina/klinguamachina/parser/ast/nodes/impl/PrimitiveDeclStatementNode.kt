package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ExpressionNode
import org.linguamachina.klinguamachina.parser.ast.nodes.StatementNode

class PrimitiveDeclStatementNode(
    position: SourcePosition,

    val receiver: ExpressionNode,
    val keywords: List<String>,
    val paramNames: List<String>,
    val primitiveName: String
): StatementNode(position)
