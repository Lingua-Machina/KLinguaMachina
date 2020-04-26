// Generated from /home/elyan/Documents/KLinguaMachina/src/main/antlr/parsing/antlr/LinguaMachina.g4 by ANTLR 4.8
package parsing.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinguaMachinaParser}.
 */
public interface LinguaMachinaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(LinguaMachinaParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(LinguaMachinaParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(LinguaMachinaParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(LinguaMachinaParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#blockLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBlockLiteral(LinguaMachinaParser.BlockLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#blockLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBlockLiteral(LinguaMachinaParser.BlockLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LinguaMachinaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LinguaMachinaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LinguaMachinaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LinguaMachinaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#paramExpression}.
	 * @param ctx the parse tree
	 */
	void enterParamExpression(LinguaMachinaParser.ParamExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#paramExpression}.
	 * @param ctx the parse tree
	 */
	void exitParamExpression(LinguaMachinaParser.ParamExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LinguaMachinaParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LinguaMachinaParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LinguaMachinaParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LinguaMachinaParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(LinguaMachinaParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(LinguaMachinaParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(LinguaMachinaParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(LinguaMachinaParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithExpr(LinguaMachinaParser.ArithExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithExpr(LinguaMachinaParser.ArithExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#termExpr}.
	 * @param ctx the parse tree
	 */
	void enterTermExpr(LinguaMachinaParser.TermExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#termExpr}.
	 * @param ctx the parse tree
	 */
	void exitTermExpr(LinguaMachinaParser.TermExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#factorExpr}.
	 * @param ctx the parse tree
	 */
	void enterFactorExpr(LinguaMachinaParser.FactorExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#factorExpr}.
	 * @param ctx the parse tree
	 */
	void exitFactorExpr(LinguaMachinaParser.FactorExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(LinguaMachinaParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(LinguaMachinaParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(LinguaMachinaParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(LinguaMachinaParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#messageExpr}.
	 * @param ctx the parse tree
	 */
	void enterMessageExpr(LinguaMachinaParser.MessageExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#messageExpr}.
	 * @param ctx the parse tree
	 */
	void exitMessageExpr(LinguaMachinaParser.MessageExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#messageSelector}.
	 * @param ctx the parse tree
	 */
	void enterMessageSelector(LinguaMachinaParser.MessageSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#messageSelector}.
	 * @param ctx the parse tree
	 */
	void exitMessageSelector(LinguaMachinaParser.MessageSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#messageCascadeOrChain}.
	 * @param ctx the parse tree
	 */
	void enterMessageCascadeOrChain(LinguaMachinaParser.MessageCascadeOrChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#messageCascadeOrChain}.
	 * @param ctx the parse tree
	 */
	void exitMessageCascadeOrChain(LinguaMachinaParser.MessageCascadeOrChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#messageCascade}.
	 * @param ctx the parse tree
	 */
	void enterMessageCascade(LinguaMachinaParser.MessageCascadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#messageCascade}.
	 * @param ctx the parse tree
	 */
	void exitMessageCascade(LinguaMachinaParser.MessageCascadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#messageChain}.
	 * @param ctx the parse tree
	 */
	void enterMessageChain(LinguaMachinaParser.MessageChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#messageChain}.
	 * @param ctx the parse tree
	 */
	void exitMessageChain(LinguaMachinaParser.MessageChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#messageCascadeOrChainMember}.
	 * @param ctx the parse tree
	 */
	void enterMessageCascadeOrChainMember(LinguaMachinaParser.MessageCascadeOrChainMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#messageCascadeOrChainMember}.
	 * @param ctx the parse tree
	 */
	void exitMessageCascadeOrChainMember(LinguaMachinaParser.MessageCascadeOrChainMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(LinguaMachinaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(LinguaMachinaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(LinguaMachinaParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(LinguaMachinaParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#compileStatementMethodParams}.
	 * @param ctx the parse tree
	 */
	void enterCompileStatementMethodParams(LinguaMachinaParser.CompileStatementMethodParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#compileStatementMethodParams}.
	 * @param ctx the parse tree
	 */
	void exitCompileStatementMethodParams(LinguaMachinaParser.CompileStatementMethodParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#compileStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompileStatement(LinguaMachinaParser.CompileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#compileStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompileStatement(LinguaMachinaParser.CompileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalStatement}
	 * labeled alternative in {@link LinguaMachinaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterNormalStatement(LinguaMachinaParser.NormalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalStatement}
	 * labeled alternative in {@link LinguaMachinaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitNormalStatement(LinguaMachinaParser.NormalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localReturn}
	 * labeled alternative in {@link LinguaMachinaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalReturn(LinguaMachinaParser.LocalReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localReturn}
	 * labeled alternative in {@link LinguaMachinaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalReturn(LinguaMachinaParser.LocalReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonLocalReturn}
	 * labeled alternative in {@link LinguaMachinaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterNonLocalReturn(LinguaMachinaParser.NonLocalReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonLocalReturn}
	 * labeled alternative in {@link LinguaMachinaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitNonLocalReturn(LinguaMachinaParser.NonLocalReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LinguaMachinaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LinguaMachinaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(LinguaMachinaParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(LinguaMachinaParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(LinguaMachinaParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(LinguaMachinaParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(LinguaMachinaParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(LinguaMachinaParser.RootContext ctx);
}