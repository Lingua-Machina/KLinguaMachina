package org.linguamachina.klinguamachina.interpreter.objects

class ClassItemRef(
    private val instance: Instance,
    private val itemIndex: Int
): ClassMemberRef {
    override var value: Instance
        get() = instance[itemIndex]
        set(value: Instance) {
            instance[itemIndex] = value
        }
}
