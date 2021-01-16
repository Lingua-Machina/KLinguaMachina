package org.linguamachina.klinguamachina.interpreter.module.impl

import org.linguamachina.klinguamachina.interpreter.block.impl.CompiledBlock
import org.linguamachina.klinguamachina.interpreter.module.Module
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.CompileStatementNode

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
            BytecodeModule("<test:$testId>", testInput)
    }

    override fun toString(): String {
        return "Module $sourceName\n\n$mainBlock"
    }
}
