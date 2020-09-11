package parsing.ast.exceptions

import exceptions.KLinguaMachinaException

abstract class ASTError(msg: String): KLinguaMachinaException(msg)
