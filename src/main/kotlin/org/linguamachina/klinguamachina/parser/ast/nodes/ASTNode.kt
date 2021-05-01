package org.linguamachina.klinguamachina.parser.ast.nodes

import org.linguamachina.klinguamachina.generation.Scope
import org.linguamachina.klinguamachina.parser.SourcePosition

abstract class ASTNode(
    val position: SourcePosition
) {
    var parent: ASTNode? = null
    var scope: Scope? = null
}
