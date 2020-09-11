package interpreter.block.impl

import generation.LiteralStorage
import generation.VariableStorage
import generation.bytecode.BytecodeEmitter
import generation.bytecode.BytecodeStorage
import generation.bytecode.Bytecode
import generation.bytecode.Bytecode.*
import interpreter.block.Block

@ExperimentalUnsignedTypes
class CompiledBlock: Block, BytecodeEmitter, BytecodeStorage, LiteralStorage, VariableStorage {
    override val literalMap = mutableMapOf<Any, Int>()
    override val variableMap = mutableMapOf<String, Int>()
    override val bytecodes = mutableListOf<UInt>()

    private fun appendBytecode(bytecode: Bytecode) {
        bytecodes += bytecode.ordinal.toUInt()
    }

    private fun appendImmediate(immediateValue: Int) {
        bytecodes += immediateValue.toUInt()
    }

    override fun emitGetPool(variableIndex: Int, poolIndex: Int) {
        appendBytecode(GET_POOL)
        appendImmediate(variableIndex)
        appendImmediate(poolIndex)
    }

    override fun emitGetInstance(variableIndex: Int) {
        appendBytecode(GET_INSTANCE)
        appendImmediate(variableIndex)
    }

    override fun emitGetClass(variableIndex: Int) {
        appendBytecode(GET_CLASS)
        appendImmediate(variableIndex)
    }

    override fun emitGetLocal(variableIndex: Int) {
        appendBytecode(GET_LOCAL)
        appendImmediate(variableIndex)
    }

    override fun emitSetPool(variableIndex: Int, poolIndex: Int) {
        appendBytecode(SET_POOL)
        appendImmediate(variableIndex)
        appendImmediate(poolIndex)
    }

    override fun emitSetInstance(variableIndex: Int) {
        appendBytecode(SET_INSTANCE)
        appendImmediate(variableIndex)
    }

    override fun emitSetClass(variableIndex: Int) {
        appendBytecode(SET_CLASS)
        appendImmediate(variableIndex)
    }

    override fun emitSetLocal(variableIndex: Int) {
        appendBytecode(SET_LOCAL)
        appendImmediate(variableIndex)
    }

    override fun emitSend(selectorIndex: Int) {
        appendBytecode(SEND)
        appendImmediate(selectorIndex)
    }

    override fun emitCompile(astNodeIndex: Int) {
        appendBytecode(COMPILE)
        appendImmediate(astNodeIndex)
    }

    override fun emitAnd() {
        appendBytecode(AND)
    }

    override fun emitOr() {
        appendBytecode(OR)
    }

    override fun emitAdd() {
        appendBytecode(ADD)
    }

    override fun emitMinus() {
        appendBytecode(MINUS)
    }

    override fun emitMul() {
        appendBytecode(MUL)
    }

    override fun emitDiv() {
        appendBytecode(DIV)
    }

    override fun emitMod() {
        appendBytecode(MOD)
    }

    override fun emitEq() {
        appendBytecode(EQ)
    }

    override fun emitNeq() {
        appendBytecode(NEQ)
    }

    override fun emitLower() {
        appendBytecode(LOWER)
    }

    override fun emitLowerEq() {
        appendBytecode(LOWER_EQ)
    }

    override fun emitGreater() {
        appendBytecode(GREATER)
    }

    override fun emitGreaterEq() {
        appendBytecode(GREATER_EQ)
    }

    override fun emitNeg() {
        appendBytecode(NEG)
    }

    override fun emitNot() {
        appendBytecode(NOT)
    }

    override fun emitArray(itemCount: Int) {
        appendBytecode(ARRAY)
        appendImmediate(itemCount)
    }

    override fun emitSelf() {
        appendBytecode(SELF)
    }

    override fun emitContext() {
        appendBytecode(CONTEXT)
    }

    override fun emitTrue() {
        appendBytecode(TRUE)
    }

    override fun emitFalse() {
        appendBytecode(FALSE)
    }

    override fun emitNil() {
        appendBytecode(NIL)
    }

    override fun emitConst(constIndex: Int) {
        appendBytecode(CONST)
        appendImmediate(constIndex)
    }

    override fun emitConstInt(immediateValue: Int) {
        appendBytecode(CONST_INT)
        appendImmediate(immediateValue)
    }

    override fun emitReturn() {
        appendBytecode(RETURN)
    }

    override fun emitNonLocalReturn() {
        appendBytecode(NON_LOCAL_RETURN)
    }

    override fun emitPop() {
        appendBytecode(POP)
    }

    override fun emitDup() {
        appendBytecode(DUP)
    }

    override fun emitSwap() {
        appendBytecode(SWAP)
    }

    override fun toString(): String {
        var out = "code:\n"
        var bytecodeIndex = 0
        var immediateArgIndex = 0

        while (bytecodeIndex < bytecodes.size) {
            val bytecode = Bytecode.values()[bytecodes[bytecodeIndex].toInt()]
            out += "$bytecodeIndex: ${bytecode.name.toLowerCase()}"
            bytecodeIndex++
            immediateArgIndex = 0
            while (immediateArgIndex < bytecode.immediateArgsCount) {
                out += " ${bytecodes[bytecodeIndex + immediateArgIndex]}"
                immediateArgIndex++
            }
            bytecodeIndex += bytecode.immediateArgsCount
            out += "\n"
        }

        out += "\nliterals:\n"
        for (entry in literalMap) {
            out += "${entry.value}: ${entry.key}\n"
        }

        out += "\nvariables:\n"
        for (entry in variableMap) {
            out += "${entry.value}: ${entry.key}\n"
        }

        return out
    }
}
