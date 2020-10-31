package org.linguamachina.klinguamachina.parsing.ast.nodes

import org.linguamachina.klinguamachina.parsing.SourcePosition

abstract class StatementNode(
    position: SourcePosition
): ASTNode(position)
