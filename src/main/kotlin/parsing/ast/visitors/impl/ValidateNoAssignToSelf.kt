package parsing.ast.visitors.impl

import parsing.ast.exceptions.NamingError
import parsing.ast.nodes.impl.VarAssignmentNode
import parsing.ast.nodes.impl.VarDeclarationNode
import parsing.ast.visitors.AbstractBaseASTNodeVisitor

class ValidateNoAssignToSelf: AbstractBaseASTNodeVisitor<Unit>() {
    override fun defaultValue() = Unit

    override fun visit(node: VarDeclarationNode) {
        if (node.name == "self") {
            throw NamingError(
                "'self' cannot be on the left hand side of a declaration")
        }
        super.visit(node)
    }

    override fun visit(node: VarAssignmentNode) {
        if (node.name == "self") {
            throw NamingError(
                "'self' cannot be on the left hand side of an assignment")
        }
        super.visit(node)
    }
}