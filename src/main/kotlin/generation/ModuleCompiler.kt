package generation

import interpreter.module.Module
import parsing.ast.nodes.impl.RootNode

abstract class ModuleCompiler(val astRootNode: RootNode) {
    abstract fun compile(): Module
}
