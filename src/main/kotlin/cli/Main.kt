package cli

import cli.repl.Repl
import eval.impl.ASTPrinterEvaluator
import parsing.ast.antlr.AntlrASTBuilder

fun main(vararg args: String) {
    Repl(ASTPrinterEvaluator(), AntlrASTBuilder()).start()
}
