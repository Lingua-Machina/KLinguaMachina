package generation.exceptions

import exceptions.KLinguaMachinaException

abstract class CompileError(msg: String): KLinguaMachinaException(msg)
