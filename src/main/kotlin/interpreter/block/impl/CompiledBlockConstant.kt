package interpreter.block.impl

import interpreter.block.BlockLiteralValue

@ExperimentalUnsignedTypes
class CompiledBlockConstant(value: CompiledBlock): BlockLiteralValue(value)
