package eval.impl

import eval.Evaluator
import parsing.ast.ASTBuilder
import parsing.ast.nodes.castASTNode
import parsing.ast.nodes.impl.RootNode
import parsing.ast.visitors.impl.ASTNodePrinter
import util.stackTraceString
import java.io.PrintWriter
import java.io.StringWriter

class ASTPrinterEvaluator: Evaluator<String> {

    override fun eval(input: String, sourceName: String, astBuilder: ASTBuilder): String {
        return try {
            val ast = astBuilder.build(input, sourceName)
            ASTNodePrinter().visit(castASTNode<RootNode>(ast))
        } catch (e: Exception) {
            e.stackTraceString()
        }
    }
}