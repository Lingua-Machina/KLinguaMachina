package org.linguamachina.klinguamachina.interpreter.block.impl

import org.linguamachina.klinguamachina.interpreter.block.BlockLiteralValue

class CharConstant(val value: Char): BlockLiteralValue {
    override fun toString() = "$$value"

    override fun equals(other: Any?): Boolean {
        return if (other is CharConstant) {
            value == other.value
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}
