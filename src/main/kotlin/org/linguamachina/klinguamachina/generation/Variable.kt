package org.linguamachina.klinguamachina.generation

import org.linguamachina.klinguamachina.generation.bytecode.BytecodeEmitter
import org.linguamachina.klinguamachina.generation.impl.*

data class Variable(
    val name: String,
    val isRef: Boolean,
    val index: Int,
    val scope: Scope
) {
    fun emitGetVariable(bytecodeEmitter: BytecodeEmitter, thisScope: Scope) {
        if (isRef) {
            bytecodeEmitter.emitGetRef(index)
        } else {
            when (scope) {
                is GlobalScope   -> bytecodeEmitter.emitGetGlobal(index)
                is ModuleScope   -> if (scope == thisScope)
                                        bytecodeEmitter.emitGetLocal(index)
                                    else
                                        bytecodeEmitter.emitGetModule(index)
                is BlockScope    -> bytecodeEmitter.emitGetLocal(index)
                is ClassScope    -> bytecodeEmitter.emitGetClass(index)
                is InstanceScope -> bytecodeEmitter.emitGetInstance(index)
            }
        }
    }

    fun emitSetVariable(bytecodeEmitter: BytecodeEmitter, thisScope: Scope) {
        if (isRef) {
            bytecodeEmitter.emitSetRef(index)
        } else {
            when (scope) {
                is GlobalScope   -> bytecodeEmitter.emitSetGlobal(index)
                is ModuleScope   -> if (scope == thisScope)
                                        bytecodeEmitter.emitSetLocal(index)
                                    else
                                        bytecodeEmitter.emitSetModule(index)
                is BlockScope    -> bytecodeEmitter.emitSetLocal(index)
                is ClassScope    -> bytecodeEmitter.emitSetClass(index)
                is InstanceScope -> bytecodeEmitter.emitSetInstance(index)
            }
        }
    }
}
