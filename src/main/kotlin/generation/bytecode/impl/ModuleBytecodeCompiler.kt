package generation.bytecode.impl

import generation.impl.GlobalScope
import generation.impl.ModuleScope
import interpreter.module.Module
import interpreter.module.impl.BytecodeModule
import interpreter.primitive.PrimitiveRegistry
import parsing.ast.nodes.impl.RootNode

@ExperimentalUnsignedTypes
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

    private fun addVariablesToCompiledBlock() {
        moduleScope.variables.forEach {
            module.mainBlock.variables.add(it.name)
        }
    }
}
