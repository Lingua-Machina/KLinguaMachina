package org.linguamachina.klinguamachina.eval.impl

import org.linguamachina.klinguamachina.eval.Evaluator
import org.linguamachina.klinguamachina.generation.bytecode.impl.ModuleBytecodeCompiler
import org.linguamachina.klinguamachina.interpreter.context.InterpreterContext
import org.linguamachina.klinguamachina.interpreter.module.impl.BytecodeModule
import org.linguamachina.klinguamachina.parsing.ast.ASTBuilder
import org.linguamachina.klinguamachina.parsing.ast.transformBaseAST
import org.linguamachina.klinguamachina.parsing.ast.nodes.castASTNode
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.RootNode
import org.linguamachina.klinguamachina.parsing.ast.validateAST
import org.linguamachina.klinguamachina.parsing.ast.printers.ASTNodePrinter

class DebugBytecodeEvaluator(
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

        // Print the AST
        println(ASTNodePrinter().visit(castASTNode<RootNode>(ast)))

        ModuleBytecodeCompiler(
            bytecodeModule,
            ast,
            interpreterContext.primitiveRegistry
        ).compile()
        bytecodeModule.sourceCode += "$sourceCode\n"

        // Print the module bytecode
        println(bytecodeModule)
    }
}
