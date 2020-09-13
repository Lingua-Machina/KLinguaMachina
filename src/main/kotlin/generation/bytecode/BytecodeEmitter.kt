package generation.bytecode

interface BytecodeEmitter {
    // Data read
    fun emitGetPool(variableIndex: Int, poolIndex: Int)
    fun emitGetInstance(variableIndex: Int)
    fun emitGetClass(variableIndex: Int)
    fun emitGetLocal(variableIndex: Int)

    // Data write
    fun emitSetPool(variableIndex: Int, poolIndex: Int)
    fun emitSetInstance(variableIndex: Int)
    fun emitSetClass(variableIndex: Int)
    fun emitSetLocal(variableIndex: Int)

    // Message sending
    fun emitSend(selectorIndex: Int)
    fun emitCompile(astNodeIndex: Int)
    fun emitAnd()
    fun emitOr()
    fun emitAdd()
    fun emitMinus()
    fun emitMul()
    fun emitDiv()
    fun emitMod()
    fun emitEq()
    fun emitNeq()
    fun emitLower()
    fun emitLowerEq()
    fun emitGreater()
    fun emitGreaterEq()
    fun emitPos()
    fun emitNeg()
    fun emitNot()

    // Literal values
    fun emitArray(itemCount: Int)
    fun emitSelf()
    fun emitContext()
    fun emitTrue()
    fun emitFalse()
    fun emitNil()
    fun emitConst(constIndex: Int)
    fun emitConstInt(immediateValue: Int)

    // Blocks
    fun emitReturn()
    fun emitNonLocalReturn()

    // Stack manipulation
    fun emitPop()
    fun emitDup()
    fun emitSwap()
}
