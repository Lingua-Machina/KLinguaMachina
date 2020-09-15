package interpreter.block.impl

import interpreter.block.BlockLiteralValue

class SymbolConstant(val value: String): BlockLiteralValue {
    override fun toString() = "'$value"
}
