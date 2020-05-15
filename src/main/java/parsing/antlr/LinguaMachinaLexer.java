// Generated from /home/elyan/Documents/KLinguaMachina/src/main/antlr/parsing/antlr/LinguaMachina.g4 by ANTLR 4.8
package parsing.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguaMachinaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "WS", "COMMENT", "Digit", "Ident", 
			"BlockLiteralParam", "IntegerLiteral", "DoubleLiteral", "StringLiteral", 
			"CharLiteral", "SymbolLiteral", "Identifier", "LowerOrEq", "GreaterOrEq", 
			"Lower", "Greater", "Equal", "NotEqual", "Plus", "Minus"
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


	public LinguaMachinaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LinguaMachina.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6\27"+
		"\u0085\n\27\r\27\16\27\u0086\3\27\3\27\3\30\3\30\7\30\u008d\n\30\f\30"+
		"\16\30\u0090\13\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\7\32\u009a"+
		"\n\32\f\32\16\32\u009d\13\32\3\33\3\33\3\33\3\34\6\34\u00a3\n\34\r\34"+
		"\16\34\u00a4\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u00b5\n\35\3\36\3\36\3\36\3\36\7\36\u00bb\n\36\f\36"+
		"\16\36\u00be\13\36\3\36\3\36\3\37\3\37\3\37\3 \3 \6 \u00c7\n \r \16 \u00c8"+
		"\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)"+
		"\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\32\67\339\34"+
		";\35=\36?\37A C!E\"G#I$K%M&O\'Q(\3\2\t\5\2\13\f\17\17\"\"\3\2%%\3\2\62"+
		";\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\b\2&&\60\60\62<C\\aac|\2\u00e6\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13"+
		"[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21b\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27"+
		"i\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37q\3\2\2\2!t\3\2\2\2#w"+
		"\3\2\2\2%y\3\2\2\2\'|\3\2\2\2)\177\3\2\2\2+\u0081\3\2\2\2-\u0084\3\2\2"+
		"\2/\u008a\3\2\2\2\61\u0095\3\2\2\2\63\u0097\3\2\2\2\65\u009e\3\2\2\2\67"+
		"\u00a2\3\2\2\29\u00b4\3\2\2\2;\u00b6\3\2\2\2=\u00c1\3\2\2\2?\u00c4\3\2"+
		"\2\2A\u00ca\3\2\2\2C\u00cc\3\2\2\2E\u00cf\3\2\2\2G\u00d2\3\2\2\2I\u00d4"+
		"\3\2\2\2K\u00d6\3\2\2\2M\u00d9\3\2\2\2O\u00dc\3\2\2\2Q\u00de\3\2\2\2S"+
		"T\7]\2\2T\4\3\2\2\2UV\7.\2\2V\6\3\2\2\2WX\7_\2\2X\b\3\2\2\2YZ\7}\2\2Z"+
		"\n\3\2\2\2[\\\7~\2\2\\\f\3\2\2\2]^\7\177\2\2^\16\3\2\2\2_`\7~\2\2`a\7"+
		"~\2\2a\20\3\2\2\2bc\7(\2\2cd\7(\2\2d\22\3\2\2\2ef\7,\2\2f\24\3\2\2\2g"+
		"h\7\61\2\2h\26\3\2\2\2ij\7*\2\2j\30\3\2\2\2kl\7+\2\2l\32\3\2\2\2mn\7#"+
		"\2\2n\34\3\2\2\2op\7<\2\2p\36\3\2\2\2qr\7~\2\2rs\7@\2\2s \3\2\2\2tu\7"+
		"<\2\2uv\7?\2\2v\"\3\2\2\2wx\7?\2\2x$\3\2\2\2yz\7@\2\2z{\7@\2\2{&\3\2\2"+
		"\2|}\7<\2\2}~\7<\2\2~(\3\2\2\2\177\u0080\7`\2\2\u0080*\3\2\2\2\u0081\u0082"+
		"\7=\2\2\u0082,\3\2\2\2\u0083\u0085\t\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\b\27\2\2\u0089.\3\2\2\2\u008a\u008e\7%\2\2\u008b\u008d\n\3\2\2"+
		"\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7%\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\b\30\2\2\u0094\60\3\2\2\2\u0095\u0096\t\4\2"+
		"\2\u0096\62\3\2\2\2\u0097\u009b\t\5\2\2\u0098\u009a\t\6\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\64\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7<\2\2\u009f\u00a0\5\63\32"+
		"\2\u00a0\66\3\2\2\2\u00a1\u00a3\5\61\31\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a58\3\2\2\2\u00a6"+
		"\u00a7\5\67\34\2\u00a7\u00a8\7\60\2\2\u00a8\u00a9\5\67\34\2\u00a9\u00aa"+
		"\7g\2\2\u00aa\u00ab\5\67\34\2\u00ab\u00b5\3\2\2\2\u00ac\u00ad\5\67\34"+
		"\2\u00ad\u00ae\7\60\2\2\u00ae\u00af\5\67\34\2\u00af\u00b5\3\2\2\2\u00b0"+
		"\u00b1\5\67\34\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\5\67\34\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00a6\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5"+
		":\3\2\2\2\u00b6\u00bc\7$\2\2\u00b7\u00b8\7^\2\2\u00b8\u00bb\13\2\2\2\u00b9"+
		"\u00bb\n\7\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c0\7$\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7&\2\2\u00c2"+
		"\u00c3\n\2\2\2\u00c3>\3\2\2\2\u00c4\u00c6\7)\2\2\u00c5\u00c7\t\b\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9@\3\2\2\2\u00ca\u00cb\5\63\32\2\u00cbB\3\2\2\2\u00cc\u00cd\7"+
		">\2\2\u00cd\u00ce\7?\2\2\u00ceD\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0\u00d1"+
		"\7?\2\2\u00d1F\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3H\3\2\2\2\u00d4\u00d5\7"+
		"@\2\2\u00d5J\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7\u00d8\7?\2\2\u00d8L\3\2"+
		"\2\2\u00d9\u00da\7#\2\2\u00da\u00db\7?\2\2\u00dbN\3\2\2\2\u00dc\u00dd"+
		"\7-\2\2\u00ddP\3\2\2\2\u00de\u00df\7/\2\2\u00dfR\3\2\2\2\13\2\u0086\u008e"+
		"\u009b\u00a4\u00b4\u00ba\u00bc\u00c8\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}