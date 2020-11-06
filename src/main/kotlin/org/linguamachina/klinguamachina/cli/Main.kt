package org.linguamachina.klinguamachina.cli

import org.linguamachina.klinguamachina.cli.repl.Repl
import org.linguamachina.klinguamachina.eval.impl.DebugBytecodeEvaluator
import org.linguamachina.klinguamachina.interpreter.block.impl.PrimitiveBlock
import org.linguamachina.klinguamachina.interpreter.context.InterpreterContext
import org.linguamachina.klinguamachina.interpreter.module.impl.BytecodeModule
import org.linguamachina.klinguamachina.interpreter.primitive.impl.PrimitiveRegistryImpl
import org.linguamachina.klinguamachina.parsing.ast.antlr.AntlrASTBuilder

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
