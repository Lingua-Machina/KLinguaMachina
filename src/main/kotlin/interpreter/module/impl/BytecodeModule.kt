package interpreter.module.impl

import interpreter.block.impl.CompiledBlock
import interpreter.module.Module
import parsing.ast.nodes.impl.CompileStatementNode
import parsing.ast.nodes.impl.RootNode

@ExperimentalUnsignedTypes
class BytecodeModule(
    val input: String,
    override val sourceName: String,
    val astRootNode: RootNode
): Module {
    override val mainBlock = CompiledBlock()
    override val compileNodes = mutableListOf<CompileStatementNode>()

    override fun toString(): String {
        return "Module $sourceName\n\n$mainBlock"
    }
}
