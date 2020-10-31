package eval.impl

import interpreter.context.InterpreterContext
import interpreter.module.impl.BytecodeModule
import parsing.ast.ASTBuilder
import parsing.ast.nodes.castASTNode
import parsing.ast.nodes.impl.RootNode
import parsing.ast.visitors.impl.ASTNodePrinter

@ExperimentalUnsignedTypes
class DebugBytecodeEvaluator(
    interpreterContext: InterpreterContext,
    astBuilder: ASTBuilder,
    bytecodeModule: BytecodeModule
): BytecodeEvaluator(
        interpreterContext,
        astBuilder,
        bytecodeModule,
        { println(ASTNodePrinter().visit(castASTNode<RootNode>(it))) },
        { println(it) }
)
