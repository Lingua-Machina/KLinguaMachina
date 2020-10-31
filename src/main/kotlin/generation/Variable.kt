package generation

import generation.bytecode.BytecodeEmitter
import generation.impl.*

data class Variable(
    val name: String,
    val isRef: Boolean,
    val index: Int,
    val scope: Scope
) {
    fun emitGetVariable(bytecodeEmitter: BytecodeEmitter) {
        if (isRef) {
            bytecodeEmitter.emitGetRef(index)
        } else {
            when (scope) {
                is GlobalScope   -> TODO("Emit get_global")
                // TODO emit get_module when we are in a child scope
                is ModuleScope   -> bytecodeEmitter.emitGetLocal(index)
                is BlockScope    -> bytecodeEmitter.emitGetLocal(index)
                is ClassScope    -> bytecodeEmitter.emitGetClass(index)
                is InstanceScope -> bytecodeEmitter.emitGetInstance(index)
            }
        }
    }

    fun emitSetVariable(bytecodeEmitter: BytecodeEmitter) {
        if (isRef) {
            bytecodeEmitter.emitSetRef(index)
        } else {
            when (scope) {
                is GlobalScope   -> TODO("emit set_global")
                // TODO emit set_module when we are in a child scope
                is ModuleScope   -> bytecodeEmitter.emitSetLocal(index)
                is BlockScope    -> bytecodeEmitter.emitSetLocal(index)
                is ClassScope    -> bytecodeEmitter.emitSetClass(index)
                is InstanceScope -> bytecodeEmitter.emitSetInstance(index)
            }
        }
    }
}
