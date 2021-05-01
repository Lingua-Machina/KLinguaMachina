package org.linguamachina.klinguamachina.generation.exceptions

import org.linguamachina.klinguamachina.parser.SourcePosition

class UnregisteredPrimitive(
    val name: String,
    position: SourcePosition
): CompileError(position, "$position: Unregistered primitive '$name")
