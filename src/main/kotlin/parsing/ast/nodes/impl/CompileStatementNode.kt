package parsing.ast.nodes.impl

import parsing.ast.nodes.ExpressionNode
import parsing.ast.nodes.StatementNode

class CompileStatementNode(
    position: NodePosition,

    val receiver: ExpressionNode,
    val keywords: List<String>,
    val block: BlockLiteralNode
): StatementNode(position)
