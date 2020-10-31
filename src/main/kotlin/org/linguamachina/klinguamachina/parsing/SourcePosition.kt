package org.linguamachina.klinguamachina.parsing

data class SourcePosition(
    val line: Int,
    val column: Int,
    val sourceName: String
) {
    override fun toString() = "$sourceName:($line, $column)"
}
