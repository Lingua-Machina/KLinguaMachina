package parsing.ast.antlr

import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.TerminalNode
import parsing.ast.ASTBuilder
import parsing.antlr.LinguaMachinaBaseVisitor
import parsing.antlr.LinguaMachinaLexer
import parsing.antlr.LinguaMachinaParser
import parsing.ast.nodes.*
import parsing.ast.nodes.castASTNode
import parsing.ast.nodes.impl.*

class AntlrASTBuilder: LinguaMachinaBaseVisitor<ASTNode>(), ASTBuilder {

    override fun build(input: String, sourceName: String): RootNode {
        val lexer = LinguaMachinaLexer(CharStreams.fromString(input, sourceName))
        val parser = LinguaMachinaParser(CommonTokenStream(lexer))
        // remove the default error listener to disable error printing
        parser.removeErrorListeners()
        parser.addErrorListener(AntlrASTErrorListener())
        return castASTNode(visit(parser.root()))
    }

    /********************* Utility Methods *********************/

    private fun position(token: Token) = NodePosition(
        token.line,
        token.charPositionInLine,
        token.tokenSource.sourceName
    )

    private tailrec fun stripUnnecessaryOperation(node: ExpressionNode): ExpressionNode =
        when {
            node is OperationNode && node.expressions.size == 1 ->
                stripUnnecessaryOperation(node.expressions[0])
            else -> node
        }

    private fun matchOperationOp(node: ParseTree, vararg cases: Pair<Int, OperationOp>): OperationOp {
        castANTLRNode<TerminalNode>(node).let {
            for ((type, op) in cases) {
                if (it.symbol.type == type) return op
            }
            throw IllegalStateException()
        }
    }

    /********************* Visitor Methods *********************/

    override fun visitRoot(ctx: LinguaMachinaParser.RootContext): ASTNode {
        return RootNode(
            position(ctx.start),
            ctx.statements().statement().map {
                castASTNode(visit(it))
            }
        )
    }

    override fun visitStatement(ctx: LinguaMachinaParser.StatementContext): ASTNode {
        var value = visit(ctx.getChild(0))
        if (value is ExpressionNode) {
            value = StatementExprNode(value.position, value)
        }
        return value
    }

    override fun visitIntegerLiteral(ctx: LinguaMachinaParser.IntegerLiteralContext): ASTNode {
        return IntegerLiteralNode(
            position(ctx.start),
            ctx.IntegerLiteral().symbol.text.toInt()
        )
    }

    override fun visitDoubleLiteral(ctx: LinguaMachinaParser.DoubleLiteralContext): ASTNode {
        return DoubleLiteralNode(
            position(ctx.start),
            ctx.DoubleLiteral().symbol.text.toDouble()
        )
    }

    override fun visitStringLiteral(ctx: LinguaMachinaParser.StringLiteralContext): ASTNode {
        val text = ctx.StringLiteral().symbol.text

        return StringLiteralNode(
            position(ctx.start),
            text.substring(1, text.length - 1)
        )
    }

    override fun visitCharLiteral(ctx: LinguaMachinaParser.CharLiteralContext): ASTNode {
        return CharLiteralNode(
            position(ctx.start),
            ctx.CharLiteral().symbol.text[1]
        )
    }

    override fun visitSymbolLiteral(ctx: LinguaMachinaParser.SymbolLiteralContext): ASTNode {
        val text = ctx.SymbolLiteral().symbol.text

        return SymbolLiteralNode(
            position(ctx.start),
            text.substring(1)
        )
    }

    override fun visitIdentifier(ctx: LinguaMachinaParser.IdentifierContext): ASTNode {
        return IdentifierNode(
            position(ctx.start),
            ctx.Identifier().symbol.text
        )
    }

    override fun visitArrayLiteral(ctx: LinguaMachinaParser.ArrayLiteralContext): ASTNode {
        return ArrayLiteralNode(
            position(ctx.start),
            ctx.expression().map { castASTNode(visit(it)) }
        )
    }

    override fun visitBlockLiteral(ctx: LinguaMachinaParser.BlockLiteralContext): ASTNode {
        return BlockLiteralNode(
            position(ctx.start),
            ctx.params.map { it.text.substring(1) },
            ctx.blockStatements()?.blockStatement()
                ?.map { castASTNode(visit(it)) }
                ?: emptyList()
        )
    }

    override fun visitUnaryMinus(ctx: LinguaMachinaParser.UnaryMinusContext): ASTNode {
        return UnaryOperationNode(
            position(ctx.start),
            castASTNode(visit(ctx.atom())),
            UnaryOperationOp.MINUS
        )
    }

    override fun visitUnaryNot(ctx: LinguaMachinaParser.UnaryNotContext): ASTNode {
        return UnaryOperationNode(
            position(ctx.start),
            castASTNode(visit(ctx.atom())),
            UnaryOperationOp.NOT
        )
    }

    override fun visitExpression(ctx: LinguaMachinaParser.ExpressionContext): ASTNode {
        return stripUnnecessaryOperation(castASTNode(visit(ctx.orExpr())))
    }

    override fun visitOrExpr(ctx: LinguaMachinaParser.OrExprContext): ASTNode {
        return OperationNode(
            position(ctx.start),
            ctx.andExpr().map {
                stripUnnecessaryOperation(castASTNode(visit(it)))
            },
            OperationOp.OR
        )
    }

    override fun visitAndExpr(ctx: LinguaMachinaParser.AndExprContext): ASTNode {
        return OperationNode(
            position(ctx.start),
            ctx.eqExpr().map {
                stripUnnecessaryOperation(castASTNode(visit(it)))
            },
            OperationOp.AND
        )
    }

    override fun visitEqExpr(ctx: LinguaMachinaParser.EqExprContext): ASTNode {
        return OperationNode(
            position(ctx.start),
            ctx.compExpr().map {
                stripUnnecessaryOperation(castASTNode(visit(it)))
            },
            if (ctx.eqOp() != null)
                matchOperationOp(
                    ctx.eqOp().getChild(0),
                    LinguaMachinaParser.Equal to OperationOp.EQUAL,
                    LinguaMachinaParser.NotEqual to OperationOp.NOT_EQUAL
                )
            else
                OperationOp.EQUAL
        )
    }

    override fun visitCompExpr(ctx: LinguaMachinaParser.CompExprContext): ASTNode {
        return OperationNode(
            position(ctx.start),
            ctx.arithExpr().map {
                stripUnnecessaryOperation(castASTNode(visit(it)))
            },
            if (ctx.compOp() != null)
                matchOperationOp(
                    ctx.compOp().getChild(0),
                    LinguaMachinaParser.Lower to OperationOp.LOWER,
                    LinguaMachinaParser.LowerOrEq to OperationOp.LOWER_EQ,
                    LinguaMachinaParser.Greater to OperationOp.GREATER,
                    LinguaMachinaParser.GreaterOrEq to OperationOp.GREATER_EQ
                )
            else
                OperationOp.LOWER
        )
    }

    override fun visitArithExpr(ctx: LinguaMachinaParser.ArithExprContext): ASTNode {
        return OperationNode(
            position(ctx.start),
            ctx.termExpr().map {
                stripUnnecessaryOperation(castASTNode(visit(it)))
            },
            if (ctx.arithOp().isNotEmpty())
                matchOperationOp(
                    ctx.arithOp()[0].getChild(0),
                    LinguaMachinaParser.Plus to OperationOp.PLUS,
                    LinguaMachinaParser.Minus to OperationOp.MINUS
                )
            else
                OperationOp.PLUS
        )
    }

    override fun visitTermExpr(ctx: LinguaMachinaParser.TermExprContext): ASTNode {
        return OperationNode(
            position(ctx.start),
            ctx.factorExpr().map {
                stripUnnecessaryOperation(castASTNode(visit(it)))
            },
            OperationOp.TIMES
        )
    }

    override fun visitFactorExpr(ctx: LinguaMachinaParser.FactorExprContext): ASTNode {
        return OperationNode(
            position(ctx.start),
            ctx.messageExpr().map {
                stripUnnecessaryOperation(castASTNode(visit(it)))
            },
            OperationOp.DIVIDED_BY
        )
    }

    override fun visitParenExpression(ctx: LinguaMachinaParser.ParenExpressionContext): ASTNode {
        return visit(ctx.expression())
    }

    override fun visitMessageExpr(ctx: LinguaMachinaParser.MessageExprContext): ASTNode {
        return when (ctx.messageCascadeOrChain()) {
            null -> castASTNode(visit(ctx.unary()))
            else -> MessageSendingNode(
                position(ctx.start),
                castASTNode(visit(ctx.unary())),
                castASTNode(visit(ctx.messageCascadeOrChain()))
            )
        }
    }

    override fun visitMessageSelector(ctx: LinguaMachinaParser.MessageSelectorContext): ASTNode {
        return MessageSelectorNode(
            position(ctx.start),
            ctx.identifier().map { castASTNode<IdentifierNode>(visit(it)).value },
            ctx.paramExpression().map {
                castASTNode<ExpressionNode>(visit(it))
            }.toMutableList()
        )
    }

    override fun visitMessageCascade(ctx: LinguaMachinaParser.MessageCascadeContext): ASTNode {
        val selectors = mutableListOf<Selectable>(
            castASTNode(visit(ctx.messageSelector()))
        )
        selectors.addAll(ctx.messageCascadeOrChainMember().map {
            castASTNode(visit(it))
        })
        return MessageCascadeNode(
            position(ctx.start),
            selectors
        )
    }

    override fun visitMessageChain(ctx: LinguaMachinaParser.MessageChainContext): ASTNode {
        val selectors = mutableListOf<Selectable>(
            castASTNode(visit(ctx.messageSelector()))
        )
        selectors.addAll(ctx.messageCascadeOrChainMember().map {
            castASTNode(visit(it))
        })
        return MessageChainNode(
            position(ctx.start),
            selectors
        )
    }

    override fun visitMessageCascadeOrChainMember(ctx: LinguaMachinaParser.MessageCascadeOrChainMemberContext): ASTNode {
        return if (ctx.messageSelector() != null)
            visit(ctx.messageSelector())
        else
            visit(ctx.messageCascadeOrChain())
    }

    override fun visitVarDeclaration(ctx: LinguaMachinaParser.VarDeclarationContext): ASTNode {
        return VarDeclarationNode(
            position(ctx.start),
            castASTNode<IdentifierNode>(visit(ctx.identifier())).value,
            castASTNode(visit(ctx.expression()))
        )
    }

    override fun visitVarAssignment(ctx: LinguaMachinaParser.VarAssignmentContext): ASTNode {
        return VarAssignmentNode(
            position(ctx.start),
            castASTNode<IdentifierNode>(visit(ctx.identifier())).value,
            castASTNode(visit(ctx.expression()))
        )
    }

    override fun visitCompileStatement(ctx: LinguaMachinaParser.CompileStatementContext): ASTNode {
        return CompileStatementNode(
            position(ctx.start),
            castASTNode(visit(ctx.expression())),
            ctx.methodParams().keywords.map {
                castASTNode<IdentifierNode>(visit(it)).value
            },
            BlockLiteralNode(
                position(ctx.methodParams().stop),
                ctx.methodParams().params.map {
                    castASTNode<IdentifierNode>(visit(it)).value
                },
                ctx.blockStatements()?.blockStatement()?.map {
                    castASTNode(visit(it))
                } ?: emptyList()
            )
        )
    }

    override fun visitPrimitiveDeclStatement(ctx: LinguaMachinaParser.PrimitiveDeclStatementContext): ASTNode {
        return PrimitiveDeclStatementNode(
            position(ctx.start),
            castASTNode(visit(ctx.expression())),
            ctx.methodParams().keywords.map {
                castASTNode<IdentifierNode>(visit(it)).value
            },
            ctx.methodParams().params.map {
                castASTNode<IdentifierNode>(visit(it)).value
            },
            castASTNode<SymbolLiteralNode>(visit(ctx.symbolLiteral())).value
        )
    }

    override fun visitLocalReturn(ctx: LinguaMachinaParser.LocalReturnContext): ASTNode {
        return LocalReturnNode(
            position(ctx.start),
            castASTNode(visit(ctx.expression()))
        )
    }

    override fun visitNonLocalReturn(ctx: LinguaMachinaParser.NonLocalReturnContext): ASTNode {
        return NonLocalReturnNode(
            position(ctx.start),
            castASTNode(visit(ctx.expression()))
        )
    }
}
