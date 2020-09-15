package interpreter.block.impl

import interpreter.block.BlockLiteralValue

@ExperimentalUnsignedTypes
class CompiledBlockConstant(val value: CompiledBlock): BlockLiteralValue {
    override fun toString() = "compiled block"
}
