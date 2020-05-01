package parsing.ast.antlr

import org.antlr.v4.runtime.BaseErrorListener
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Recognizer
import parsing.ast.exceptions.SyntaxError

class AntlrASTErrorListener: BaseErrorListener() {
    override fun syntaxError(recognizer: Recognizer<*, *>, offendingSymbol: Any,
            line: Int, charPositionInLine: Int, msg: String, e: RecognitionException) {

        throw SyntaxError(msg)
    }
}
