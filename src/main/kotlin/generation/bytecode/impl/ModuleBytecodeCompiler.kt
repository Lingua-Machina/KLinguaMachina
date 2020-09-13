package generation.bytecode.impl

import generation.bytecode.AbstractBytecodeCompiler
import interpreter.module.impl.BytecodeModule
import parsing.ast.nodes.impl.RootNode

@ExperimentalUnsignedTypes
class ModuleBytecodeCompiler(
    module: BytecodeModule,
    astRootNode: RootNode
): AbstractBytecodeCompiler(module, astRootNode) {
}
