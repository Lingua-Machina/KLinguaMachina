package org.linguamachina.klinguamachina.generation.bytecode

import org.linguamachina.klinguamachina.eval.impl.BytecodeEvaluator
import org.linguamachina.klinguamachina.generation.exceptions.PrimitiveBindingBadArity
import org.linguamachina.klinguamachina.generation.exceptions.UnregisteredPrimitive
import org.linguamachina.klinguamachina.interpreter.block.impl.PrimitiveBlock
import org.linguamachina.klinguamachina.interpreter.context.InterpreterContext
import org.linguamachina.klinguamachina.interpreter.module.impl.BytecodeModule
import org.linguamachina.klinguamachina.interpreter.primitive.impl.PrimitiveRegistryImpl
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.linguamachina.klinguamachina.parsing.ast.antlr.AntlrASTBuilder

internal class ModuleBytecodeCompilerPrimitiveBindingTest {
    private var TEST_ID = 0
        get() = ++field

    private val PRIMITIVE_NAME = "primitive"

    private fun getFakeInterpreterContext() =
        object : InterpreterContext {
            override val primitiveRegistry = PrimitiveRegistryImpl()
        }

    @Test
    fun `Don't bind unregistered primitive`() {
        val fakeInterpreterContext = getFakeInterpreterContext()
        val bytecodeModule = BytecodeModule.testModule(TEST_ID)
        val bytecodeEvaluator = BytecodeEvaluator(
            fakeInterpreterContext,
            AntlrASTBuilder(),
            bytecodeModule)

        assertThrows<UnregisteredPrimitive> {
            // TODO remove 'Object := 1337 class' stub
            bytecodeEvaluator.eval("""
                Object := 1337 class;
                Object subclass: 'Test instanceVars: [];
                
                Test :: primitive = '$PRIMITIVE_NAME
            """.trimIndent())
        }
    }

    @Test
    fun `Don't bind non-matching arity primitives`() {
        val fakeInterpreterContext = getFakeInterpreterContext()
        val bytecodeModule = BytecodeModule.testModule(TEST_ID)
        val bytecodeEvaluator = BytecodeEvaluator(
            fakeInterpreterContext,
            AntlrASTBuilder(),
            bytecodeModule)

        fakeInterpreterContext.primitiveRegistry.registerPrimitive(PRIMITIVE_NAME,
            PrimitiveBlock(PRIMITIVE_NAME, 1337))

        assertThrows<PrimitiveBindingBadArity> {
            // TODO remove 'Object := 1337 class' stub
            bytecodeEvaluator.eval("""
                Object := 1337 class;
                Object subclass: 'Test instanceVars: [];
                
                Test :: primitive = '$PRIMITIVE_NAME
            """.trimIndent())
        }
    }

    @Test
    fun `Successfully bind primitive`() {
        val fakeInterpreterContext = getFakeInterpreterContext()
        val bytecodeModule = BytecodeModule.testModule(TEST_ID)
        val bytecodeEvaluator = BytecodeEvaluator(
            fakeInterpreterContext,
            AntlrASTBuilder(),
            bytecodeModule)

        fakeInterpreterContext.primitiveRegistry.registerPrimitive(PRIMITIVE_NAME,
            PrimitiveBlock(PRIMITIVE_NAME, 0))

        // TODO remove 'Object := 1337 class' stub
        bytecodeEvaluator.eval("""
            Object := 1337 class;
            Object subclass: 'Test instanceVars: [];
            
            Test :: primitive = '$PRIMITIVE_NAME
        """.trimIndent())
    }
}