package org.linguamachina.klinguamachina.parser.ast

import org.linguamachina.klinguamachina.parser.ast.nodes.impl.RootNode
import org.linguamachina.klinguamachina.parser.ast.validators.ValidateAssignments

fun validateAST(node: RootNode) {
    ValidateAssignments().visit(node)
}
