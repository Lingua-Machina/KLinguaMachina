package org.linguamachina.klinguamachina.parser.ast.antlr

import org.antlr.v4.runtime.tree.ParseTree

inline fun <reified T: ParseTree> castANTLRNode(t: ParseTree): T {
    if (t is T) {
        return t
    } else {
        throw TypeCastException("Error while trying to cast ANTLR tree object of class "
                + "${t::class.qualifiedName} to ${T::class.qualifiedName}")
    }
}
