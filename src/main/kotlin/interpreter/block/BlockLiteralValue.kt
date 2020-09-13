package interpreter.block

abstract class BlockLiteralValue(val value: Any) {
    override fun toString(): String {
        return value.toString()
    }
}
