package eval.impl

import eval.Evaluator
import parsing.ast.ASTBuilder
import parsing.ast.exceptions.ASTError
import parsing.ast.nodes.castASTNode
import parsing.ast.nodes.impl.RootNode
import parsing.ast.nodes.validate
import parsing.ast.visitors.impl.ASTNodePrinter
import util.stackTraceString

class ASTPrinterEvaluator: Evaluator<String> {

    override fun eval(input: String, sourceName: String, astBuilder: ASTBuilder): String {
        return try {
            val ast = astBuilder.build(input, sourceName)
            validate(ast)
            ASTNodePrinter().visit(castASTNode<RootNode>(ast))
        } catch (e: ASTError) {
            e.localizedMessage
        } catch (e: Exception) {
            e.stackTraceString()
        }
    }
}
