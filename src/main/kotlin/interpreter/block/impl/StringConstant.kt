package interpreter.block.impl

import interpreter.block.BlockLiteralValue

class StringConstant(val value: String): BlockLiteralValue {
    override fun toString() = "\"$value\""
}
