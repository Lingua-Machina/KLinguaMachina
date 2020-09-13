package generation.exceptions

import parsing.SourcePosition

class VariableAlreadyDeclared(
    name: String,
    position: SourcePosition
): CompileError(name, position, "$position: Variable '$name' is already declared in this scope")
