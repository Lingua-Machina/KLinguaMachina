// Generated from /home/elyan/Documents/KLinguaMachina/src/main/antlr/org/linguamachina/klinguamachina/parser/antlr/LinguaMachina.g4 by ANTLR 4.9.1
package org.linguamachina.klinguamachina.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinguaMachinaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinguaMachinaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(LinguaMachinaParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#eqOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOp(LinguaMachinaParser.EqOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#arithOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithOp(LinguaMachinaParser.ArithOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(LinguaMachinaParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#doubleLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(LinguaMachinaParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(LinguaMachinaParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#charLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(LinguaMachinaParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#symbolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolLiteral(LinguaMachinaParser.SymbolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(LinguaMachinaParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(LinguaMachinaParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#blockLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockLiteral(LinguaMachinaParser.BlockLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LinguaMachinaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LinguaMachinaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#paramExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamExpression(LinguaMachinaParser.ParamExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(LinguaMachinaParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(LinguaMachinaParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(LinguaMachinaParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(LinguaMachinaParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#arithExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithExpr(LinguaMachinaParser.ArithExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#termExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpr(LinguaMachinaParser.TermExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#factorExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorExpr(LinguaMachinaParser.FactorExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#moduloExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuloExpr(LinguaMachinaParser.ModuloExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#parenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(LinguaMachinaParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(LinguaMachinaParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(LinguaMachinaParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#unaryNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNot(LinguaMachinaParser.UnaryNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(LinguaMachinaParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#messageExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExpr(LinguaMachinaParser.MessageExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#messageSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageSelector(LinguaMachinaParser.MessageSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#messageCascadeOrChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageCascadeOrChain(LinguaMachinaParser.MessageCascadeOrChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#messageCascade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageCascade(LinguaMachinaParser.MessageCascadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#messageChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageChain(LinguaMachinaParser.MessageChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#messageCascadeOrChainMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageCascadeOrChainMember(LinguaMachinaParser.MessageCascadeOrChainMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(LinguaMachinaParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(LinguaMachinaParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#methodParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParams(LinguaMachinaParser.MethodParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#compileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompileStatement(LinguaMachinaParser.CompileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#primitiveDeclStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDeclStatement(LinguaMachinaParser.PrimitiveDeclStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#localReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalReturn(LinguaMachinaParser.LocalReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#nonLocalReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonLocalReturn(LinguaMachinaParser.NonLocalReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(LinguaMachinaParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LinguaMachinaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(LinguaMachinaParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(LinguaMachinaParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguaMachinaParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(LinguaMachinaParser.RootContext ctx);
}