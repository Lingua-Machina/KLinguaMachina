package org.linguamachina.klinguamachina.interpreter.objects.impl

import org.linguamachina.klinguamachina.interpreter.objects.Instance

object NilPlaceholder: Instance(
    null,
    emptyArray(),
    emptyArray(),
    emptyArray(),
    mutableMapOf()
) {
    init {
        myClass = this
    }
}
