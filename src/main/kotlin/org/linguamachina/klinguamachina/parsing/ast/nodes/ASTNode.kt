package org.linguamachina.klinguamachina.parsing.ast.nodes

import org.linguamachina.klinguamachina.generation.Scope
import org.linguamachina.klinguamachina.parsing.SourcePosition

abstract class ASTNode(
    val position: SourcePosition
) {
    var parent: ASTNode? = null
    var scope: Scope? = null
}
