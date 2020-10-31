package org.linguamachina.klinguamachina.parsing.ast.nodes

inline fun <reified T: ASTNode> castASTNode(astNode: ASTNode): T {
    if (astNode is T) {
        return astNode
    } else {
        throw TypeCastException("Error while trying to cast object of class "
                + "${astNode::class.qualifiedName} to ${T::class.qualifiedName}")
    }
}
