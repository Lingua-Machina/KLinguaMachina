package org.linguamachina.klinguamachina.parser.ast.nodes

import org.linguamachina.klinguamachina.parser.SourcePosition

abstract class ExpressionNode(
    position: SourcePosition
): ASTNode(position)
