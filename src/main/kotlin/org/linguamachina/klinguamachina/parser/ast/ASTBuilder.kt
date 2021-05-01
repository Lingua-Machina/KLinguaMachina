package org.linguamachina.klinguamachina.parser.ast

import org.linguamachina.klinguamachina.parser.ast.nodes.impl.RootNode

interface ASTBuilder {
    fun buildBaseAST(input: String, sourceName: String): RootNode
}
