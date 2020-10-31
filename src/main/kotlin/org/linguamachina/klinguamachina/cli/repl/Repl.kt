package org.linguamachina.klinguamachina.cli.repl

import org.linguamachina.klinguamachina.eval.Evaluator
import org.linguamachina.klinguamachina.exceptions.KLinguaMachinaException
import org.linguamachina.klinguamachina.util.stackTraceString

class Repl(
    private val evaluator: Evaluator<Unit>
) {
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
                try {
                    evaluator.eval(input)
                } catch (e: KLinguaMachinaException) {
                    println(e.localizedMessage)
                } catch (e: Exception) {
                    println(e.stackTraceString())
                }
            }
        } while (!mustStop(input))
    }
}
