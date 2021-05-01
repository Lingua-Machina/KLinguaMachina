package org.linguamachina.klinguamachina.generation.exceptions

import org.linguamachina.klinguamachina.parser.SourcePosition

class UnknownVariable(
    val name: String,
    position: SourcePosition
): CompileError(position, "$position: Variable '$name' is not declared")
