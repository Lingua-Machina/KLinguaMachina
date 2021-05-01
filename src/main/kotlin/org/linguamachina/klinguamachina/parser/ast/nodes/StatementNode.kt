package org.linguamachina.klinguamachina.parser.ast.nodes

import org.linguamachina.klinguamachina.parser.SourcePosition

abstract class StatementNode(
    position: SourcePosition
): ASTNode(position)
