package generation

interface Compiler<T> {
    fun compile(): T
}
