package org.linguamachina.klinguamachina.interpreter.block.impl

import org.linguamachina.klinguamachina.interpreter.block.BlockLiteralValue

class DoubleConstant(val value: Double): BlockLiteralValue {
    override fun toString() = value.toString()

    override fun equals(other: Any?): Boolean {
        return if (other is DoubleConstant) {
            value == other.value
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}
