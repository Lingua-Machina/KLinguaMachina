package generation.exceptions

import parsing.SourcePosition

class VariableAlreadyDeclared(
    val name: String,
    position: SourcePosition
): CompileError(position, "$position: Variable '$name' is already declared in this scope")
