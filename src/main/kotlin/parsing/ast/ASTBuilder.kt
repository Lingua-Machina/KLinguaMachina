package parsing.ast

import parsing.ast.nodes.impl.RootNode

interface ASTBuilder {
    fun build(input: String, sourceName: String): RootNode
}
