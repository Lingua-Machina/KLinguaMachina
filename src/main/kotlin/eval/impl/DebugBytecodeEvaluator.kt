package eval.impl

import eval.Evaluator
import parsing.ast.ASTBuilder
import parsing.ast.nodes.castASTNode
import parsing.ast.nodes.impl.RootNode
import parsing.ast.visitors.impl.ASTNodePrinter

@ExperimentalUnsignedTypes
class DebugBytecodeEvaluator: Evaluator<Unit> by BytecodeEvaluator(
        { println(ASTNodePrinter().visit(castASTNode<RootNode>(it))) },
        { println(it) }
)
