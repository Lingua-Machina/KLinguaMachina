package org.linguamachina.klinguamachina.generation.exceptions

import org.linguamachina.klinguamachina.parsing.SourcePosition

class VariableAlreadyDeclared(
    val name: String,
    position: SourcePosition
): CompileError(position, "$position: Variable '$name' is already declared in this scope")
