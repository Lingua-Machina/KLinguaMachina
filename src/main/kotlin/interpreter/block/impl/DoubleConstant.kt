package interpreter.block.impl

import interpreter.block.BlockLiteralValue

class DoubleConstant(val value: Double): BlockLiteralValue {
    override fun toString() = value.toString()
}
