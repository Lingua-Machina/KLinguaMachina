package org.linguamachina.klinguamachina.interpreter.context

import org.linguamachina.klinguamachina.eval.EvaluationContext
import org.linguamachina.klinguamachina.interpreter.primitive.PrimitiveRegistry

interface InterpreterContext: EvaluationContext {
    val primitiveRegistry: PrimitiveRegistry
}
