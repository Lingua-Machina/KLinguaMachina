package org.linguamachina.klinguamachina.generation.exceptions

import org.linguamachina.klinguamachina.parsing.SourcePosition

class UnknownVariable(
    val name: String,
    position: SourcePosition
): CompileError(position, "$position: Variable '$name' is not declared")
