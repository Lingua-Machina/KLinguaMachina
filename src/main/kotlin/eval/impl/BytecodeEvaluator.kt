package eval.impl

import eval.Evaluator
import generation.bytecode.impl.ModuleBytecodeCompiler
import interpreter.context.InterpreterContext
import interpreter.module.impl.BytecodeModule
import parsing.ast.ASTBuilder
import parsing.ast.applyASTTransformations
import parsing.ast.nodes.impl.RootNode
import parsing.ast.validateAST

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
