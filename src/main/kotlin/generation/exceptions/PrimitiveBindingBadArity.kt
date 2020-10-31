package generation.exceptions

import parsing.SourcePosition

class PrimitiveBindingBadArity(
    val selector: String,
    val primitiveName: String,
    position: SourcePosition
): CompileError(position, "$position: The selector has not the same arity as the bound primitive")
