package org.linguamachina.klinguamachina.parsing.ast

import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.RootNode

interface ASTBuilder {
    fun build(input: String, sourceName: String): RootNode
}
