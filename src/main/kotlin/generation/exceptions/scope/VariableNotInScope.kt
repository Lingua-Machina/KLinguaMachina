package generation.exceptions.scope

class VariableNotInScope(
    val name: String
): Exception("Variable '$name' not in scope")
