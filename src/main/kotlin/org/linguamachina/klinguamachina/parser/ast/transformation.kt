package org.linguamachina.klinguamachina.parser.ast

import org.linguamachina.klinguamachina.parser.ast.nodes.impl.RootNode
import org.linguamachina.klinguamachina.parser.ast.tranformations.DesugarClassDeclarations

fun transformBaseAST(node: RootNode) {
    DesugarClassDeclarations().visit(node)
}
