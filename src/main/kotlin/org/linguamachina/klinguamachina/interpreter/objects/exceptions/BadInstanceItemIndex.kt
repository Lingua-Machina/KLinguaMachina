package org.linguamachina.klinguamachina.interpreter.objects.exceptions

import org.linguamachina.klinguamachina.interpreter.exceptions.KLinguaMachinaRuntimeException

class BadInstanceItemIndex(val itemIndex: Int):
        KLinguaMachinaRuntimeException("Bad instance item index '$itemIndex'")
