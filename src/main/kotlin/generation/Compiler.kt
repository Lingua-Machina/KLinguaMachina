package generation

import interpreter.module.Module

interface Compiler<T> {
    fun compile(): T
}
