package org.linguamachina.klinguamachina.interpreter.block.impl

import org.linguamachina.klinguamachina.interpreter.block.BlockLiteralValue

class SymbolConstant(val value: String): BlockLiteralValue {
    override fun toString() = "'$value"

    override fun equals(other: Any?): Boolean {
        return if (other is SymbolConstant) {
            value == other.value
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}
