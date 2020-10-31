package org.linguamachina.klinguamachina.generation.exceptions

import org.linguamachina.klinguamachina.exceptions.KLinguaMachinaException
import org.linguamachina.klinguamachina.parsing.SourcePosition

abstract class CompileError(
    val position: SourcePosition,
    msg: String
): KLinguaMachinaException(msg)
