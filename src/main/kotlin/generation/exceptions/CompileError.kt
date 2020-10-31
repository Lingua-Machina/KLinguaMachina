package generation.exceptions

import exceptions.KLinguaMachinaException
import parsing.SourcePosition

abstract class CompileError(
    val position: SourcePosition,
    msg: String
): KLinguaMachinaException(msg)
