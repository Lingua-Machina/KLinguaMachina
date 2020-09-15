package interpreter.block.impl

import interpreter.block.BlockLiteralValue

@ExperimentalUnsignedTypes
class ClosureVariableConstant(
    val compiledBlock: CompiledBlock,
    val variableName: String,
    val variableIndex: Int
): BlockLiteralValue {
    override fun toString() = "ref to $variableName in closure ($variableIndex)"
}
