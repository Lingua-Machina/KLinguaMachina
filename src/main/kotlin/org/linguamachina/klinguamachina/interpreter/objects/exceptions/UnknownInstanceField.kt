package org.linguamachina.klinguamachina.interpreter.objects.exceptions

import org.linguamachina.klinguamachina.interpreter.exceptions.KLinguaMachinaRuntimeException

class UnknownInstanceField(val fieldName: String):
        KLinguaMachinaRuntimeException("Unknown instance field '$fieldName'")
