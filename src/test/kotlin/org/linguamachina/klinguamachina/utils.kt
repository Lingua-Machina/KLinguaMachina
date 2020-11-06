package org.linguamachina.klinguamachina

import org.linguamachina.klinguamachina.parsing.ast.antlr.AntlrASTBuilder
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.BlockLiteralNode
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.RootNode
import org.linguamachina.klinguamachina.parsing.ast.nodes.impl.StatementExprNode

fun String.parse() =
    AntlrASTBuilder().build(this, "<test>")

fun RootNode.closure() =
    (statements[0] as StatementExprNode).expression as BlockLiteralNode
