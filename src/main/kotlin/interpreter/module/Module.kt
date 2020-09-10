package interpreter.module

import interpreter.block.Block
import parsing.ast.nodes.impl.CompileStatementNode

interface Module {
    val mainBlock: Block
    val compileNodes: MutableList<CompileStatementNode>
}
