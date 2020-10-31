package eval

import interpreter.module.Module
import parsing.ast.ASTBuilder

abstract class Evaluator<T>(
    val evaluationContext: EvaluationContext,
    val astBuilder: ASTBuilder,
    val module: Module
) {
    abstract fun eval(): T
    abstract fun eval(input: String): T
}
