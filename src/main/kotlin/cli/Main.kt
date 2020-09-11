package cli

import cli.repl.Repl
import eval.impl.DebugBytecodeEvaluator
import parsing.ast.antlr.AntlrASTBuilder

@ExperimentalUnsignedTypes
fun main(vararg args: String) {
    Repl(DebugBytecodeEvaluator(), AntlrASTBuilder()).start()
}
