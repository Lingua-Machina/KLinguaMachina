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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		WS=25, COMMENT=26, BlockLiteralParam=27, IntegerLiteral=28, DoubleLiteral=29, 
		StringLiteral=30, CharLiteral=31, SymbolLiteral=32, Identifier=33, LowerOrEq=34, 
		GreaterOrEq=35, Lower=36, Greater=37;
	public static final int
		RULE_compOp = 0, RULE_arrayLiteral = 1, RULE_blockLiteral = 2, RULE_literal = 3, 
		RULE_expression = 4, RULE_paramExpression = 5, RULE_orExpr = 6, RULE_andExpr = 7, 
		RULE_eqExpr = 8, RULE_compExpr = 9, RULE_arithExpr = 10, RULE_termExpr = 11, 
		RULE_factorExpr = 12, RULE_atom = 13, RULE_unary = 14, RULE_messageExpr = 15, 
		RULE_messageSelector = 16, RULE_messageCascadeOrChain = 17, RULE_messageCascade = 18, 
		RULE_messageChain = 19, RULE_messageCascadeOrChainMember = 20, RULE_varDeclaration = 21, 
		RULE_varAssignment = 22, RULE_compileStatementMethodParams = 23, RULE_compileStatement = 24, 
		RULE_blockStatement = 25, RULE_statement = 26, RULE_blockStatements = 27, 
		RULE_statements = 28, RULE_root = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"compOp", "arrayLiteral", "blockLiteral", "literal", "expression", "paramExpression", 
			"orExpr", "andExpr", "eqExpr", "compExpr", "arithExpr", "termExpr", "factorExpr", 
			"atom", "unary", "messageExpr", "messageSelector", "messageCascadeOrChain", 
			"messageCascade", "messageChain", "messageCascadeOrChainMember", "varDeclaration", 
			"varAssignment", "compileStatementMethodParams", "compileStatement", 
			"blockStatement", "statement", "blockStatements", "statements", "root"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'{'", "'|'", "'}'", "'||'", "'&&'", "'=='", 
			"'!='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'!'", "':'", "'|>'", 
			"':='", "'='", "'>>'", "'^'", "';'", null, null, null, null, null, null, 
			null, null, null, "'<='", "'>='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "COMMENT", "BlockLiteralParam", "IntegerLiteral", "DoubleLiteral", 
			"StringLiteral", "CharLiteral", "SymbolLiteral", "Identifier", "LowerOrEq", 
			"GreaterOrEq", "Lower", "Greater"
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
			setState(60);
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> items = new ArrayList<ExpressionContext>();
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
		enterRule(_localctx, 2, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << IntegerLiteral) | (1L << DoubleLiteral) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << SymbolLiteral) | (1L << Identifier))) != 0)) {
				{
				setState(63);
				((ArrayLiteralContext)_localctx).expression = expression();
				((ArrayLiteralContext)_localctx).items.add(((ArrayLiteralContext)_localctx).expression);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(64);
					match(T__1);
					setState(65);
					((ArrayLiteralContext)_localctx).expression = expression();
					((ArrayLiteralContext)_localctx).items.add(((ArrayLiteralContext)_localctx).expression);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(73);
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
		enterRule(_localctx, 4, RULE_blockLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__3);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BlockLiteralParam) {
				{
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76);
					((BlockLiteralContext)_localctx).BlockLiteralParam = match(BlockLiteralParam);
					((BlockLiteralContext)_localctx).params.add(((BlockLiteralContext)_localctx).BlockLiteralParam);
					}
					}
					setState(79); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BlockLiteralParam );
				setState(81);
				match(T__4);
				}
			}

			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__22) | (1L << IntegerLiteral) | (1L << DoubleLiteral) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << SymbolLiteral) | (1L << Identifier) | (1L << Lower))) != 0)) {
				{
				setState(84);
				blockStatements();
				}
			}

			setState(87);
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
		public TerminalNode IntegerLiteral() { return getToken(LinguaMachinaParser.IntegerLiteral, 0); }
		public TerminalNode DoubleLiteral() { return getToken(LinguaMachinaParser.DoubleLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(LinguaMachinaParser.StringLiteral, 0); }
		public TerminalNode CharLiteral() { return getToken(LinguaMachinaParser.CharLiteral, 0); }
		public TerminalNode SymbolLiteral() { return getToken(LinguaMachinaParser.SymbolLiteral, 0); }
		public TerminalNode Identifier() { return getToken(LinguaMachinaParser.Identifier, 0); }
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
		enterRule(_localctx, 6, RULE_literal);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(IntegerLiteral);
				}
				break;
			case DoubleLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(DoubleLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(StringLiteral);
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(CharLiteral);
				}
				break;
			case SymbolLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(SymbolLiteral);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				match(Identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
				arrayLiteral();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
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
		enterRule(_localctx, 8, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
		enterRule(_localctx, 10, RULE_paramExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
		enterRule(_localctx, 12, RULE_orExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			andExpr();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(104);
				match(T__6);
				setState(105);
				andExpr();
				}
				}
				setState(110);
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
		enterRule(_localctx, 14, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			eqExpr();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(112);
				match(T__7);
				setState(113);
				eqExpr();
				}
				}
				setState(118);
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
		enterRule(_localctx, 16, RULE_eqExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			compExpr();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(120);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
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
		enterRule(_localctx, 18, RULE_compExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			arithExpr();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LowerOrEq) | (1L << GreaterOrEq) | (1L << Lower) | (1L << Greater))) != 0)) {
				{
				setState(125);
				compOp();
				setState(126);
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
		enterRule(_localctx, 20, RULE_arithExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			termExpr();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				{
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				termExpr();
				}
				}
				setState(137);
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
		enterRule(_localctx, 22, RULE_termExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			factorExpr();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(139);
				match(T__12);
				setState(140);
				factorExpr();
				}
				}
				setState(145);
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
		enterRule(_localctx, 24, RULE_factorExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			messageExpr();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(147);
				match(T__13);
				setState(148);
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

	public static class AtomContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 26, RULE_atom);
		try {
			setState(156);
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
				setState(151);
				literal();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__14);
				setState(153);
				expression();
				setState(154);
				match(T__15);
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

	public static class UnaryContext extends ParserRuleContext {
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
		enterRule(_localctx, 28, RULE_unary);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__11);
				setState(159);
				atom();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__16);
				setState(161);
				atom();
				}
				break;
			case T__0:
			case T__3:
			case T__14:
			case IntegerLiteral:
			case DoubleLiteral:
			case StringLiteral:
			case CharLiteral:
			case SymbolLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
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
		public UnaryContext receiver;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public MessageSelectorContext messageSelector() {
			return getRuleContext(MessageSelectorContext.class,0);
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
		enterRule(_localctx, 30, RULE_messageExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((MessageExprContext)_localctx).receiver = unary();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(166);
				messageSelector();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__18) {
					{
					setState(167);
					messageCascadeOrChain();
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

	public static class MessageSelectorContext extends ParserRuleContext {
		public Token Identifier;
		public List<Token> keywords = new ArrayList<Token>();
		public ParamExpressionContext paramExpression;
		public List<ParamExpressionContext> values = new ArrayList<ParamExpressionContext>();
		public List<TerminalNode> Identifier() { return getTokens(LinguaMachinaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(LinguaMachinaParser.Identifier, i);
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
		enterRule(_localctx, 32, RULE_messageSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(172);
			((MessageSelectorContext)_localctx).Identifier = match(Identifier);
			((MessageSelectorContext)_localctx).keywords.add(((MessageSelectorContext)_localctx).Identifier);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(173);
				match(T__17);
				setState(174);
				((MessageSelectorContext)_localctx).paramExpression = paramExpression();
				((MessageSelectorContext)_localctx).values.add(((MessageSelectorContext)_localctx).paramExpression);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(175);
					((MessageSelectorContext)_localctx).Identifier = match(Identifier);
					((MessageSelectorContext)_localctx).keywords.add(((MessageSelectorContext)_localctx).Identifier);
					setState(176);
					match(T__17);
					setState(177);
					((MessageSelectorContext)_localctx).paramExpression = paramExpression();
					((MessageSelectorContext)_localctx).values.add(((MessageSelectorContext)_localctx).paramExpression);
					}
					}
					setState(182);
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
		enterRule(_localctx, 34, RULE_messageCascadeOrChain);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				messageChain();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				messageCascade();
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

	public static class MessageCascadeContext extends ParserRuleContext {
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
		enterRule(_localctx, 36, RULE_messageCascade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				match(T__4);
				setState(190);
				messageCascadeOrChainMember();
				}
				}
				setState(193); 
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
		enterRule(_localctx, 38, RULE_messageChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(195);
				match(T__18);
				setState(196);
				messageCascadeOrChainMember();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 );
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
		enterRule(_localctx, 40, RULE_messageCascadeOrChainMember);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				messageSelector();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__14);
				setState(203);
				messageSelector();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__18) {
					{
					setState(204);
					messageCascadeOrChain();
					}
				}

				setState(207);
				match(T__15);
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
		public TerminalNode Identifier() { return getToken(LinguaMachinaParser.Identifier, 0); }
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
		enterRule(_localctx, 42, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(Identifier);
			setState(212);
			match(T__19);
			setState(213);
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
		public TerminalNode Identifier() { return getToken(LinguaMachinaParser.Identifier, 0); }
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
		enterRule(_localctx, 44, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(Identifier);
			setState(216);
			match(T__20);
			setState(217);
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

	public static class CompileStatementMethodParamsContext extends ParserRuleContext {
		public Token Identifier;
		public List<Token> keywords = new ArrayList<Token>();
		public List<Token> variables = new ArrayList<Token>();
		public List<TerminalNode> Identifier() { return getTokens(LinguaMachinaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(LinguaMachinaParser.Identifier, i);
		}
		public CompileStatementMethodParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compileStatementMethodParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterCompileStatementMethodParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitCompileStatementMethodParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitCompileStatementMethodParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompileStatementMethodParamsContext compileStatementMethodParams() throws RecognitionException {
		CompileStatementMethodParamsContext _localctx = new CompileStatementMethodParamsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compileStatementMethodParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(219);
			((CompileStatementMethodParamsContext)_localctx).Identifier = match(Identifier);
			((CompileStatementMethodParamsContext)_localctx).keywords.add(((CompileStatementMethodParamsContext)_localctx).Identifier);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(220);
				match(T__17);
				setState(221);
				((CompileStatementMethodParamsContext)_localctx).Identifier = match(Identifier);
				((CompileStatementMethodParamsContext)_localctx).variables.add(((CompileStatementMethodParamsContext)_localctx).Identifier);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(222);
					((CompileStatementMethodParamsContext)_localctx).Identifier = match(Identifier);
					((CompileStatementMethodParamsContext)_localctx).keywords.add(((CompileStatementMethodParamsContext)_localctx).Identifier);
					setState(223);
					match(T__17);
					setState(224);
					((CompileStatementMethodParamsContext)_localctx).Identifier = match(Identifier);
					((CompileStatementMethodParamsContext)_localctx).variables.add(((CompileStatementMethodParamsContext)_localctx).Identifier);
					}
					}
					setState(229);
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
		public CompileStatementMethodParamsContext compileStatementMethodParams() {
			return getRuleContext(CompileStatementMethodParamsContext.class,0);
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
		enterRule(_localctx, 48, RULE_compileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expression();
			setState(233);
			match(T__21);
			setState(234);
			compileStatementMethodParams();
			setState(235);
			match(T__3);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__14) | (1L << T__16) | (1L << T__22) | (1L << IntegerLiteral) | (1L << DoubleLiteral) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << SymbolLiteral) | (1L << Identifier) | (1L << Lower))) != 0)) {
				{
				setState(236);
				blockStatements();
				}
			}

			setState(239);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	 
		public BlockStatementContext() { }
		public void copyFrom(BlockStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalStatementContext extends BlockStatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public NormalStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterNormalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitNormalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitNormalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonLocalReturnContext extends BlockStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NonLocalReturnContext(BlockStatementContext ctx) { copyFrom(ctx); }
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
	public static class LocalReturnContext extends BlockStatementContext {
		public TerminalNode Lower() { return getToken(LinguaMachinaParser.Lower, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LocalReturnContext(BlockStatementContext ctx) { copyFrom(ctx); }
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

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_blockStatement);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__11:
			case T__14:
			case T__16:
			case IntegerLiteral:
			case DoubleLiteral:
			case StringLiteral:
			case CharLiteral:
			case SymbolLiteral:
			case Identifier:
				_localctx = new NormalStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				statement();
				}
				break;
			case Lower:
				_localctx = new LocalReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(Lower);
				setState(243);
				expression();
				}
				break;
			case T__22:
				_localctx = new NonLocalReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(T__22);
				setState(245);
				expression();
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
		enterRule(_localctx, 52, RULE_statement);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				varDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				varAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				compileStatement();
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
		public BlockStatementContext blockStatement;
		public List<BlockStatementContext> stmts = new ArrayList<BlockStatementContext>();
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
		enterRule(_localctx, 54, RULE_blockStatements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			((BlockStatementsContext)_localctx).blockStatement = blockStatement();
			((BlockStatementsContext)_localctx).stmts.add(((BlockStatementsContext)_localctx).blockStatement);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(255);
					match(T__23);
					setState(256);
					((BlockStatementsContext)_localctx).blockStatement = blockStatement();
					((BlockStatementsContext)_localctx).stmts.add(((BlockStatementsContext)_localctx).blockStatement);
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(262);
				match(T__23);
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
		public StatementContext statement;
		public List<StatementContext> stmts = new ArrayList<StatementContext>();
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
		enterRule(_localctx, 56, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((StatementsContext)_localctx).statement = statement();
			((StatementsContext)_localctx).stmts.add(((StatementsContext)_localctx).statement);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(266);
					match(T__23);
					setState(267);
					((StatementsContext)_localctx).statement = statement();
					((StatementsContext)_localctx).stmts.add(((StatementsContext)_localctx).statement);
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(273);
				match(T__23);
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
		enterRule(_localctx, 58, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			statements();
			setState(277);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u011a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\5\3J\n\3\3\3\3\3\3\4\3\4\6\4P\n"+
		"\4\r\4\16\4Q\3\4\5\4U\n\4\3\4\5\4X\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5d\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b"+
		"\3\t\3\t\3\t\7\tu\n\t\f\t\16\tx\13\t\3\n\3\n\3\n\5\n}\n\n\3\13\3\13\3"+
		"\13\3\13\5\13\u0083\n\13\3\f\3\f\3\f\7\f\u0088\n\f\f\f\16\f\u008b\13\f"+
		"\3\r\3\r\3\r\7\r\u0090\n\r\f\r\16\r\u0093\13\r\3\16\3\16\3\16\5\16\u0098"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u009f\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00a6\n\20\3\21\3\21\3\21\5\21\u00ab\n\21\5\21\u00ad\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00b5\n\22\f\22\16\22\u00b8\13\22\5\22\u00ba"+
		"\n\22\3\23\3\23\5\23\u00be\n\23\3\24\3\24\6\24\u00c2\n\24\r\24\16\24\u00c3"+
		"\3\25\3\25\6\25\u00c8\n\25\r\25\16\25\u00c9\3\26\3\26\3\26\3\26\5\26\u00d0"+
		"\n\26\3\26\3\26\5\26\u00d4\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00e4\n\31\f\31\16\31\u00e7\13\31"+
		"\5\31\u00e9\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u00f0\n\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u00f9\n\33\3\34\3\34\3\34\3\34\5\34\u00ff"+
		"\n\34\3\35\3\35\3\35\7\35\u0104\n\35\f\35\16\35\u0107\13\35\3\35\5\35"+
		"\u010a\n\35\3\36\3\36\3\36\7\36\u010f\n\36\f\36\16\36\u0112\13\36\3\36"+
		"\5\36\u0115\n\36\3\37\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<\2\5\3\2$\'\3\2\13\f\3\2\r\16\2\u0126"+
		"\2>\3\2\2\2\4@\3\2\2\2\6M\3\2\2\2\bc\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16"+
		"i\3\2\2\2\20q\3\2\2\2\22y\3\2\2\2\24~\3\2\2\2\26\u0084\3\2\2\2\30\u008c"+
		"\3\2\2\2\32\u0094\3\2\2\2\34\u009e\3\2\2\2\36\u00a5\3\2\2\2 \u00a7\3\2"+
		"\2\2\"\u00ae\3\2\2\2$\u00bd\3\2\2\2&\u00c1\3\2\2\2(\u00c7\3\2\2\2*\u00d3"+
		"\3\2\2\2,\u00d5\3\2\2\2.\u00d9\3\2\2\2\60\u00dd\3\2\2\2\62\u00ea\3\2\2"+
		"\2\64\u00f8\3\2\2\2\66\u00fe\3\2\2\28\u0100\3\2\2\2:\u010b\3\2\2\2<\u0116"+
		"\3\2\2\2>?\t\2\2\2?\3\3\2\2\2@I\7\3\2\2AF\5\n\6\2BC\7\4\2\2CE\5\n\6\2"+
		"DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HF\3\2\2\2IA\3\2\2\2"+
		"IJ\3\2\2\2JK\3\2\2\2KL\7\5\2\2L\5\3\2\2\2MT\7\6\2\2NP\7\35\2\2ON\3\2\2"+
		"\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2SU\7\7\2\2TO\3\2\2\2TU\3\2\2"+
		"\2UW\3\2\2\2VX\58\35\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\b\2\2Z\7\3\2"+
		"\2\2[d\7\36\2\2\\d\7\37\2\2]d\7 \2\2^d\7!\2\2_d\7\"\2\2`d\7#\2\2ad\5\4"+
		"\3\2bd\5\6\4\2c[\3\2\2\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2c`\3"+
		"\2\2\2ca\3\2\2\2cb\3\2\2\2d\t\3\2\2\2ef\5\16\b\2f\13\3\2\2\2gh\5\36\20"+
		"\2h\r\3\2\2\2in\5\20\t\2jk\7\t\2\2km\5\20\t\2lj\3\2\2\2mp\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2o\17\3\2\2\2pn\3\2\2\2qv\5\22\n\2rs\7\n\2\2su\5\22\n\2"+
		"tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\21\3\2\2\2xv\3\2\2\2y|\5\24"+
		"\13\2z{\t\3\2\2{}\5\24\13\2|z\3\2\2\2|}\3\2\2\2}\23\3\2\2\2~\u0082\5\26"+
		"\f\2\177\u0080\5\2\2\2\u0080\u0081\5\26\f\2\u0081\u0083\3\2\2\2\u0082"+
		"\177\3\2\2\2\u0082\u0083\3\2\2\2\u0083\25\3\2\2\2\u0084\u0089\5\30\r\2"+
		"\u0085\u0086\t\4\2\2\u0086\u0088\5\30\r\2\u0087\u0085\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\27\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u0091\5\32\16\2\u008d\u008e\7\17\2\2\u008e\u0090"+
		"\5\32\16\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\31\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0097"+
		"\5 \21\2\u0095\u0096\7\20\2\2\u0096\u0098\5 \21\2\u0097\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\33\3\2\2\2\u0099\u009f\5\b\5\2\u009a\u009b"+
		"\7\21\2\2\u009b\u009c\5\n\6\2\u009c\u009d\7\22\2\2\u009d\u009f\3\2\2\2"+
		"\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009f\35\3\2\2\2\u00a0\u00a1"+
		"\7\16\2\2\u00a1\u00a6\5\34\17\2\u00a2\u00a3\7\23\2\2\u00a3\u00a6\5\34"+
		"\17\2\u00a4\u00a6\5\34\17\2\u00a5\u00a0\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\37\3\2\2\2\u00a7\u00ac\5\36\20\2\u00a8\u00aa\5\""+
		"\22\2\u00a9\u00ab\5$\23\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad!\3\2\2\2"+
		"\u00ae\u00b9\7#\2\2\u00af\u00b0\7\24\2\2\u00b0\u00b6\5\f\7\2\u00b1\u00b2"+
		"\7#\2\2\u00b2\u00b3\7\24\2\2\u00b3\u00b5\5\f\7\2\u00b4\u00b1\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"#\3\2\2\2\u00bb\u00be\5(\25\2\u00bc\u00be\5&\24\2\u00bd\u00bb\3\2\2\2"+
		"\u00bd\u00bc\3\2\2\2\u00be%\3\2\2\2\u00bf\u00c0\7\7\2\2\u00c0\u00c2\5"+
		"*\26\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\'\3\2\2\2\u00c5\u00c6\7\25\2\2\u00c6\u00c8\5*\26"+
		"\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca)\3\2\2\2\u00cb\u00d4\5\"\22\2\u00cc\u00cd\7\21\2\2\u00cd"+
		"\u00cf\5\"\22\2\u00ce\u00d0\5$\23\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\22\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00cb\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d4+\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6"+
		"\u00d7\7\26\2\2\u00d7\u00d8\5\n\6\2\u00d8-\3\2\2\2\u00d9\u00da\7#\2\2"+
		"\u00da\u00db\7\27\2\2\u00db\u00dc\5\n\6\2\u00dc/\3\2\2\2\u00dd\u00e8\7"+
		"#\2\2\u00de\u00df\7\24\2\2\u00df\u00e5\7#\2\2\u00e0\u00e1\7#\2\2\u00e1"+
		"\u00e2\7\24\2\2\u00e2\u00e4\7#\2\2\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\61\3\2\2"+
		"\2\u00ea\u00eb\5\n\6\2\u00eb\u00ec\7\30\2\2\u00ec\u00ed\5\60\31\2\u00ed"+
		"\u00ef\7\6\2\2\u00ee\u00f0\58\35\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\b\2\2\u00f2\63\3\2\2\2\u00f3\u00f9"+
		"\5\66\34\2\u00f4\u00f5\7&\2\2\u00f5\u00f9\5\n\6\2\u00f6\u00f7\7\31\2\2"+
		"\u00f7\u00f9\5\n\6\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f9\65\3\2\2\2\u00fa\u00ff\5\n\6\2\u00fb\u00ff\5,\27\2\u00fc"+
		"\u00ff\5.\30\2\u00fd\u00ff\5\62\32\2\u00fe\u00fa\3\2\2\2\u00fe\u00fb\3"+
		"\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\67\3\2\2\2\u0100"+
		"\u0105\5\64\33\2\u0101\u0102\7\32\2\2\u0102\u0104\5\64\33\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010a\7\32\2\2\u0109\u0108\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a9\3\2\2\2\u010b\u0110\5\66\34\2\u010c"+
		"\u010d\7\32\2\2\u010d\u010f\5\66\34\2\u010e\u010c\3\2\2\2\u010f\u0112"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0115\7\32\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3"+
		"\2\2\2\u0115;\3\2\2\2\u0116\u0117\5:\36\2\u0117\u0118\7\2\2\3\u0118=\3"+
		"\2\2\2#FIQTWcnv|\u0082\u0089\u0091\u0097\u009e\u00a5\u00aa\u00ac\u00b6"+
		"\u00b9\u00bd\u00c3\u00c9\u00cf\u00d3\u00e5\u00e8\u00ef\u00f8\u00fe\u0105"+
		"\u0109\u0110\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}