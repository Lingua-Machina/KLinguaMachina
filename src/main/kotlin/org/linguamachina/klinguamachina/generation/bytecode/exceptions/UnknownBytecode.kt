package org.linguamachina.klinguamachina.generation.bytecode.exceptions

class UnknownBytecode(bytecodeNumber: Int):
    IllegalStateException("Cannot find any bytecode numbered $bytecodeNumber")
