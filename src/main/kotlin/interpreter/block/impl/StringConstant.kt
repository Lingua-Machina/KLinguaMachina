package interpreter.block.impl

import interpreter.block.BlockLiteralValue

class StringConstant(val value: String): BlockLiteralValue {
    override fun toString() = "\"$value\""

    override fun equals(other: Any?): Boolean {
        return if (other is StringConstant) {
            value == other.value
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}
