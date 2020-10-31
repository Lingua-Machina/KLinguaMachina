package parsing.ast

import parsing.ast.nodes.impl.RootNode
import parsing.ast.visitors.impl.DesugarClassDeclarations

fun applyASTTransformations(node: RootNode) {
    DesugarClassDeclarations().visit(node)
}
