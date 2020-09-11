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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, WS=23, COMMENT=24, BlockLiteralParam=25, 
		IntegerLiteral=26, DoubleLiteral=27, StringLiteral=28, CharLiteral=29, 
		SymbolLiteral=30, Identifier=31, LowerOrEq=32, GreaterOrEq=33, Lower=34, 
		Greater=35, Equal=36, NotEqual=37, Plus=38, Minus=39;
	public static final int
		RULE_compOp = 0, RULE_eqOp = 1, RULE_arithOp = 2, RULE_integerLiteral = 3, 
		RULE_doubleLiteral = 4, RULE_stringLiteral = 5, RULE_charLiteral = 6, 
		RULE_symbolLiteral = 7, RULE_identifier = 8, RULE_arrayLiteral = 9, RULE_blockLiteral = 10, 
		RULE_literal = 11, RULE_expression = 12, RULE_paramExpression = 13, RULE_orExpr = 14, 
		RULE_andExpr = 15, RULE_eqExpr = 16, RULE_compExpr = 17, RULE_arithExpr = 18, 
		RULE_termExpr = 19, RULE_factorExpr = 20, RULE_moduloExpr = 21, RULE_parenExpression = 22, 
		RULE_atom = 23, RULE_unaryMinus = 24, RULE_unaryNot = 25, RULE_unary = 26, 
		RULE_messageExpr = 27, RULE_messageSelector = 28, RULE_messageCascadeOrChain = 29, 
		RULE_messageCascade = 30, RULE_messageChain = 31, RULE_messageCascadeOrChainMember = 32, 
		RULE_varDeclaration = 33, RULE_varAssignment = 34, RULE_methodParams = 35, 
		RULE_compileStatement = 36, RULE_primitiveDeclStatement = 37, RULE_localReturn = 38, 
		RULE_nonLocalReturn = 39, RULE_blockStatement = 40, RULE_statement = 41, 
		RULE_blockStatements = 42, RULE_statements = 43, RULE_root = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"compOp", "eqOp", "arithOp", "integerLiteral", "doubleLiteral", "stringLiteral", 
			"charLiteral", "symbolLiteral", "identifier", "arrayLiteral", "blockLiteral", 
			"literal", "expression", "paramExpression", "orExpr", "andExpr", "eqExpr", 
			"compExpr", "arithExpr", "termExpr", "factorExpr", "moduloExpr", "parenExpression", 
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
			"'/'", "'%'", "'('", "')'", "'!'", "':'", "'|>'", "':='", "'='", "'>>'", 
			"'::'", "'^'", "';'", null, null, null, null, null, null, null, null, 
			null, "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"COMMENT", "BlockLiteralParam", "IntegerLiteral", "DoubleLiteral", "StringLiteral", 
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
			setState(90);
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
			setState(92);
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
			setState(94);
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
			setState(96);
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
			setState(98);
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
			setState(100);
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
			setState(102);
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
			setState(104);
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
			setState(106);
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
			setState(108);
			match(T__0);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__13) | (1L << IntegerLiteral) | (1L << DoubleLiteral) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << SymbolLiteral) | (1L << Identifier) | (1L << Minus))) != 0)) {
				{
				setState(109);
				expression();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(110);
					match(T__1);
					setState(111);
					expression();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(119);
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
			setState(121);
			match(T__3);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BlockLiteralParam) {
				{
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(122);
					((BlockLiteralContext)_localctx).BlockLiteralParam = match(BlockLiteralParam);
					((BlockLiteralContext)_localctx).params.add(((BlockLiteralContext)_localctx).BlockLiteralParam);
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BlockLiteralParam );
				setState(127);
				match(T__4);
				}
			}

			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__13) | (1L << T__20) | (1L << IntegerLiteral) | (1L << DoubleLiteral) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << SymbolLiteral) | (1L << Identifier) | (1L << Lower) | (1L << Minus))) != 0)) {
				{
				setState(130);
				blockStatements();
				}
			}

			setState(133);
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				integerLiteral();
				}
				break;
			case DoubleLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				doubleLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				stringLiteral();
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				charLiteral();
				}
				break;
			case SymbolLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				symbolLiteral();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				identifier();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				arrayLiteral();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
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
			setState(145);
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
			setState(147);
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
			setState(149);
			andExpr();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(150);
				match(T__6);
				setState(151);
				andExpr();
				}
				}
				setState(156);
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
			setState(157);
			eqExpr();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(158);
				match(T__7);
				setState(159);
				eqExpr();
				}
				}
				setState(164);
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
			setState(165);
			compExpr();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal || _la==NotEqual) {
				{
				setState(166);
				eqOp();
				setState(167);
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
			setState(171);
			arithExpr();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LowerOrEq) | (1L << GreaterOrEq) | (1L << Lower) | (1L << Greater))) != 0)) {
				{
				setState(172);
				compOp();
				setState(173);
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
			setState(177);
			termExpr();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(178);
				arithOp();
				setState(179);
				termExpr();
				}
				}
				setState(185);
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
			setState(186);
			factorExpr();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(187);
				match(T__8);
				setState(188);
				factorExpr();
				}
				}
				setState(193);
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
		public List<ModuloExprContext> moduloExpr() {
			return getRuleContexts(ModuloExprContext.class);
		}
		public ModuloExprContext moduloExpr(int i) {
			return getRuleContext(ModuloExprContext.class,i);
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
			setState(194);
			moduloExpr();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(195);
				match(T__9);
				setState(196);
				moduloExpr();
				}
				}
				setState(201);
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

	public static class ModuloExprContext extends ParserRuleContext {
		public List<MessageExprContext> messageExpr() {
			return getRuleContexts(MessageExprContext.class);
		}
		public MessageExprContext messageExpr(int i) {
			return getRuleContext(MessageExprContext.class,i);
		}
		public ModuloExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduloExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).enterModuloExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaMachinaListener ) ((LinguaMachinaListener)listener).exitModuloExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguaMachinaVisitor ) return ((LinguaMachinaVisitor<? extends T>)visitor).visitModuloExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuloExprContext moduloExpr() throws RecognitionException {
		ModuloExprContext _localctx = new ModuloExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_moduloExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			messageExpr();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(203);
				match(T__10);
				setState(204);
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
		enterRule(_localctx, 44, RULE_parenExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__11);
			setState(208);
			expression();
			setState(209);
			match(T__12);
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
		enterRule(_localctx, 46, RULE_atom);
		try {
			setState(213);
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
				setState(211);
				literal();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
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
		enterRule(_localctx, 48, RULE_unaryMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(Minus);
			setState(216);
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
		enterRule(_localctx, 50, RULE_unaryNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__13);
			setState(219);
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
		enterRule(_localctx, 52, RULE_unary);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				unaryMinus();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				unaryNot();
				}
				break;
			case T__0:
			case T__3:
			case T__11:
			case IntegerLiteral:
			case DoubleLiteral:
			case StringLiteral:
			case CharLiteral:
			case SymbolLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
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
		enterRule(_localctx, 54, RULE_messageExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			unary();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(227);
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
		enterRule(_localctx, 56, RULE_messageSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(230);
			identifier();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(231);
				match(T__14);
				setState(232);
				paramExpression();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(233);
					identifier();
					setState(234);
					match(T__14);
					setState(235);
					paramExpression();
					}
					}
					setState(241);
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
		enterRule(_localctx, 58, RULE_messageCascadeOrChain);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				messageSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				messageChain();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
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
		enterRule(_localctx, 60, RULE_messageCascade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			messageSelector();
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				match(T__4);
				setState(251);
				messageCascadeOrChainMember();
				}
				}
				setState(254); 
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
		enterRule(_localctx, 62, RULE_messageChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			messageSelector();
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(257);
				match(T__15);
				setState(258);
				messageCascadeOrChainMember();
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
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
		enterRule(_localctx, 64, RULE_messageCascadeOrChainMember);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				messageSelector();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__11);
				setState(265);
				messageCascadeOrChain();
				setState(266);
				match(T__12);
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
		enterRule(_localctx, 66, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			identifier();
			setState(271);
			match(T__16);
			setState(272);
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
		enterRule(_localctx, 68, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			identifier();
			setState(275);
			match(T__17);
			setState(276);
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
		enterRule(_localctx, 70, RULE_methodParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(278);
			((MethodParamsContext)_localctx).identifier = identifier();
			((MethodParamsContext)_localctx).keywords.add(((MethodParamsContext)_localctx).identifier);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(279);
				match(T__14);
				setState(280);
				((MethodParamsContext)_localctx).identifier = identifier();
				((MethodParamsContext)_localctx).params.add(((MethodParamsContext)_localctx).identifier);
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(281);
					((MethodParamsContext)_localctx).identifier = identifier();
					((MethodParamsContext)_localctx).keywords.add(((MethodParamsContext)_localctx).identifier);
					setState(282);
					match(T__14);
					setState(283);
					((MethodParamsContext)_localctx).identifier = identifier();
					((MethodParamsContext)_localctx).params.add(((MethodParamsContext)_localctx).identifier);
					}
					}
					setState(289);
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
		enterRule(_localctx, 72, RULE_compileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			expression();
			setState(293);
			match(T__18);
			setState(294);
			methodParams();
			setState(295);
			match(T__3);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__11) | (1L << T__13) | (1L << T__20) | (1L << IntegerLiteral) | (1L << DoubleLiteral) | (1L << StringLiteral) | (1L << CharLiteral) | (1L << SymbolLiteral) | (1L << Identifier) | (1L << Lower) | (1L << Minus))) != 0)) {
				{
				setState(296);
				blockStatements();
				}
			}

			setState(299);
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
		enterRule(_localctx, 74, RULE_primitiveDeclStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			expression();
			setState(302);
			match(T__19);
			setState(303);
			methodParams();
			setState(304);
			match(T__17);
			setState(305);
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
		enterRule(_localctx, 76, RULE_localReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(Lower);
			setState(308);
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
		enterRule(_localctx, 78, RULE_nonLocalReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__20);
			setState(311);
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
		enterRule(_localctx, 80, RULE_blockStatement);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__11:
			case T__13:
			case IntegerLiteral:
			case DoubleLiteral:
			case StringLiteral:
			case CharLiteral:
			case SymbolLiteral:
			case Identifier:
			case Minus:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				statement();
				}
				break;
			case Lower:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				localReturn();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
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
		enterRule(_localctx, 82, RULE_statement);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				varDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				varAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				compileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
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
		enterRule(_localctx, 84, RULE_blockStatements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			blockStatement();
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					match(T__21);
					setState(327);
					blockStatement();
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(333);
				match(T__21);
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
		enterRule(_localctx, 86, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			statement();
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(337);
					match(T__21);
					setState(338);
					statement();
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(344);
				match(T__21);
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
		enterRule(_localctx, 88, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			statements();
			setState(348);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0161\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\7\13s\n\13\f\13\16\13v\13\13\5"+
		"\13x\n\13\3\13\3\13\3\f\3\f\6\f~\n\f\r\f\16\f\177\3\f\5\f\u0083\n\f\3"+
		"\f\5\f\u0086\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0092\n\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\7\20\u009b\n\20\f\20\16\20\u009e\13"+
		"\20\3\21\3\21\3\21\7\21\u00a3\n\21\f\21\16\21\u00a6\13\21\3\22\3\22\3"+
		"\22\3\22\5\22\u00ac\n\22\3\23\3\23\3\23\3\23\5\23\u00b2\n\23\3\24\3\24"+
		"\3\24\3\24\7\24\u00b8\n\24\f\24\16\24\u00bb\13\24\3\25\3\25\3\25\7\25"+
		"\u00c0\n\25\f\25\16\25\u00c3\13\25\3\26\3\26\3\26\7\26\u00c8\n\26\f\26"+
		"\16\26\u00cb\13\26\3\27\3\27\3\27\5\27\u00d0\n\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\5\31\u00d8\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\5\34\u00e3\n\34\3\35\3\35\5\35\u00e7\n\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\7\36\u00f0\n\36\f\36\16\36\u00f3\13\36\5\36\u00f5\n\36\3\37\3"+
		"\37\3\37\5\37\u00fa\n\37\3 \3 \3 \6 \u00ff\n \r \16 \u0100\3!\3!\3!\6"+
		"!\u0106\n!\r!\16!\u0107\3\"\3\"\3\"\3\"\3\"\5\"\u010f\n\"\3#\3#\3#\3#"+
		"\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\7%\u0120\n%\f%\16%\u0123\13%\5%\u0125"+
		"\n%\3&\3&\3&\3&\3&\5&\u012c\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3)\3)\3)\3*\3*\3*\5*\u013f\n*\3+\3+\3+\3+\3+\5+\u0146\n+\3,\3,\3,\7,"+
		"\u014b\n,\f,\16,\u014e\13,\3,\5,\u0151\n,\3-\3-\3-\7-\u0156\n-\f-\16-"+
		"\u0159\13-\3-\5-\u015c\n-\3.\3.\3.\3.\2\2/\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\5\3\2\"%\3\2&\'"+
		"\3\2()\2\u015f\2\\\3\2\2\2\4^\3\2\2\2\6`\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2"+
		"\ff\3\2\2\2\16h\3\2\2\2\20j\3\2\2\2\22l\3\2\2\2\24n\3\2\2\2\26{\3\2\2"+
		"\2\30\u0091\3\2\2\2\32\u0093\3\2\2\2\34\u0095\3\2\2\2\36\u0097\3\2\2\2"+
		" \u009f\3\2\2\2\"\u00a7\3\2\2\2$\u00ad\3\2\2\2&\u00b3\3\2\2\2(\u00bc\3"+
		"\2\2\2*\u00c4\3\2\2\2,\u00cc\3\2\2\2.\u00d1\3\2\2\2\60\u00d7\3\2\2\2\62"+
		"\u00d9\3\2\2\2\64\u00dc\3\2\2\2\66\u00e2\3\2\2\28\u00e4\3\2\2\2:\u00e8"+
		"\3\2\2\2<\u00f9\3\2\2\2>\u00fb\3\2\2\2@\u0102\3\2\2\2B\u010e\3\2\2\2D"+
		"\u0110\3\2\2\2F\u0114\3\2\2\2H\u0118\3\2\2\2J\u0126\3\2\2\2L\u012f\3\2"+
		"\2\2N\u0135\3\2\2\2P\u0138\3\2\2\2R\u013e\3\2\2\2T\u0145\3\2\2\2V\u0147"+
		"\3\2\2\2X\u0152\3\2\2\2Z\u015d\3\2\2\2\\]\t\2\2\2]\3\3\2\2\2^_\t\3\2\2"+
		"_\5\3\2\2\2`a\t\4\2\2a\7\3\2\2\2bc\7\34\2\2c\t\3\2\2\2de\7\35\2\2e\13"+
		"\3\2\2\2fg\7\36\2\2g\r\3\2\2\2hi\7\37\2\2i\17\3\2\2\2jk\7 \2\2k\21\3\2"+
		"\2\2lm\7!\2\2m\23\3\2\2\2nw\7\3\2\2ot\5\32\16\2pq\7\4\2\2qs\5\32\16\2"+
		"rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wo\3\2\2\2"+
		"wx\3\2\2\2xy\3\2\2\2yz\7\5\2\2z\25\3\2\2\2{\u0082\7\6\2\2|~\7\33\2\2}"+
		"|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0083\7\7\2\2\u0082}\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085"+
		"\3\2\2\2\u0084\u0086\5V,\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\7\b\2\2\u0088\27\3\2\2\2\u0089\u0092\5\b\5"+
		"\2\u008a\u0092\5\n\6\2\u008b\u0092\5\f\7\2\u008c\u0092\5\16\b\2\u008d"+
		"\u0092\5\20\t\2\u008e\u0092\5\22\n\2\u008f\u0092\5\24\13\2\u0090\u0092"+
		"\5\26\f\2\u0091\u0089\3\2\2\2\u0091\u008a\3\2\2\2\u0091\u008b\3\2\2\2"+
		"\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0090\3\2\2\2\u0092\31\3\2\2\2\u0093\u0094\5\36\20\2\u0094"+
		"\33\3\2\2\2\u0095\u0096\5\66\34\2\u0096\35\3\2\2\2\u0097\u009c\5 \21\2"+
		"\u0098\u0099\7\t\2\2\u0099\u009b\5 \21\2\u009a\u0098\3\2\2\2\u009b\u009e"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\37\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a4\5\"\22\2\u00a0\u00a1\7\n\2\2\u00a1\u00a3\5"+
		"\"\22\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5!\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ab\5$\23\2"+
		"\u00a8\u00a9\5\4\3\2\u00a9\u00aa\5$\23\2\u00aa\u00ac\3\2\2\2\u00ab\u00a8"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac#\3\2\2\2\u00ad\u00b1\5&\24\2\u00ae"+
		"\u00af\5\2\2\2\u00af\u00b0\5&\24\2\u00b0\u00b2\3\2\2\2\u00b1\u00ae\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2%\3\2\2\2\u00b3\u00b9\5(\25\2\u00b4\u00b5"+
		"\5\6\4\2\u00b5\u00b6\5(\25\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\'\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bc\u00c1\5*\26\2\u00bd\u00be\7\13\2\2\u00be\u00c0"+
		"\5*\26\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2)\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c9\5,\27\2"+
		"\u00c5\u00c6\7\f\2\2\u00c6\u00c8\5,\27\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca+\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cf\58\35\2\u00cd\u00ce\7\r\2\2\u00ce\u00d0\58"+
		"\35\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0-\3\2\2\2\u00d1\u00d2"+
		"\7\16\2\2\u00d2\u00d3\5\32\16\2\u00d3\u00d4\7\17\2\2\u00d4/\3\2\2\2\u00d5"+
		"\u00d8\5\30\r\2\u00d6\u00d8\5.\30\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3"+
		"\2\2\2\u00d8\61\3\2\2\2\u00d9\u00da\7)\2\2\u00da\u00db\5\60\31\2\u00db"+
		"\63\3\2\2\2\u00dc\u00dd\7\20\2\2\u00dd\u00de\5\60\31\2\u00de\65\3\2\2"+
		"\2\u00df\u00e3\5\62\32\2\u00e0\u00e3\5\64\33\2\u00e1\u00e3\5\60\31\2\u00e2"+
		"\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\67\3\2\2"+
		"\2\u00e4\u00e6\5\66\34\2\u00e5\u00e7\5<\37\2\u00e6\u00e5\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e79\3\2\2\2\u00e8\u00f4\5\22\n\2\u00e9\u00ea\7\21\2"+
		"\2\u00ea\u00f1\5\34\17\2\u00eb\u00ec\5\22\n\2\u00ec\u00ed\7\21\2\2\u00ed"+
		"\u00ee\5\34\17\2\u00ee\u00f0\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0\u00f3\3"+
		"\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00e9\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5;\3\2\2\2"+
		"\u00f6\u00fa\5:\36\2\u00f7\u00fa\5@!\2\u00f8\u00fa\5> \2\u00f9\u00f6\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa=\3\2\2\2\u00fb\u00fe"+
		"\5:\36\2\u00fc\u00fd\7\7\2\2\u00fd\u00ff\5B\"\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101?\3\2\2\2"+
		"\u0102\u0105\5:\36\2\u0103\u0104\7\22\2\2\u0104\u0106\5B\"\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"A\3\2\2\2\u0109\u010f\5:\36\2\u010a\u010b\7\16\2\2\u010b\u010c\5<\37\2"+
		"\u010c\u010d\7\17\2\2\u010d\u010f\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010a"+
		"\3\2\2\2\u010fC\3\2\2\2\u0110\u0111\5\22\n\2\u0111\u0112\7\23\2\2\u0112"+
		"\u0113\5\32\16\2\u0113E\3\2\2\2\u0114\u0115\5\22\n\2\u0115\u0116\7\24"+
		"\2\2\u0116\u0117\5\32\16\2\u0117G\3\2\2\2\u0118\u0124\5\22\n\2\u0119\u011a"+
		"\7\21\2\2\u011a\u0121\5\22\n\2\u011b\u011c\5\22\n\2\u011c\u011d\7\21\2"+
		"\2\u011d\u011e\5\22\n\2\u011e\u0120\3\2\2\2\u011f\u011b\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0125\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u0119\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"I\3\2\2\2\u0126\u0127\5\32\16\2\u0127\u0128\7\25\2\2\u0128\u0129\5H%\2"+
		"\u0129\u012b\7\6\2\2\u012a\u012c\5V,\2\u012b\u012a\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\b\2\2\u012eK\3\2\2\2\u012f"+
		"\u0130\5\32\16\2\u0130\u0131\7\26\2\2\u0131\u0132\5H%\2\u0132\u0133\7"+
		"\24\2\2\u0133\u0134\5\20\t\2\u0134M\3\2\2\2\u0135\u0136\7$\2\2\u0136\u0137"+
		"\5\32\16\2\u0137O\3\2\2\2\u0138\u0139\7\27\2\2\u0139\u013a\5\32\16\2\u013a"+
		"Q\3\2\2\2\u013b\u013f\5T+\2\u013c\u013f\5N(\2\u013d\u013f\5P)\2\u013e"+
		"\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013fS\3\2\2\2"+
		"\u0140\u0146\5\32\16\2\u0141\u0146\5D#\2\u0142\u0146\5F$\2\u0143\u0146"+
		"\5J&\2\u0144\u0146\5L\'\2\u0145\u0140\3\2\2\2\u0145\u0141\3\2\2\2\u0145"+
		"\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146U\3\2\2\2"+
		"\u0147\u014c\5R*\2\u0148\u0149\7\30\2\2\u0149\u014b\5R*\2\u014a\u0148"+
		"\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\7\30\2\2\u0150\u014f\3"+
		"\2\2\2\u0150\u0151\3\2\2\2\u0151W\3\2\2\2\u0152\u0157\5T+\2\u0153\u0154"+
		"\7\30\2\2\u0154\u0156\5T+\2\u0155\u0153\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015c\7\30\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"Y\3\2\2\2\u015d\u015e\5X-\2\u015e\u015f\7\2\2\3\u015f[\3\2\2\2\"tw\177"+
		"\u0082\u0085\u0091\u009c\u00a4\u00ab\u00b1\u00b9\u00c1\u00c9\u00cf\u00d7"+
		"\u00e2\u00e6\u00f1\u00f4\u00f9\u0100\u0107\u010e\u0121\u0124\u012b\u013e"+
		"\u0145\u014c\u0150\u0157\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}