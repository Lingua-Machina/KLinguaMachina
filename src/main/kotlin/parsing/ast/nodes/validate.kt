package parsing.ast.nodes

import parsing.ast.nodes.impl.RootNode
import parsing.ast.visitors.impl.ValidateNoAssignToSelf

fun validate(node: RootNode) {
    ValidateNoAssignToSelf().visit(node)
}
