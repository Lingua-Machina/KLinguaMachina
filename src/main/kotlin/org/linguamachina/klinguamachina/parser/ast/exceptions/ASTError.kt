package org.linguamachina.klinguamachina.parser.ast.exceptions

import org.linguamachina.klinguamachina.exceptions.KLinguaMachinaException

abstract class ASTError(msg: String): KLinguaMachinaException(msg)
