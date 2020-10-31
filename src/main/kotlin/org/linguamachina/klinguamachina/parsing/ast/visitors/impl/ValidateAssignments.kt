package org.linguamachina.klinguamachina.parsing.ast.visitors.impl

import org.linguamachina.klinguamachina.parsing.ast.exceptions.NamingError
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.VarAssignmentNode
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.VarDeclarationNode
import org.linguamachina.klinguamachina.parsing.ast.visitors.BaseASTNodeVisitor

private const val SELF = "self"
private const val THIS_CONTEXT = "thisContext"

class ValidateAssignments: BaseASTNodeVisitor<Unit> {
    override fun defaultValue() = Unit

    override fun visit(node: VarDeclarationNode) {
        if (node.name == SELF || node.name == THIS_CONTEXT) {
            throw NamingError(
                "'${node.name}' cannot be on the left hand side of a declaration")
        }
        super.visit(node)
    }

    override fun visit(node: VarAssignmentNode) {
        if (node.name == SELF || node.name == THIS_CONTEXT) {
            throw NamingError(
                "'${node.name}' cannot be on the left hand side of an assignment")
        }
        super.visit(node)
    }
}
