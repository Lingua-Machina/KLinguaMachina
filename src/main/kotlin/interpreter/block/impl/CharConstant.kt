package interpreter.block.impl

import interpreter.block.BlockLiteralValue

class CharConstant(value: Char): BlockLiteralValue(value) {
    override fun toString(): String {
        return "$$value"
    }
}
