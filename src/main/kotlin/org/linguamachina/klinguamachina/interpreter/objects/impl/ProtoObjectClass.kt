package org.linguamachina.klinguamachina.interpreter.objects.impl

import org.linguamachina.klinguamachina.interpreter.objects.Instance

private val classFieldNames = arrayOf(
    "superclass"
)

object ProtoObjectClass: Instance(
    ProtoObjectMetaclass,
    Array(classFieldNames.size) { NilPlaceholder },
    emptyArray(),
    classFieldNames,
    mutableMapOf(),
) {
    init {
        ProtoObjectMetaclass.instances += ProtoObjectClass
    }
}
