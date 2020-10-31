package generation.exceptions

import parsing.SourcePosition

class UnregisteredPrimitive(
    val name: String,
    position: SourcePosition
): CompileError(position, "$position: Unregistered primitive '$name")
