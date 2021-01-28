package org.linguamachina.klinguamachina.interpreter.objects.impl

import org.linguamachina.klinguamachina.interpreter.objects.Instance

private val classFieldNames = arrayOf(
    "superclass"
)

object ProtoObjectMetaclass: Instance(
    NilPlaceholder,
    Array(classFieldNames.size) { NilPlaceholder },
    emptyArray(),
    classFieldNames,
    mutableMapOf()
) {
    val subclasses = mutableListOf<Instance>()
    val instances  = mutableListOf<Instance>()
}
