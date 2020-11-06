package org.linguamachina.klinguamachina.generation.bytecode

@OptIn(ExperimentalUnsignedTypes::class)
interface BytecodeStorage {
    val bytecodes: MutableList<UInt>
}
