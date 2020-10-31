package org.linguamachina.klinguamachina.interpreter.module

import org.linguamachina.klinguamachina.interpreter.block.Block
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.CompileStatementNode

interface Module {
    val sourceName: String
    val mainBlock: Block
    val compileNodes: MutableList<CompileStatementNode>
}
