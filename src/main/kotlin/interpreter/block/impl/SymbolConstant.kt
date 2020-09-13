package interpreter.block.impl

import interpreter.block.BlockLiteralValue

class SymbolConstant(value: String): BlockLiteralValue(value) {
    override fun toString(): String {
        return "'$value"
    }
}
