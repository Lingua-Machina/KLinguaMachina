package org.linguamachina.klinguamachina.interpreter.objects

class ClassFieldRef(
    private val instance: Instance,
    private val fieldName: String
): ClassMemberRef {
    override var value: Instance
        get() = instance[fieldName]
        set(value: Instance) {
            instance[fieldName] = value
        }
}
