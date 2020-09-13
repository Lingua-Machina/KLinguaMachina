package generation.exceptions

import exceptions.KLinguaMachinaException
import parsing.SourcePosition

abstract class CompileError(
    val name: String,
    val position: SourcePosition,
    msg: String
): KLinguaMachinaException(msg)
