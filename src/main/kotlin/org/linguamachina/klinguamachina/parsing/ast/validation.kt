package org.linguamachina.klinguamachina.parsing.ast

import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.RootNode
import org.linguamachina.klinguamachina.parsing.ast.visitors.impl.ValidateAssignments

fun validateAST(node: RootNode) {
    ValidateAssignments().visit(node)
}
