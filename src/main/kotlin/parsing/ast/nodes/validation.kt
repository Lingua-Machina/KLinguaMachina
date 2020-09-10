package parsing.ast.nodes

import parsing.ast.nodes.impl.RootNode
import parsing.ast.visitors.impl.ValidateAssignments

fun validateAST(node: RootNode) {
    ValidateAssignments().visit(node)
}
