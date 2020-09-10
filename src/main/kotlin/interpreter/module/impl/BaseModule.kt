package interpreter.module.impl

import interpreter.block.Block
import interpreter.module.Module
import parsing.ast.nodes.impl.CompileStatementNode

class BaseModule(
    override val mainBlock: Block,
    override val compileNodes: MutableList<CompileStatementNode>
): Module
