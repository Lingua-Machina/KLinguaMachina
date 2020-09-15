package interpreter.block.impl

import interpreter.block.BlockLiteralValue

class CharConstant(val value: Char): BlockLiteralValue {
    override fun toString() = "$$value"
}
