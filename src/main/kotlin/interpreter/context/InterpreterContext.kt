package interpreter.context

import eval.EvaluationContext
import interpreter.primitive.PrimitiveRegistry

interface InterpreterContext: EvaluationContext {
    val primitiveRegistry: PrimitiveRegistry
}
