package org.linguamachina.klinguamachina.parsing.ast.nodes.impl

import org.linguamachina.klinguamachina.parsing.SourcePosition
import org.linguamachina.klinguamachina.parsing.ast.nodes.ASTNode
import org.linguamachina.klinguamachina.parsing.ast.nodes.StatementNode

class RootNode(
    position: SourcePosition,

    var statements: List<StatementNode>
): ASTNode(position)
