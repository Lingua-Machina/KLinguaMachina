// Generated from /home/elyan/Documents/KLinguaMachina/src/main/antlr/org/linguamachina/klinguamachina/parser/antlr/LinguaMachina.g4 by ANTLR 4.9.1
package org.linguamachina.klinguamachina.parser.antlr;
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
	 * Enter a parse tree produced by {@link LinguaMachinaParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void enterEqOp(LinguaMachinaParser.EqOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void exitEqOp(LinguaMachinaParser.EqOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#arithOp}.
	 * @param ctx the parse tree
	 */
	void enterArithOp(LinguaMachinaParser.ArithOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#arithOp}.
	 * @param ctx the parse tree
	 */
	void exitArithOp(LinguaMachinaParser.ArithOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(LinguaMachinaParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(LinguaMachinaParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#doubleLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(LinguaMachinaParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#doubleLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(LinguaMachinaParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(LinguaMachinaParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(LinguaMachinaParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteral(LinguaMachinaParser.CharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteral(LinguaMachinaParser.CharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#symbolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSymbolLiteral(LinguaMachinaParser.SymbolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#symbolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSymbolLiteral(LinguaMachinaParser.SymbolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LinguaMachinaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LinguaMachinaParser.IdentifierContext ctx);
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
	 * Enter a parse tree produced by {@link LinguaMachinaParser#moduloExpr}.
	 * @param ctx the parse tree
	 */
	void enterModuloExpr(LinguaMachinaParser.ModuloExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#moduloExpr}.
	 * @param ctx the parse tree
	 */
	void exitModuloExpr(LinguaMachinaParser.ModuloExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#parenExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(LinguaMachinaParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#parenExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(LinguaMachinaParser.ParenExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link LinguaMachinaParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(LinguaMachinaParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(LinguaMachinaParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#unaryNot}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNot(LinguaMachinaParser.UnaryNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#unaryNot}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNot(LinguaMachinaParser.UnaryNotContext ctx);
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
	 * Enter a parse tree produced by {@link LinguaMachinaParser#methodParams}.
	 * @param ctx the parse tree
	 */
	void enterMethodParams(LinguaMachinaParser.MethodParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#methodParams}.
	 * @param ctx the parse tree
	 */
	void exitMethodParams(LinguaMachinaParser.MethodParamsContext ctx);
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
	 * Enter a parse tree produced by {@link LinguaMachinaParser#primitiveDeclStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDeclStatement(LinguaMachinaParser.PrimitiveDeclStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#primitiveDeclStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDeclStatement(LinguaMachinaParser.PrimitiveDeclStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#localReturn}.
	 * @param ctx the parse tree
	 */
	void enterLocalReturn(LinguaMachinaParser.LocalReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#localReturn}.
	 * @param ctx the parse tree
	 */
	void exitLocalReturn(LinguaMachinaParser.LocalReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#nonLocalReturn}.
	 * @param ctx the parse tree
	 */
	void enterNonLocalReturn(LinguaMachinaParser.NonLocalReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#nonLocalReturn}.
	 * @param ctx the parse tree
	 */
	void exitNonLocalReturn(LinguaMachinaParser.NonLocalReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguaMachinaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(LinguaMachinaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguaMachinaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(LinguaMachinaParser.BlockStatementContext ctx);
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