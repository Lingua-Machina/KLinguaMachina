package org.linguamachina.klinguamachina.generation.bytecode

import org.junit.jupiter.api.Test
import org.linguamachina.klinguamachina.*
import org.linguamachina.klinguamachina.generation.bytecode.impl.ModuleBytecodeCompiler
import org.linguamachina.klinguamachina.interpreter.module.impl.BytecodeModule
import org.linguamachina.klinguamachina.interpreter.primitive.impl.PrimitiveRegistryImpl
import org.linguamachina.klinguamachina.generation.bytecode.Bytecode.*

@OptIn(ExperimentalUnsignedTypes::class)
internal class BlockReturnTest {
    private var TEST_ID = 0
        get() = ++field

    @Test
    fun `keep explicit return`() {
        val code = "{ <3 }"
        val root = code.parse()

        val module = BytecodeModule.testModule(TEST_ID, code)

        ModuleBytecodeCompiler(module, root, PrimitiveRegistryImpl()).compile()

        assertBytecodesEquals(module.mainBlock.bytecodes,
            CLOSURE, 0, 0, 3,
            CONST_INT, 3,
            RETURN,
            POP,
            NIL,
            NON_LOCAL_RETURN)
    }

    @Test
    fun `implicitly return nil`() {
        val code = "{}"
        val root = code.parse()

        val module = BytecodeModule.testModule(TEST_ID, code)

        ModuleBytecodeCompiler(module, root, PrimitiveRegistryImpl()).compile()

        assertBytecodesEquals(module.mainBlock.bytecodes,
            CLOSURE, 0, 0, 2,
            NIL,
            RETURN,
            POP,
            NIL,
            NON_LOCAL_RETURN)
    }

    @Test
    fun `add implicit return`() {
        val code = "{ 1 + 2 }"
        val root = code.parse()

        val module = BytecodeModule.testModule(TEST_ID, code)

        ModuleBytecodeCompiler(module, root, PrimitiveRegistryImpl()).compile()

        assertBytecodesEquals(module.mainBlock.bytecodes,
            CLOSURE, 0, 0, 6,
            CONST_INT, 1,
            CONST_INT, 2,
            ADD,
            RETURN,
            POP,
            NIL,
            NON_LOCAL_RETURN)
    }
}
