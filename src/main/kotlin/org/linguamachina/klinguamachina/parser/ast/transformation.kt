package org.linguamachina.klinguamachina.parser.ast

import org.linguamachina.klinguamachina.parser.ast.nodes.impl.RootNode
import org.linguamachina.klinguamachina.parser.ast.tranformations.AddNodesParent
import org.linguamachina.klinguamachina.parser.ast.tranformations.DesugarClassDeclarations

fun transformBaseAST(node: RootNode) {
    DesugarClassDeclarations().visit(node)
    // Must be run after all the transformations that alter the AST tree structure
    AddNodesParent().visit(node)
}
