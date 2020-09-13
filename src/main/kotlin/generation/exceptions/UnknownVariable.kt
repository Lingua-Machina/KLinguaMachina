package generation.exceptions

import parsing.SourcePosition

class UnknownVariable(
    name: String,
    position: SourcePosition
): CompileError(name, position, "$position: Variable '$name' is not declared")
