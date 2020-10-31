package generation.exceptions

import parsing.SourcePosition

class UnknownVariable(
    val name: String,
    position: SourcePosition
): CompileError(position, "$position: Variable '$name' is not declared")
