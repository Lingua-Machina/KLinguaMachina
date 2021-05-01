package org.linguamachina.klinguamachina.eval.impl

import org.linguamachina.klinguamachina.eval.Evaluator
import org.linguamachina.klinguamachina.generation.bytecode.impl.ModuleBytecodeCompiler
import org.linguamachina.klinguamachina.interpreter.context.InterpreterContext
import org.linguamachina.klinguamachina.interpreter.module.impl.BytecodeModule
import org.linguamachina.klinguamachina.parser.ast.ASTBuilder
import org.linguamachina.klinguamachina.parser.ast.transformBaseAST
import org.linguamachina.klinguamachina.parser.ast.validateAST

open class BytecodeEvaluator(
    private val interpreterContext: InterpreterContext,
    private val bytecodeModule: BytecodeModule,
    astBuilder: ASTBuilder,
): Evaluator<Unit>(interpreterContext, astBuilder, bytecodeModule) {

    override fun eval() {
        evalSourceCode(bytecodeModule.sourceCode)
    }

    override fun eval(input: String) {
        evalSourceCode(input)
    }

    private fun evalSourceCode(sourceCode: String) {
        val ast = astBuilder.buildBaseAST(sourceCode, bytecodeModule.sourceName)
        transformBaseAST(ast)
        validateAST(ast)
        ModuleBytecodeCompiler(
            bytecodeModule,
            ast,
            interpreterContext.primitiveRegistry
        ).compile()
        bytecodeModule.sourceCode += "$sourceCode\n"
    }
}
