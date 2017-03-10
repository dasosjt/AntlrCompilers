// Generated from DECAF.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DECAFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, STRUCT=2, TRUE=3, FALSE=4, INT=5, IF=6, ELSE=7, WHILE=8, RETURN=9, 
		CHAR=10, BOOLEAN=11, VOID=12, SCAN=13, PRINT=14, WS=15, CHR=16, ID=17, 
		NUM=18, STRING=19, COMMENT=20, COMA=21, AND=22, OR=23, LBRACE=24, RBRACE=25, 
		DOTCOMMA=26, RCORCH=27, LCORCH=28, LPARENT=29, RPARENT=30, EQ=31, DOT=32, 
		PLUS=33, MINUS=34, EXC=35, AST=36, SLSH=37, PRCNT=38, MTHAN=39, LTHAN=40, 
		EQMTHAN=41, EQLTHAN=42, EQEQ=43, NOTEQ=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CLASS", "STRUCT", "TRUE", "FALSE", "INT", "IF", "ELSE", "WHILE", "RETURN", 
		"CHAR", "BOOLEAN", "VOID", "SCAN", "PRINT", "LETTER", "WS", "DIGIT", "CHR", 
		"ID", "NUM", "STRING", "COMMENT", "COMA", "AND", "OR", "LBRACE", "RBRACE", 
		"DOTCOMMA", "RCORCH", "LCORCH", "LPARENT", "RPARENT", "EQ", "DOT", "PLUS", 
		"MINUS", "EXC", "AST", "SLSH", "PRCNT", "MTHAN", "LTHAN", "EQMTHAN", "EQLTHAN", 
		"EQEQ", "NOTEQ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'struct'", "'true'", "'false'", "'int'", "'if'", "'else'", 
		"'while'", "'return'", "'char'", "'boolean'", "'void'", "'scan'", "'print'", 
		null, null, null, null, null, null, "','", "'&&'", "'||'", "'{'", "'}'", 
		"';'", "']'", "'['", "'('", "')'", "'='", "'.'", "'+'", "'-'", "'!'", 
		"'*'", "'/'", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CLASS", "STRUCT", "TRUE", "FALSE", "INT", "IF", "ELSE", "WHILE", 
		"RETURN", "CHAR", "BOOLEAN", "VOID", "SCAN", "PRINT", "WS", "CHR", "ID", 
		"NUM", "STRING", "COMMENT", "COMA", "AND", "OR", "LBRACE", "RBRACE", "DOTCOMMA", 
		"RCORCH", "LCORCH", "LPARENT", "RPARENT", "EQ", "DOT", "PLUS", "MINUS", 
		"EXC", "AST", "SLSH", "PRCNT", "MTHAN", "LTHAN", "EQMTHAN", "EQLTHAN", 
		"EQEQ", "NOTEQ"
	};
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


	public DECAFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DECAF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0128\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\6\21\u00b1\n\21\r\21\16\21\u00b2\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c5"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\7\24\u00cc\n\24\f\24\16\24\u00cf\13\24"+
		"\3\25\6\25\u00d2\n\25\r\25\16\25\u00d3\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\6\26\u00e2\n\26\r\26\16\26\u00e3\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\7\27\u00ec\n\27\f\27\16\27\u00ef\13\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\2\2\60"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\2!\21#\2%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35"+
		"=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-].\3\2\b\4\2C\\c|\5\2\13\f\17\17"+
		"\"\"\5\2$(,,``\n\2$$))..\60\60<>@Bbb\u0080\u0080\f\2$$))..\60\60<>@B^"+
		"^bbuu\u0080\u0080\4\2\f\f\17\17\u013f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2!\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3"+
		"_\3\2\2\2\5e\3\2\2\2\7l\3\2\2\2\tq\3\2\2\2\13w\3\2\2\2\r{\3\2\2\2\17~"+
		"\3\2\2\2\21\u0083\3\2\2\2\23\u0089\3\2\2\2\25\u0090\3\2\2\2\27\u0095\3"+
		"\2\2\2\31\u009d\3\2\2\2\33\u00a2\3\2\2\2\35\u00a7\3\2\2\2\37\u00ad\3\2"+
		"\2\2!\u00b0\3\2\2\2#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00c8\3\2\2\2)\u00d1"+
		"\3\2\2\2+\u00d5\3\2\2\2-\u00e7\3\2\2\2/\u00f2\3\2\2\2\61\u00f4\3\2\2\2"+
		"\63\u00f7\3\2\2\2\65\u00fa\3\2\2\2\67\u00fc\3\2\2\29\u00fe\3\2\2\2;\u0100"+
		"\3\2\2\2=\u0102\3\2\2\2?\u0104\3\2\2\2A\u0106\3\2\2\2C\u0108\3\2\2\2E"+
		"\u010a\3\2\2\2G\u010c\3\2\2\2I\u010e\3\2\2\2K\u0110\3\2\2\2M\u0112\3\2"+
		"\2\2O\u0114\3\2\2\2Q\u0116\3\2\2\2S\u0118\3\2\2\2U\u011a\3\2\2\2W\u011c"+
		"\3\2\2\2Y\u011f\3\2\2\2[\u0122\3\2\2\2]\u0125\3\2\2\2_`\7e\2\2`a\7n\2"+
		"\2ab\7c\2\2bc\7u\2\2cd\7u\2\2d\4\3\2\2\2ef\7u\2\2fg\7v\2\2gh\7t\2\2hi"+
		"\7w\2\2ij\7e\2\2jk\7v\2\2k\6\3\2\2\2lm\7v\2\2mn\7t\2\2no\7w\2\2op\7g\2"+
		"\2p\b\3\2\2\2qr\7h\2\2rs\7c\2\2st\7n\2\2tu\7u\2\2uv\7g\2\2v\n\3\2\2\2"+
		"wx\7k\2\2xy\7p\2\2yz\7v\2\2z\f\3\2\2\2{|\7k\2\2|}\7h\2\2}\16\3\2\2\2~"+
		"\177\7g\2\2\177\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082"+
		"\20\3\2\2\2\u0083\u0084\7y\2\2\u0084\u0085\7j\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\22\3\2\2\2\u0089\u008a\7t\2\2\u008a"+
		"\u008b\7g\2\2\u008b\u008c\7v\2\2\u008c\u008d\7w\2\2\u008d\u008e\7t\2\2"+
		"\u008e\u008f\7p\2\2\u008f\24\3\2\2\2\u0090\u0091\7e\2\2\u0091\u0092\7"+
		"j\2\2\u0092\u0093\7c\2\2\u0093\u0094\7t\2\2\u0094\26\3\2\2\2\u0095\u0096"+
		"\7d\2\2\u0096\u0097\7q\2\2\u0097\u0098\7q\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7g\2\2\u009a\u009b\7c\2\2\u009b\u009c\7p\2\2\u009c\30\3\2\2\2\u009d"+
		"\u009e\7x\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7f\2\2"+
		"\u00a1\32\3\2\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7"+
		"c\2\2\u00a5\u00a6\7p\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\7r\2\2\u00a8\u00a9"+
		"\7t\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\36\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae \3\2\2\2\u00af\u00b1\t\3\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\21\2\2\u00b5\"\3\2\2\2\u00b6\u00b7"+
		"\4\62;\2\u00b7$\3\2\2\2\u00b8\u00c4\7)\2\2\u00b9\u00c5\5\37\20\2\u00ba"+
		"\u00c5\5#\22\2\u00bb\u00c5\7\"\2\2\u00bc\u00c5\5K&\2\u00bd\u00c5\t\4\2"+
		"\2\u00be\u00c5\5? \2\u00bf\u00c5\5A!\2\u00c0\u00c5\5G$\2\u00c1\u00c5\7"+
		"a\2\2\u00c2\u00c5\5I%\2\u00c3\u00c5\t\5\2\2\u00c4\u00b9\3\2\2\2\u00c4"+
		"\u00ba\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00bd\3\2"+
		"\2\2\u00c4\u00be\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4"+
		"\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c7\7)\2\2\u00c7&\3\2\2\2\u00c8\u00cd\5\37\20\2\u00c9\u00cc"+
		"\5#\22\2\u00ca\u00cc\5\37\20\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2"+
		"\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce(\3"+
		"\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\5#\22\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4*\3\2\2\2"+
		"\u00d5\u00e1\7$\2\2\u00d6\u00e2\5\37\20\2\u00d7\u00e2\5#\22\2\u00d8\u00e2"+
		"\7\"\2\2\u00d9\u00e2\5K&\2\u00da\u00e2\t\4\2\2\u00db\u00e2\5? \2\u00dc"+
		"\u00e2\5A!\2\u00dd\u00e2\5G$\2\u00de\u00e2\7a\2\2\u00df\u00e2\5I%\2\u00e0"+
		"\u00e2\t\6\2\2\u00e1\u00d6\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00d8\3\2"+
		"\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00da\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1"+
		"\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7$\2\2\u00e6,\3\2\2\2\u00e7"+
		"\u00e8\7\61\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ed\3\2\2\2\u00ea\u00ec\n"+
		"\7\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\b\27"+
		"\3\2\u00f1.\3\2\2\2\u00f2\u00f3\7.\2\2\u00f3\60\3\2\2\2\u00f4\u00f5\7"+
		"(\2\2\u00f5\u00f6\7(\2\2\u00f6\62\3\2\2\2\u00f7\u00f8\7~\2\2\u00f8\u00f9"+
		"\7~\2\2\u00f9\64\3\2\2\2\u00fa\u00fb\7}\2\2\u00fb\66\3\2\2\2\u00fc\u00fd"+
		"\7\177\2\2\u00fd8\3\2\2\2\u00fe\u00ff\7=\2\2\u00ff:\3\2\2\2\u0100\u0101"+
		"\7_\2\2\u0101<\3\2\2\2\u0102\u0103\7]\2\2\u0103>\3\2\2\2\u0104\u0105\7"+
		"*\2\2\u0105@\3\2\2\2\u0106\u0107\7+\2\2\u0107B\3\2\2\2\u0108\u0109\7?"+
		"\2\2\u0109D\3\2\2\2\u010a\u010b\7\60\2\2\u010bF\3\2\2\2\u010c\u010d\7"+
		"-\2\2\u010dH\3\2\2\2\u010e\u010f\7/\2\2\u010fJ\3\2\2\2\u0110\u0111\7#"+
		"\2\2\u0111L\3\2\2\2\u0112\u0113\7,\2\2\u0113N\3\2\2\2\u0114\u0115\7\61"+
		"\2\2\u0115P\3\2\2\2\u0116\u0117\7\'\2\2\u0117R\3\2\2\2\u0118\u0119\7@"+
		"\2\2\u0119T\3\2\2\2\u011a\u011b\7>\2\2\u011bV\3\2\2\2\u011c\u011d\7@\2"+
		"\2\u011d\u011e\7?\2\2\u011eX\3\2\2\2\u011f\u0120\7>\2\2\u0120\u0121\7"+
		"?\2\2\u0121Z\3\2\2\2\u0122\u0123\7?\2\2\u0123\u0124\7?\2\2\u0124\\\3\2"+
		"\2\2\u0125\u0126\7#\2\2\u0126\u0127\7?\2\2\u0127^\3\2\2\2\13\2\u00b2\u00c4"+
		"\u00cb\u00cd\u00d3\u00e1\u00e3\u00ed\4\2\3\2\3\27\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}