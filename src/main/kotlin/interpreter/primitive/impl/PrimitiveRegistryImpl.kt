package interpreter.primitive.impl

import interpreter.block.impl.PrimitiveBlock
import interpreter.primitive.PrimitiveRegistry
import interpreter.primitive.UnregisteredPrimitiveAccess

class PrimitiveRegistryImpl: PrimitiveRegistry {
    private val primitives = mutableMapOf<String, PrimitiveBlock>()

    override fun isRegistered(name: String) =
        primitives.containsKey(name)

    override fun registerPrimitive(name: String, primitiveBlock: PrimitiveBlock) {
        primitives[name] = primitiveBlock
    }

    override fun getPrimitive(name: String) =
        primitives[name] ?: throw UnregisteredPrimitiveAccess(name)
}