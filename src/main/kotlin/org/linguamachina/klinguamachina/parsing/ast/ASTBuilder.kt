package org.linguamachina.klinguamachina.parsing.ast

import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.RootNode

interface ASTBuilder {
    fun buildBaseAST(input: String, sourceName: String): RootNode
}
