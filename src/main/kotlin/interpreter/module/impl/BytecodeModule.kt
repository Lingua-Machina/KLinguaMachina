package interpreter.module.impl

import interpreter.block.impl.CompiledBlock
import interpreter.module.Module
import parsing.ast.nodes.impl.CompileStatementNode

@ExperimentalUnsignedTypes
class BytecodeModule(
    override val sourceName: String,
    var sourceCode: String = ""
): Module {
    override val mainBlock = CompiledBlock(0)
    override val compileNodes = mutableListOf<CompileStatementNode>()

    companion object {
        fun fromFile(filePath: String): BytecodeModule {
            TODO("Implement module loading from files")
        }

        fun replModule(): BytecodeModule =
            BytecodeModule("<repl>")

        fun testModule(testId: Int, testInput: String = ""): BytecodeModule =
            BytecodeModule("<test$testId>", testInput)
    }

    override fun toString(): String {
        return "Module $sourceName\n\n$mainBlock"
    }
}
