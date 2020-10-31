package org.linguamachina.klinguamachina.interpreter.primitive.impl

import org.linguamachina.klinguamachina.interpreter.block.impl.PrimitiveBlock
import org.linguamachina.klinguamachina.interpreter.primitive.PrimitiveRegistry
import org.linguamachina.klinguamachina.interpreter.primitive.UnregisteredPrimitiveAccess

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