package org.linguamachina.klinguamachina.parser.ast.printers

import org.linguamachina.klinguamachina.parser.ast.nodes.impl.*
import org.linguamachina.klinguamachina.parser.ast.BaseASTNodeVisitor

class ASTNodePrinter: BaseASTNodeVisitor<String> {

    private val stub = defaultValue()

    private val builder = ASTStringBuilder()

    override fun defaultValue() = ""

    override fun visit(node: ArrayLiteralNode): String {
        builder {
            +"["
            indent {
                node.items.forEach { visit(it) }
            }
            +"]"
        }
        return stub
    }

    override fun visit(node: BlockLiteralNode): String {
        builder {
            +"BlockLiteral {"
            indent {
                -"params = "
                !node.paramNames.map { ":$it" }
                    .ifEmpty { listOf("<none>") }
                    .joinToString(" ")
                !"\n"

                node.statements.forEach { visit(it) }
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: CharLiteralNode): String {
        builder {
            +"\$${node.value}"
        }
        return stub
    }

    override fun visit(node: CompileStatementNode): String {
        builder {
            +"CompileStatement {"
            indent {
                -"receiver = "
                noIndentNext()
                visit(node.receiver)

                if (node.keywords.isNotEmpty() && node.block.paramNames.isEmpty()) {
                    +node.keywords[0]
                } else {
                    node.keywords.zip(node.block.paramNames).forEach { (keyword, param) ->
                        +"$keyword: $param"
                    }
                }

                node.block.statements.forEach { visit(it) }
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: PrimitiveDeclStatementNode): String {
        builder {
            +"PrimitiveDeclStatement {"
            indent {
                -"receiver = "
                noIndentNext()
                visit(node.receiver)

                if (node.keywords.isNotEmpty() && node.paramNames.isEmpty()) {
                    +node.keywords[0]
                } else {
                    node.keywords.zip(node.paramNames).forEach { (keyword, param) ->
                        +"$keyword: $param"
                    }
                }

                +"primitiveName = ${node.primitiveName}"
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: DoubleLiteralNode): String {
        builder {
            +node.value.toString()
        }
        return stub
    }

    override fun visit(node: IdentifierNode): String {
        builder {
            +node.value
        }
        return stub
    }

    override fun visit(node: IntegerLiteralNode): String {
        builder {
            +node.value.toString()
        }
        return stub
    }

    override fun visit(node: LocalReturnNode): String {
        builder {
            +"LocalReturn {"
            indent {
                visit(node.expression)
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: MessageCascadeNode): String {
        builder {
            +"MessageCascade {"
            indent {
                node.selectors.forEach { visit(it) }
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: MessageChainNode): String {
        builder {
            +"MessageChain {"
            indent {
                node.selectors.forEach { visit(it) }
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: MessageSelectorNode): String {
        builder {
            +"MessageSelector {"
            indent {
                if (node.keywords.isNotEmpty() && node.values.isEmpty()) {
                    +node.keywords[0]
                } else {
                    node.keywords.zip(node.values).forEach { (keyword, expr) ->
                        -"$keyword: "
                        noIndentNext()
                        visit(expr)
                    }
                }
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: MessageSendingNode): String {
        builder {
            +"MessageSending {"
            indent {
                -"receiver = "
                noIndentNext()
                visit(node.receiver)

                -"selectors = "
                noIndentNext()
                visit(node.selectors)
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: NonLocalReturnNode): String {
        builder {
            +"NonLocalReturn {"
            indent {
                visit(node.expression)
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: OperationNode): String {
        builder {
            +"Operation {"
            indent {
                +"op = ${node.op.name}"

                node.expressions.forEach { visit(it) }
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: RootNode): String {
        builder {
            +"Root {"
            indent {
                node.statements.forEach { visit(it) }
            }
            +"}"
        }
        return builder.toString()
    }

    override fun visit(node: StatementExprNode): String {
        builder {
            +"StatementExpr {"
            indent {
                visit(node.expression)
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: StringLiteralNode): String {
        builder {
            +"\"${node.value}\""
        }
        return stub
    }

    override fun visit(node: SymbolLiteralNode): String {
        builder {
            +"'${node.value}"
        }
        return stub
    }

    override fun visit(node: UnaryOperationNode): String {
        builder {
            +"UnaryOperation {"
            indent {
                +"op = ${node.op.name}"
                -"receiver = "
                noIndentNext()
                visit(node.receiver)
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: VarAssignmentNode): String {
        builder {
            +"VarAssignment {"
            indent {
                +"receiver=${node.name }"
                -"value = "
                noIndentNext()
                visit(node.value)
            }
            +"}"
        }
        return stub
    }

    override fun visit(node: VarDeclarationNode): String {
        builder {
            +"VarDeclaration {"
            indent {
                +"receiver=${node.name }"
                -"value = "
                noIndentNext()
                visit(node.value)
            }
            +"}"
        }
        return stub
    }
}
