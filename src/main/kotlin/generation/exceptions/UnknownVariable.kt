package generation.exceptions

import parsing.SourcePosition

class UnknownVariable(
    val name: String,
    val position: SourcePosition
): CompileError("$position: Variable '$name' is not declared")
