package interpreter.block.impl

import interpreter.block.Block

class PrimitiveBlock(
    val name: String,
    arity: Int
): Block(arity)
