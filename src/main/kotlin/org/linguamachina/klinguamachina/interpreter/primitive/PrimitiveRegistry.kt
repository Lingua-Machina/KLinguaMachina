package org.linguamachina.klinguamachina.interpreter.primitive

import org.linguamachina.klinguamachina.interpreter.block.impl.PrimitiveBlock

interface PrimitiveRegistry {
    fun isRegistered(name: String): Boolean
    fun registerPrimitive(name: String, primitiveBlock: PrimitiveBlock)
    fun getPrimitive(name: String): PrimitiveBlock
}
