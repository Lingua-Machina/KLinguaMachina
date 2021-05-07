package org.linguamachina.klinguamachina.parser.ast.validators

import org.linguamachina.klinguamachina.parser.ast.exceptions.NamingError
import org.linguamachina.klinguamachina.parser.ast.nodes.impl.VarAssignmentNode
import org.linguamachina.klinguamachina.parser.ast.nodes.impl.VarDeclarationNode
import org.linguamachina.klinguamachina.parser.ast.BaseASTNodeVisitor

class ValidateAssignments: BaseASTNodeVisitor<Unit> {
    private val specialVariables = listOf(
        "self",
        "thisContext",
        "module"
    )

    override fun defaultValue() = Unit

    override fun visit(node: VarDeclarationNode) {
        if (node.name in specialVariables) {
            throw NamingError(
                "'${node.name}' cannot be on the left hand side of a declaration")
        }
        super.visit(node)
    }

    override fun visit(node: VarAssignmentNode) {
        if (node.name in specialVariables) {
            throw NamingError(
                "'${node.name}' cannot be on the left hand side of an assignment")
        }
        super.visit(node)
    }
}
