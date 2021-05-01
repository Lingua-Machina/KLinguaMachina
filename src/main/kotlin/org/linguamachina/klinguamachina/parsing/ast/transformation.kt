package org.linguamachina.klinguamachina.parsing.ast

import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.RootNode
import org.linguamachina.klinguamachina.parsing.ast.tranformations.DesugarClassDeclarations

fun transformBaseAST(node: RootNode) {
    DesugarClassDeclarations().visit(node)
}
