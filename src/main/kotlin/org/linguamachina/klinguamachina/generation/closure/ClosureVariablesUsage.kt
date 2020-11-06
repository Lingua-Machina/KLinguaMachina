package org.linguamachina.klinguamachina.generation.closure

data class ClosureVariablesUsage(
    val copies: List<String>,
    val copiedRefs: List<String>,
    val refs: List<String>
)
