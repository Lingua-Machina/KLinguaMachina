package parsing.ast.nodes.impl

data class NodePosition(
    val line: Int,
    val column: Int,
    val sourceName: String
)
