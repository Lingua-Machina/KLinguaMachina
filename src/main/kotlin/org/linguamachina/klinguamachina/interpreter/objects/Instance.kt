package org.linguamachina.klinguamachina.interpreter.objects

import org.linguamachina.klinguamachina.interpreter.block.Block
import org.linguamachina.klinguamachina.interpreter.context.InterpreterContext
import org.linguamachina.klinguamachina.interpreter.objects.exceptions.BadInstanceItemIndex
import org.linguamachina.klinguamachina.interpreter.objects.exceptions.UnknownInstanceField

abstract class Instance(
    var myClass: Instance?,
    var fields: Array<Instance>,
    var items: Array<Instance>,
    var fieldNames: Array<String>,
    val methods: MutableMap<String, Block>
) {
    operator fun get(fieldName: String): Instance =
        fieldNames.indexOf(fieldName).let {
            if (it == -1) {
                throw UnknownInstanceField(fieldName)
            }
            fields[it]
        }

    operator fun set(fieldName: String, value: Instance) {
        if (fieldName in fieldNames) {
            fields[fieldNames.indexOf(fieldName)] = value
        } else {
            throw UnknownInstanceField(fieldName)
        }
    }

    operator fun get(itemIndex: Int): Instance =
        if (itemIndex in items.indices)
            items[itemIndex]
        else
            throw BadInstanceItemIndex(itemIndex)

    operator fun set(itemIndex: Int, value: Instance) {
        if (itemIndex in items.indices) {
            items[itemIndex] = value
        } else {
            throw BadInstanceItemIndex(itemIndex)
        }
    }

    fun ref(fieldName: String): ClassMemberRef =
        if (fieldName in fieldNames)
            ClassFieldRef(this, fieldName)
        else
            throw UnknownInstanceField(fieldName)

    fun ref(itemIndex: Int): ClassMemberRef =
        if (itemIndex in items.indices)
            ClassItemRef(this, itemIndex)
        else
            throw BadInstanceItemIndex(itemIndex)

    fun send(context: InterpreterContext, selector: String, arg: Instance): Instance {
        TODO("Not implemented yet")
    }

    fun send(context: InterpreterContext, selector: String, arg: Int): Instance {
        TODO("Not implemented yet")
    }

    fun send(context: InterpreterContext, selector: String, arg: Double): Instance {
        TODO("Not implemented yet")
    }

    fun send(context: InterpreterContext, selector: String, arg: Boolean): Instance {
        TODO("Not implemented yet")
    }

    fun send(context: InterpreterContext, selector: String, arg: String): Instance {
        TODO("Not implemented yet")
    }

    fun send(context: InterpreterContext, message: Map<String, Any>): Instance {
        TODO("Not implemented yet")
    }
}
