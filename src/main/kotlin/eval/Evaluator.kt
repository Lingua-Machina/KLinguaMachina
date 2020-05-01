package eval

import parsing.ast.ASTBuilder

interface Evaluator<T> {
    fun eval(input: String, sourceName: String, astBuilder: ASTBuilder): T
}
