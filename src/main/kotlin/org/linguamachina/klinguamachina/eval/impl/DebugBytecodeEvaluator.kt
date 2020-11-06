package org.linguamachina.klinguamachina.eval.impl

import org.linguamachina.klinguamachina.interpreter.context.InterpreterContext
import org.linguamachina.klinguamachina.interpreter.module.impl.BytecodeModule
import org.linguamachina.klinguamachina.parsing.ast.ASTBuilder
import org.linguamachina.klinguamachina.parsing.ast.nodes.castASTNode
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.RootNode
import org.linguamachina.klinguamachina.parsing.ast.visitors.impl.ASTNodePrinter

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
