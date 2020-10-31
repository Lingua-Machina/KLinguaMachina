package org.linguamachina.klinguamachina.interpreter.primitive

class UnregisteredPrimitiveAccess(
    val name: String
): Exception("Cannot access unregistered primitive '$name'")
