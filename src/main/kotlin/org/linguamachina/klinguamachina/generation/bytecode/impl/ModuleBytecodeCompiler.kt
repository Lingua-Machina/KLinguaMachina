package org.linguamachina.klinguamachina.generation.bytecode.impl

import org.linguamachina.klinguamachina.generation.impl.GlobalScope
import org.linguamachina.klinguamachina.generation.impl.ModuleScope
import org.linguamachina.klinguamachina.interpreter.module.Module
import org.linguamachina.klinguamachina.interpreter.module.impl.BytecodeModule
import org.linguamachina.klinguamachina.interpreter.primitive.PrimitiveRegistry
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.RootNode

class ModuleBytecodeCompiler(
    private val module: BytecodeModule,
    astRootNode: RootNode,
    primitiveRegistry: PrimitiveRegistry
): AbstractBytecodeCompiler<Module>(
        astRootNode, GlobalScope(), module.mainBlock, primitiveRegistry) {

    private val moduleScope = ModuleScope()

    override fun compile(): Module {
        enterScope(moduleScope)
        visit(astRootNode as RootNode)
        leaveScope()

        addVariablesToCompiledBlock()

        return module
    }

    override fun visit(node: RootNode) {
        // Remove module returns in case we append code to an already existing one
        compiledBlock.removeModuleReturns()
        super.visit(node)
        // A module returns nothing
        compiledBlock.addNonLocalModuleReturn()
    }

    private fun addVariablesToCompiledBlock() {
        moduleScope.variables.forEach {
            module.mainBlock.variables.add(it.name)
        }
    }
}
