package interpreter.primitive

import interpreter.block.impl.PrimitiveBlock

interface PrimitiveRegistry {
    fun isRegistered(name: String): Boolean
    fun registerPrimitive(name: String, primitiveBlock: PrimitiveBlock)
    fun getPrimitive(name: String): PrimitiveBlock
}
