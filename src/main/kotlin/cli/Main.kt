package cli

import cli.repl.Repl
import eval.impl.DebugBytecodeEvaluator
import interpreter.block.impl.PrimitiveBlock
import interpreter.context.InterpreterContext
import interpreter.module.impl.BytecodeModule
import interpreter.primitive.PrimitiveRegistry
import interpreter.primitive.impl.PrimitiveRegistryImpl
import parsing.ast.antlr.AntlrASTBuilder

@ExperimentalUnsignedTypes
fun main(vararg args: String) {
    val fakeInterpreterContext = object : InterpreterContext {
        override val primitiveRegistry = PrimitiveRegistryImpl()
    }
    // Register stubbed primitives for testing
    val primitiveNames = listOf("primitive", "primitive:", "primitive:with:")
    primitiveNames.forEachIndexed { i, name ->
        fakeInterpreterContext.primitiveRegistry.registerPrimitive(
            name, PrimitiveBlock(name, i))
    }
    val bytecodeModule = BytecodeModule.replModule()
    val bytecodeEvaluator = DebugBytecodeEvaluator(
        fakeInterpreterContext,
        AntlrASTBuilder(),
        bytecodeModule)
    val repl = Repl(bytecodeEvaluator)
    repl.start()
}
