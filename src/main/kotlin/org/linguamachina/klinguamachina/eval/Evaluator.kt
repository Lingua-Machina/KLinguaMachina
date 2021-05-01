package org.linguamachina.klinguamachina.eval

import org.linguamachina.klinguamachina.interpreter.module.Module
import org.linguamachina.klinguamachina.parser.ast.ASTBuilder

abstract class Evaluator<T>(
    val evaluationContext: EvaluationContext,
    val astBuilder: ASTBuilder,
    val module: Module
) {
    abstract fun eval(): T
    abstract fun eval(input: String): T
}
