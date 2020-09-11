package eval.impl

import eval.Evaluator
import exceptions.KLinguaMachinaException
import generation.bytecode.impl.ModuleBytecodeCompiler
import interpreter.module.Module
import interpreter.module.impl.BytecodeModule
import parsing.ast.ASTBuilder
import parsing.ast.exceptions.ASTError
import parsing.ast.nodes.impl.RootNode
import parsing.ast.nodes.validateAST
import util.stackTraceString

@ExperimentalUnsignedTypes
class BytecodeEvaluator(
    private val onParseAction: (RootNode) -> Unit,
    private val onCompileAction: (Module) -> Unit
): Evaluator<Unit> {
    override fun eval(input: String, sourceName: String, astBuilder: ASTBuilder) {
        try {
            val ast = astBuilder.build(input, sourceName)
            validateAST(ast)
            onParseAction(ast)
            val module = BytecodeModule(input, sourceName, ast)
            ModuleBytecodeCompiler(module, ast).compile()
            onCompileAction(module)
        } catch (e: KLinguaMachinaException) {
            println(e.localizedMessage)
        } catch (e: Exception) {
            println(e.stackTraceString())
        }
    }
}
