package parsing.ast

import parsing.ast.nodes.ASTNode

interface ASTBuilder {
    fun build(input: String, sourceName: String): ASTNode
}
