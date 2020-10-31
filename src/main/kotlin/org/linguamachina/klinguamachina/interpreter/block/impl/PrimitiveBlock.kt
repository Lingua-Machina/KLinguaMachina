package org.linguamachina.klinguamachina.interpreter.block.impl

import org.linguamachina.klinguamachina.interpreter.block.Block

class PrimitiveBlock(
    val name: String,
    arity: Int
): Block(arity)
