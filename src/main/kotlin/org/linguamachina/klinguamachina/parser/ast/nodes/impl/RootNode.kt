package org.linguamachina.klinguamachina.parser.ast.nodes.impl

import org.linguamachina.klinguamachina.parser.SourcePosition
import org.linguamachina.klinguamachina.parser.ast.nodes.ASTNode
import org.linguamachina.klinguamachina.parser.ast.nodes.StatementNode

class RootNode(
    position: SourcePosition,

    var statements: List<StatementNode>
): ASTNode(position)
