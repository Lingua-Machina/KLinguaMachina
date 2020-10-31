package org.linguamachina.klinguamachina.eval.impl

import org.linguamachina.klinguamachina.eval.Evaluator
import org.linguamachina.klinguamachina.generation.bytecode.impl.ModuleBytecodeCompiler
import org.linguamachina.klinguamachina.interpreter.context.InterpreterContext
import org.linguamachina.klinguamachina.interpreter.module.impl.BytecodeModule
import org.linguamachina.klinguamachina.parsing.ast.ASTBuilder
import org.linguamachina.klinguamachina.parsing.ast.applyASTTransformations
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.RootNode
import org.linguamachina.klinguamachina.parsing.ast.validateAST

@ExperimentalUnsignedTypes
open class BytecodeEvaluator(
    val interpreterContext: InterpreterContext,
    astBuilder: ASTBuilder,
    val bytecodeModule: BytecodeModule,
    private val onParseAction: (RootNode) -> Unit = {},
    private val onCompileAction: (BytecodeModule) -> Unit = {}
): Evaluator<Unit>(interpreterContext, astBuilder, bytecodeModule) {

    override fun eval() {
        evalSourceCode(bytecodeModule.sourceCode)
    }

    override fun eval(input: String) {
        evalSourceCode(input)
    }

    private fun evalSourceCode(sourceCode: String) {
        val ast = astBuilder.build(sourceCode, bytecodeModule.sourceName)
        applyASTTransformations(ast)
        validateAST(ast)
        onParseAction(ast)
        ModuleBytecodeCompiler(
            bytecodeModule,
            ast,
            interpreterContext.primitiveRegistry
        ).compile()
        onCompileAction(bytecodeModule)
        bytecodeModule.sourceCode += "$sourceCode\n"
    }
}
