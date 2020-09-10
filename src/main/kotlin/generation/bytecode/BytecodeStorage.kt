package generation.bytecode

@ExperimentalUnsignedTypes
interface BytecodeStorage {
    val bytecodes: MutableList<UInt>
}
