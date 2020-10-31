package org.linguamachina.klinguamachina.generation.exceptions.scope

class VariableAlreadyInScope(
    val name: String
): Exception("Variable '$name' already in scope")
