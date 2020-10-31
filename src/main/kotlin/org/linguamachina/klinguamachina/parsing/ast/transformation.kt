package org.linguamachina.klinguamachina.parsing.ast

import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.RootNode
import org.linguamachina.klinguamachina.parsing.ast.visitors.impl.DesugarClassDeclarations

fun applyASTTransformations(node: RootNode) {
    DesugarClassDeclarations().visit(node)
}
