package cli.repl

import eval.Evaluator
import parsing.ast.ASTBuilder

class Repl(val evaluator: Evaluator<String>, val astBuilder: ASTBuilder) {

    private fun mustStop(input: String?) =
        input == null || input == ".exit"

    fun start() {
        println("""
            Welcome in the Lingua Machina REPL!
            Type .exit or hit Ctrl+d to exit :)
            
        """.trimIndent())
        
        // TODO better reading of input
        var input: String?

        do {
            print(">> ")
            input = readLine()
            if (!mustStop(input) && !input!!.isBlank()) {
                println(evaluator.eval(input, "<repl>", astBuilder))
            }
        } while (!mustStop(input))
    }
}
