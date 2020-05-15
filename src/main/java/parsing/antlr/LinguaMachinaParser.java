// Generated from /home/elyan/Documents/KLinguaMachina/src/main/antlr/parsing/antlr/LinguaMachina.g4 by ANTLR 4.8
package parsing.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguaMachinaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, WS=22, COMMENT=23, BlockLiteralParam=24, 
		IntegerLiteral=25, DoubleLiteral=26, StringLiteral=27, CharLiteral=28, 
		SymbolLiteral=29, Identifier=30, LowerOrEq=31, GreaterOrEq=32, Lower=33, 
		Greater=34, Equal=35, NotEqual=36, Plus=37, Minus=38;
	public static final int
		RULE_compOp = 0, RULE_eqOp = 1, RULE_arithOp = 2, RULE_integerLiteral = 3, 
		RULE_doubleLiteral = 4, RULE_stringLiteral = 5, RULE_charLiteral = 6, 
		RULE_symbolLiteral = 7, RULE_identifier = 8, RULE_arrayLiteral = 9, RULE_blockLiteral = 10, 
		RULE_literal = 11, RULE_expression = 12, RULE_paramExpression = 13, RULE_orExpr = 14, 
		RULE_andExpr = 15, RULE_eqExpr = 16, RULE_compExpr = 17, RULE_arithExpr = 18, 
		RULE_termExpr = 19, RULE_factorExpr = 20, RULE_parenExpression = 21, RULE_atom = 22, 
		RULE_unaryMinus = 23, RULE_unaryNot = 24, RULE_unary = 25, RULE_messageExpr = 26, 
		RULE_messageSelector = 27, RULE_messageCascadeOrChain = 28, RULE_messageCascade = 29, 
		RULE_messageChain = 30, RULE_messageCascadeOrChainMember = 31, RULE_varDeclaration = 32, 
		RULE_varAssignment = 33, RULE_methodParams = 34, RULE_compileStatement = 35, 
		RULE_primitiveDeclStatement = 36, RULE_localReturn = 37, RULE_nonLocalReturn = 38, 
		RULE_blockStatement = 39, RULE_statement = 40, RULE_blockStatements = 41, 
		RULE_statements = 42, RULE_root = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"compOp", "eqOp", "arithOp", "integerLiteral", "doubleLiteral", "stringLiteral", 
			"charLiteral", "symbolLiteral", "identifier", "arrayLiteral", "blockLiteral", 
			"literal", "expression", "paramExpression", "orExpr", "andExpr", "eqExpr", 
			"compExpr", "arithExpr", "termExpr", "factorExpr", "parenExpression", 
			"atom", "unaryMinus", "unaryNot", "unary", "messageExpr", "messageSelector", 
			"messageCascadeOrChain", "messageCascade", "messageChain", "messageCascadeOrChainMember", 
			"varDeclaration", "varAssignment", "methodParams", "compileStatement", 
			"primitiveDeclStatement", "localReturn", "nonLocalReturn", "blockStatement", 
			"statement", "blockStatements", "statements", "root"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'{'", "'|'", "'}'", "'||'", "'&&'", "'*'", 
			"'/'", "'('", "')'", "'!'", "':'", "'|>'", "':='", "'='", "'>>'", "'::'", 
			"'^'", "';'", null, null, null, null, null, null, null, null, null, "'<='", 
			"'>='", "'<'", "'>'", "'=='", "'!='", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "WS", "COMMENT", 
			"BlockLiteralParam", "IntegerLiteral", "DoubleLiteral", "StringLiteral", 
			"CharLiteral", "SymbolLiteral", "Identifier", "LowerOrEq", "GreaterOrEq", 
			"Lower", "Greater", "Equal", "NotEqual", "Plus", "Minus"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LinguaMachina.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinguaMachinaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode LowerOrEq() { return getToken(LinguaMachinaParser.LowerOrEq, 0); }
		public TerminalNode Lower() { return getToken(LinguaMachinaParser.Lower, 0); }
		public TerminalNode GreaterOrEq() { return getToken(LinguaMachinaParser.GreaterOrEq, 0); }
		public TerminalNode Greater() { return getToken(LinguaMachinaParser.Greater, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LowerOrEq) | (1L << GreaterOrEq) | (1L << Lower) | (1L << Greater))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqOpContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(LinguaMachinaParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(LinguaMachinaParser.NotEqual, 0); }
		public EqOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterEqOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitEqOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitEqOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqOpContext eqOp() throws RecognitionException {
		EqOpContext _localctx = new EqOpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_eqOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==Equal || _la==NotEqual) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithOpContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(LinguaMachinaParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(LinguaMachinaParser.Minus, 0); }
		public ArithOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterArithOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitArithOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitArithOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithOpContext arithOp() throws RecognitionException {
		ArithOpContext _localctx = new ArithOpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arithOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !(_la==Plus || _la==Minus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(LinguaMachinaParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleLiteralContext extends ParserRuleContext {
		public TerminalNode DoubleLiteral() { return getToken(LinguaMachinaParser.DoubleLiteral, 0); }
		public DoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleLiteralContext doubleLiteral() throws RecognitionException {
		DoubleLiteralContext _localctx = new DoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_doubleLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(DoubleLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(LinguaMachinaParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharLiteralContext extends ParserRuleContext {
		public TerminalNode CharLiteral() { return getToken(LinguaMachinaParser.CharLiteral, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitCharLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(CharLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolLiteralContext extends ParserRuleContext {
		public TerminalNode SymbolLiteral() { return getToken(LinguaMachinaParser.SymbolLiteral, 0); }
		public SymbolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterSymbolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitSymbolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitSymbolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolLiteralContext symbolLiteral() throws RecognitionException {
		SymbolLiteralContext _localctx = new SymbolLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_symbolLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(SymbolLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LinguaMachinaParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__0);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__12) | (1L << IntegerLiteral) | (1L << DoubleLiteral) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << SymbolLiteral) | (1L << Identifier) | (1L << Minus))) != 0)) {
				{
				setState(107);
				expression();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(108);
					match(T__1);
					setState(109);
					expression();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(117);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockLiteralContext extends ParserRuleContext {
		public Token BlockLiteralParam;
		public List<Token> params = new ArrayList<Token>();
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public List<TerminalNode> BlockLiteralParam() { return getTokens(LinguaMachinaParser.BlockLiteralParam); }
		public TerminalNode BlockLiteralParam(int i) {
			return getToken(LinguaMachinaParser.BlockLiteralParam, i);
		}
		public BlockLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterBlockLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitBlockLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitBlockLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockLiteralContext blockLiteral() throws RecognitionException {
		BlockLiteralContext _localctx = new BlockLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__3);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BlockLiteralParam) {
				{
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					((BlockLiteralContext)_localctx).BlockLiteralParam = match(BlockLiteralParam);
					((BlockLiteralContext)_localctx).params.add(((BlockLiteralContext)_localctx).BlockLiteralParam);
					}
					}
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BlockLiteralParam );
				setState(125);
				match(T__4);
				}
			}

			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__12) | (1L << T__19) | (1L << IntegerLiteral) | (1L << DoubleLiteral) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << SymbolLiteral) | (1L << Identifier) | (1L << Lower) | (1L << Minus))) != 0)) {
				{
				setState(128);
				blockStatements();
				}
			}

			setState(131);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public DoubleLiteralContext doubleLiteral() {
			return getRuleContext(DoubleLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public SymbolLiteralContext symbolLiteral() {
			return getRuleContext(SymbolLiteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public BlockLiteralContext blockLiteral() {
			return getRuleContext(BlockLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				integerLiteral();
				}
				break;
			case DoubleLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				doubleLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				stringLiteral();
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				charLiteral();
				}
				break;
			case SymbolLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				symbolLiteral();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				identifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				arrayLiteral();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				blockLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			orExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamExpressionContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public ParamExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterParamExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitParamExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitParamExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamExpressionContext paramExpression() throws RecognitionException {
		ParamExpressionContext _localctx = new ParamExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_paramExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			unary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			andExpr();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(148);
				match(T__6);
				setState(149);
				andExpr();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public List<EqExprContext> eqExpr() {
			return getRuleContexts(EqExprContext.class);
		}
		public EqExprContext eqExpr(int i) {
			return getRuleContext(EqExprContext.class,i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			eqExpr();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(156);
				match(T__7);
				setState(157);
				eqExpr();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqExprContext extends ParserRuleContext {
		public List<CompExprContext> compExpr() {
			return getRuleContexts(CompExprContext.class);
		}
		public CompExprContext compExpr(int i) {
			return getRuleContext(CompExprContext.class,i);
		}
		public EqOpContext eqOp() {
			return getRuleContext(EqOpContext.class,0);
		}
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		EqExprContext _localctx = new EqExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eqExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			compExpr();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal || _la==NotEqual) {
				{
				setState(164);
				eqOp();
				setState(165);
				compExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompExprContext extends ParserRuleContext {
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			arithExpr();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LowerOrEq) | (1L << GreaterOrEq) | (1L << Lower) | (1L << Greater))) != 0)) {
				{
				setState(170);
				compOp();
				setState(171);
				arithExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithExprContext extends ParserRuleContext {
		public List<TermExprContext> termExpr() {
			return getRuleContexts(TermExprContext.class);
		}
		public TermExprContext termExpr(int i) {
			return getRuleContext(TermExprContext.class,i);
		}
		public List<ArithOpContext> arithOp() {
			return getRuleContexts(ArithOpContext.class);
		}
		public ArithOpContext arithOp(int i) {
			return getRuleContext(ArithOpContext.class,i);
		}
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterArithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitArithExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitArithExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		ArithExprContext _localctx = new ArithExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arithExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			termExpr();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(176);
				arithOp();
				setState(177);
				termExpr();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermExprContext extends ParserRuleContext {
		public List<FactorExprContext> factorExpr() {
			return getRuleContexts(FactorExprContext.class);
		}
		public FactorExprContext factorExpr(int i) {
			return getRuleContext(FactorExprContext.class,i);
		}
		public TermExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterTermExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitTermExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitTermExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermExprContext termExpr() throws RecognitionException {
		TermExprContext _localctx = new TermExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_termExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			factorExpr();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(185);
				match(T__8);
				setState(186);
				factorExpr();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorExprContext extends ParserRuleContext {
		public List<MessageExprContext> messageExpr() {
			return getRuleContexts(MessageExprContext.class);
		}
		public MessageExprContext messageExpr(int i) {
			return getRuleContext(MessageExprContext.class,i);
		}
		public FactorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterFactorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitFactorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitFactorExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorExprContext factorExpr() throws RecognitionException {
		FactorExprContext _localctx = new FactorExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factorExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			messageExpr();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(193);
				match(T__9);
				setState(194);
				messageExpr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenExpressionContext parenExpression() throws RecognitionException {
		ParenExpressionContext _localctx = new ParenExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parenExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__10);
			setState(198);
			expression();
			setState(199);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ParenExpressionContext parenExpression() {
			return getRuleContext(ParenExpressionContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atom);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case IntegerLiteral:
			case DoubleLiteral:
			case StringLiteral:
			case CharLiteral:
			case SymbolLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				literal();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				parenExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryMinusContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(LinguaMachinaParser.Minus, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public UnaryMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryMinusContext unaryMinus() throws RecognitionException {
		UnaryMinusContext _localctx = new UnaryMinusContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(Minus);
			setState(206);
			atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryNotContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public UnaryNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterUnaryNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitUnaryNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitUnaryNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryNotContext unaryNot() throws RecognitionException {
		UnaryNotContext _localctx = new UnaryNotContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unaryNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__12);
			setState(209);
			atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryContext extends ParserRuleContext {
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public UnaryNotContext unaryNot() {
			return getRuleContext(UnaryNotContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unary);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				unaryMinus();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				unaryNot();
				}
				break;
			case T__0:
			case T__3:
			case T__10:
			case IntegerLiteral:
			case DoubleLiteral:
			case StringLiteral:
			case CharLiteral:
			case SymbolLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageExprContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public MessageCascadeOrChainContext messageCascadeOrChain() {
			return getRuleContext(MessageCascadeOrChainContext.class,0);
		}
		public MessageExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterMessageExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitMessageExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitMessageExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageExprContext messageExpr() throws RecognitionException {
		MessageExprContext _localctx = new MessageExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_messageExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			unary();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(217);
				messageCascadeOrChain();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageSelectorContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ParamExpressionContext> paramExpression() {
			return getRuleContexts(ParamExpressionContext.class);
		}
		public ParamExpressionContext paramExpression(int i) {
			return getRuleContext(ParamExpressionContext.class,i);
		}
		public MessageSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterMessageSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitMessageSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitMessageSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageSelectorContext messageSelector() throws RecognitionException {
		MessageSelectorContext _localctx = new MessageSelectorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_messageSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(220);
			identifier();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(221);
				match(T__13);
				setState(222);
				paramExpression();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(223);
					identifier();
					setState(224);
					match(T__13);
					setState(225);
					paramExpression();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageCascadeOrChainContext extends ParserRuleContext {
		public MessageSelectorContext messageSelector() {
			return getRuleContext(MessageSelectorContext.class,0);
		}
		public MessageChainContext messageChain() {
			return getRuleContext(MessageChainContext.class,0);
		}
		public MessageCascadeContext messageCascade() {
			return getRuleContext(MessageCascadeContext.class,0);
		}
		public MessageCascadeOrChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageCascadeOrChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterMessageCascadeOrChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitMessageCascadeOrChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitMessageCascadeOrChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageCascadeOrChainContext messageCascadeOrChain() throws RecognitionException {
		MessageCascadeOrChainContext _localctx = new MessageCascadeOrChainContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_messageCascadeOrChain);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				messageSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				messageChain();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				messageCascade();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageCascadeContext extends ParserRuleContext {
		public MessageSelectorContext messageSelector() {
			return getRuleContext(MessageSelectorContext.class,0);
		}
		public List<MessageCascadeOrChainMemberContext> messageCascadeOrChainMember() {
			return getRuleContexts(MessageCascadeOrChainMemberContext.class);
		}
		public MessageCascadeOrChainMemberContext messageCascadeOrChainMember(int i) {
			return getRuleContext(MessageCascadeOrChainMemberContext.class,i);
		}
		public MessageCascadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageCascade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterMessageCascade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitMessageCascade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitMessageCascade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageCascadeContext messageCascade() throws RecognitionException {
		MessageCascadeContext _localctx = new MessageCascadeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_messageCascade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			messageSelector();
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240);
				match(T__4);
				setState(241);
				messageCascadeOrChainMember();
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageChainContext extends ParserRuleContext {
		public MessageSelectorContext messageSelector() {
			return getRuleContext(MessageSelectorContext.class,0);
		}
		public List<MessageCascadeOrChainMemberContext> messageCascadeOrChainMember() {
			return getRuleContexts(MessageCascadeOrChainMemberContext.class);
		}
		public MessageCascadeOrChainMemberContext messageCascadeOrChainMember(int i) {
			return getRuleContext(MessageCascadeOrChainMemberContext.class,i);
		}
		public MessageChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterMessageChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitMessageChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitMessageChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageChainContext messageChain() throws RecognitionException {
		MessageChainContext _localctx = new MessageChainContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_messageChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			messageSelector();
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
				match(T__14);
				setState(248);
				messageCascadeOrChainMember();
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageCascadeOrChainMemberContext extends ParserRuleContext {
		public MessageSelectorContext messageSelector() {
			return getRuleContext(MessageSelectorContext.class,0);
		}
		public MessageCascadeOrChainContext messageCascadeOrChain() {
			return getRuleContext(MessageCascadeOrChainContext.class,0);
		}
		public MessageCascadeOrChainMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageCascadeOrChainMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterMessageCascadeOrChainMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitMessageCascadeOrChainMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitMessageCascadeOrChainMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageCascadeOrChainMemberContext messageCascadeOrChainMember() throws RecognitionException {
		MessageCascadeOrChainMemberContext _localctx = new MessageCascadeOrChainMemberContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_messageCascadeOrChainMember);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				messageSelector();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(T__10);
				setState(255);
				messageCascadeOrChain();
				setState(256);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			identifier();
			setState(261);
			match(T__15);
			setState(262);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			identifier();
			setState(265);
			match(T__16);
			setState(266);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodParamsContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> keywords = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> params = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MethodParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterMethodParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitMethodParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitMethodParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParamsContext methodParams() throws RecognitionException {
		MethodParamsContext _localctx = new MethodParamsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(268);
			((MethodParamsContext)_localctx).identifier = identifier();
			((MethodParamsContext)_localctx).keywords.add(((MethodParamsContext)_localctx).identifier);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(269);
				match(T__13);
				setState(270);
				((MethodParamsContext)_localctx).identifier = identifier();
				((MethodParamsContext)_localctx).params.add(((MethodParamsContext)_localctx).identifier);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(271);
					((MethodParamsContext)_localctx).identifier = identifier();
					((MethodParamsContext)_localctx).keywords.add(((MethodParamsContext)_localctx).identifier);
					setState(272);
					match(T__13);
					setState(273);
					((MethodParamsContext)_localctx).identifier = identifier();
					((MethodParamsContext)_localctx).params.add(((MethodParamsContext)_localctx).identifier);
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodParamsContext methodParams() {
			return getRuleContext(MethodParamsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public CompileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterCompileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitCompileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitCompileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompileStatementContext compileStatement() throws RecognitionException {
		CompileStatementContext _localctx = new CompileStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_compileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			expression();
			setState(283);
			match(T__17);
			setState(284);
			methodParams();
			setState(285);
			match(T__3);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__12) | (1L << T__19) | (1L << IntegerLiteral) | (1L << DoubleLiteral) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << SymbolLiteral) | (1L << Identifier) | (1L << Lower) | (1L << Minus))) != 0)) {
				{
				setState(286);
				blockStatements();
				}
			}

			setState(289);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveDeclStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MethodParamsContext methodParams() {
			return getRuleContext(MethodParamsContext.class,0);
		}
		public SymbolLiteralContext symbolLiteral() {
			return getRuleContext(SymbolLiteralContext.class,0);
		}
		public PrimitiveDeclStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDeclStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterPrimitiveDeclStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitPrimitiveDeclStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitPrimitiveDeclStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveDeclStatementContext primitiveDeclStatement() throws RecognitionException {
		PrimitiveDeclStatementContext _localctx = new PrimitiveDeclStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primitiveDeclStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			expression();
			setState(292);
			match(T__18);
			setState(293);
			methodParams();
			setState(294);
			match(T__16);
			setState(295);
			symbolLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalReturnContext extends ParserRuleContext {
		public TerminalNode Lower() { return getToken(LinguaMachinaParser.Lower, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LocalReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterLocalReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitLocalReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitLocalReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalReturnContext localReturn() throws RecognitionException {
		LocalReturnContext _localctx = new LocalReturnContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_localReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(Lower);
			setState(298);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonLocalReturnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NonLocalReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonLocalReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterNonLocalReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitNonLocalReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitNonLocalReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonLocalReturnContext nonLocalReturn() throws RecognitionException {
		NonLocalReturnContext _localctx = new NonLocalReturnContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_nonLocalReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__19);
			setState(301);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalReturnContext localReturn() {
			return getRuleContext(LocalReturnContext.class,0);
		}
		public NonLocalReturnContext nonLocalReturn() {
			return getRuleContext(NonLocalReturnContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_blockStatement);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__10:
			case T__12:
			case IntegerLiteral:
			case DoubleLiteral:
			case StringLiteral:
			case CharLiteral:
			case SymbolLiteral:
			case Identifier:
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				statement();
				}
				break;
			case Lower:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				localReturn();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				nonLocalReturn();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public CompileStatementContext compileStatement() {
			return getRuleContext(CompileStatementContext.class,0);
		}
		public PrimitiveDeclStatementContext primitiveDeclStatement() {
			return getRuleContext(PrimitiveDeclStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statement);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				varDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				varAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				compileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				primitiveDeclStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_blockStatements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			blockStatement();
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(316);
					match(T__20);
					setState(317);
					blockStatement();
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(323);
				match(T__20);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			statement();
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(327);
					match(T__20);
					setState(328);
					statement();
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(334);
				match(T__20);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RootContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LinguaMachinaParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			statements();
			setState(338);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0157\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\3\13\7\13q\n\13\f\13\16\13t\13\13\5\13v\n"+
		"\13\3\13\3\13\3\f\3\f\6\f|\n\f\r\f\16\f}\3\f\5\f\u0081\n\f\3\f\5\f\u0084"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0090\n\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\7\20\u0099\n\20\f\20\16\20\u009c\13\20\3\21\3"+
		"\21\3\21\7\21\u00a1\n\21\f\21\16\21\u00a4\13\21\3\22\3\22\3\22\3\22\5"+
		"\22\u00aa\n\22\3\23\3\23\3\23\3\23\5\23\u00b0\n\23\3\24\3\24\3\24\3\24"+
		"\7\24\u00b6\n\24\f\24\16\24\u00b9\13\24\3\25\3\25\3\25\7\25\u00be\n\25"+
		"\f\25\16\25\u00c1\13\25\3\26\3\26\3\26\5\26\u00c6\n\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\5\30\u00ce\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\5\33\u00d9\n\33\3\34\3\34\5\34\u00dd\n\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\7\35\u00e6\n\35\f\35\16\35\u00e9\13\35\5\35\u00eb\n\35\3"+
		"\36\3\36\3\36\5\36\u00f0\n\36\3\37\3\37\3\37\6\37\u00f5\n\37\r\37\16\37"+
		"\u00f6\3 \3 \3 \6 \u00fc\n \r \16 \u00fd\3!\3!\3!\3!\3!\5!\u0105\n!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\7$\u0116\n$\f$\16$\u0119"+
		"\13$\5$\u011b\n$\3%\3%\3%\3%\3%\5%\u0122\n%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3)\3)\3)\5)\u0135\n)\3*\3*\3*\3*\3*\5*\u013c\n*\3"+
		"+\3+\3+\7+\u0141\n+\f+\16+\u0144\13+\3+\5+\u0147\n+\3,\3,\3,\7,\u014c"+
		"\n,\f,\16,\u014f\13,\3,\5,\u0152\n,\3-\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\5\3\2!$"+
		"\3\2%&\3\2\'(\2\u0155\2Z\3\2\2\2\4\\\3\2\2\2\6^\3\2\2\2\b`\3\2\2\2\nb"+
		"\3\2\2\2\fd\3\2\2\2\16f\3\2\2\2\20h\3\2\2\2\22j\3\2\2\2\24l\3\2\2\2\26"+
		"y\3\2\2\2\30\u008f\3\2\2\2\32\u0091\3\2\2\2\34\u0093\3\2\2\2\36\u0095"+
		"\3\2\2\2 \u009d\3\2\2\2\"\u00a5\3\2\2\2$\u00ab\3\2\2\2&\u00b1\3\2\2\2"+
		"(\u00ba\3\2\2\2*\u00c2\3\2\2\2,\u00c7\3\2\2\2.\u00cd\3\2\2\2\60\u00cf"+
		"\3\2\2\2\62\u00d2\3\2\2\2\64\u00d8\3\2\2\2\66\u00da\3\2\2\28\u00de\3\2"+
		"\2\2:\u00ef\3\2\2\2<\u00f1\3\2\2\2>\u00f8\3\2\2\2@\u0104\3\2\2\2B\u0106"+
		"\3\2\2\2D\u010a\3\2\2\2F\u010e\3\2\2\2H\u011c\3\2\2\2J\u0125\3\2\2\2L"+
		"\u012b\3\2\2\2N\u012e\3\2\2\2P\u0134\3\2\2\2R\u013b\3\2\2\2T\u013d\3\2"+
		"\2\2V\u0148\3\2\2\2X\u0153\3\2\2\2Z[\t\2\2\2[\3\3\2\2\2\\]\t\3\2\2]\5"+
		"\3\2\2\2^_\t\4\2\2_\7\3\2\2\2`a\7\33\2\2a\t\3\2\2\2bc\7\34\2\2c\13\3\2"+
		"\2\2de\7\35\2\2e\r\3\2\2\2fg\7\36\2\2g\17\3\2\2\2hi\7\37\2\2i\21\3\2\2"+
		"\2jk\7 \2\2k\23\3\2\2\2lu\7\3\2\2mr\5\32\16\2no\7\4\2\2oq\5\32\16\2pn"+
		"\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2um\3\2\2\2u"+
		"v\3\2\2\2vw\3\2\2\2wx\7\5\2\2x\25\3\2\2\2y\u0080\7\6\2\2z|\7\32\2\2{z"+
		"\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0081\7\7\2\2"+
		"\u0080{\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\5"+
		"T+\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\7\b\2\2\u0086\27\3\2\2\2\u0087\u0090\5\b\5\2\u0088\u0090\5\n\6"+
		"\2\u0089\u0090\5\f\7\2\u008a\u0090\5\16\b\2\u008b\u0090\5\20\t\2\u008c"+
		"\u0090\5\22\n\2\u008d\u0090\5\24\13\2\u008e\u0090\5\26\f\2\u008f\u0087"+
		"\3\2\2\2\u008f\u0088\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u008f"+
		"\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2"+
		"\2\2\u0090\31\3\2\2\2\u0091\u0092\5\36\20\2\u0092\33\3\2\2\2\u0093\u0094"+
		"\5\64\33\2\u0094\35\3\2\2\2\u0095\u009a\5 \21\2\u0096\u0097\7\t\2\2\u0097"+
		"\u0099\5 \21\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\37\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a2"+
		"\5\"\22\2\u009e\u009f\7\n\2\2\u009f\u00a1\5\"\22\2\u00a0\u009e\3\2\2\2"+
		"\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3!\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a9\5$\23\2\u00a6\u00a7\5\4\3\2\u00a7"+
		"\u00a8\5$\23\2\u00a8\u00aa\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa#\3\2\2\2\u00ab\u00af\5&\24\2\u00ac\u00ad\5\2\2\2\u00ad\u00ae"+
		"\5&\24\2\u00ae\u00b0\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"%\3\2\2\2\u00b1\u00b7\5(\25\2\u00b2\u00b3\5\6\4\2\u00b3\u00b4\5(\25\2"+
		"\u00b4\u00b6\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\'\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bf\5*\26\2\u00bb\u00bc\7\13\2\2\u00bc\u00be\5*\26\2\u00bd\u00bb\3"+
		"\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		")\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\5\66\34\2\u00c3\u00c4\7\f\2"+
		"\2\u00c4\u00c6\5\66\34\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"+\3\2\2\2\u00c7\u00c8\7\r\2\2\u00c8\u00c9\5\32\16\2\u00c9\u00ca\7\16\2"+
		"\2\u00ca-\3\2\2\2\u00cb\u00ce\5\30\r\2\u00cc\u00ce\5,\27\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce/\3\2\2\2\u00cf\u00d0\7(\2\2\u00d0\u00d1"+
		"\5.\30\2\u00d1\61\3\2\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d4\5.\30\2\u00d4"+
		"\63\3\2\2\2\u00d5\u00d9\5\60\31\2\u00d6\u00d9\5\62\32\2\u00d7\u00d9\5"+
		".\30\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\65\3\2\2\2\u00da\u00dc\5\64\33\2\u00db\u00dd\5:\36\2\u00dc\u00db\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\67\3\2\2\2\u00de\u00ea\5\22\n\2\u00df\u00e0"+
		"\7\20\2\2\u00e0\u00e7\5\34\17\2\u00e1\u00e2\5\22\n\2\u00e2\u00e3\7\20"+
		"\2\2\u00e3\u00e4\5\34\17\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00df\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"9\3\2\2\2\u00ec\u00f0\58\35\2\u00ed\u00f0\5> \2\u00ee\u00f0\5<\37\2\u00ef"+
		"\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0;\3\2\2\2"+
		"\u00f1\u00f4\58\35\2\u00f2\u00f3\7\7\2\2\u00f3\u00f5\5@!\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"=\3\2\2\2\u00f8\u00fb\58\35\2\u00f9\u00fa\7\21\2\2\u00fa\u00fc\5@!\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe?\3\2\2\2\u00ff\u0105\58\35\2\u0100\u0101\7\r\2\2\u0101\u0102"+
		"\5:\36\2\u0102\u0103\7\16\2\2\u0103\u0105\3\2\2\2\u0104\u00ff\3\2\2\2"+
		"\u0104\u0100\3\2\2\2\u0105A\3\2\2\2\u0106\u0107\5\22\n\2\u0107\u0108\7"+
		"\22\2\2\u0108\u0109\5\32\16\2\u0109C\3\2\2\2\u010a\u010b\5\22\n\2\u010b"+
		"\u010c\7\23\2\2\u010c\u010d\5\32\16\2\u010dE\3\2\2\2\u010e\u011a\5\22"+
		"\n\2\u010f\u0110\7\20\2\2\u0110\u0117\5\22\n\2\u0111\u0112\5\22\n\2\u0112"+
		"\u0113\7\20\2\2\u0113\u0114\5\22\n\2\u0114\u0116\3\2\2\2\u0115\u0111\3"+
		"\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u010f\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011bG\3\2\2\2\u011c\u011d\5\32\16\2\u011d\u011e\7\24\2\2\u011e\u011f"+
		"\5F$\2\u011f\u0121\7\6\2\2\u0120\u0122\5T+\2\u0121\u0120\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\b\2\2\u0124I\3\2\2\2"+
		"\u0125\u0126\5\32\16\2\u0126\u0127\7\25\2\2\u0127\u0128\5F$\2\u0128\u0129"+
		"\7\23\2\2\u0129\u012a\5\20\t\2\u012aK\3\2\2\2\u012b\u012c\7#\2\2\u012c"+
		"\u012d\5\32\16\2\u012dM\3\2\2\2\u012e\u012f\7\26\2\2\u012f\u0130\5\32"+
		"\16\2\u0130O\3\2\2\2\u0131\u0135\5R*\2\u0132\u0135\5L\'\2\u0133\u0135"+
		"\5N(\2\u0134\u0131\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135"+
		"Q\3\2\2\2\u0136\u013c\5\32\16\2\u0137\u013c\5B\"\2\u0138\u013c\5D#\2\u0139"+
		"\u013c\5H%\2\u013a\u013c\5J&\2\u013b\u0136\3\2\2\2\u013b\u0137\3\2\2\2"+
		"\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013cS\3"+
		"\2\2\2\u013d\u0142\5P)\2\u013e\u013f\7\27\2\2\u013f\u0141\5P)\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\7\27\2\2\u0146"+
		"\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147U\3\2\2\2\u0148\u014d\5R*\2\u0149"+
		"\u014a\7\27\2\2\u014a\u014c\5R*\2\u014b\u0149\3\2\2\2\u014c\u014f\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0152\7\27\2\2\u0151\u0150\3\2\2\2\u0151\u0152\3"+
		"\2\2\2\u0152W\3\2\2\2\u0153\u0154\5V,\2\u0154\u0155\7\2\2\3\u0155Y\3\2"+
		"\2\2!ru}\u0080\u0083\u008f\u009a\u00a2\u00a9\u00af\u00b7\u00bf\u00c5\u00cd"+
		"\u00d8\u00dc\u00e7\u00ea\u00ef\u00f6\u00fd\u0104\u0117\u011a\u0121\u0134"+
		"\u013b\u0142\u0146\u014d\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}