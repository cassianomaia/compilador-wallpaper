// Generated from /docs/home-hdd/jbarbirato-hdd/Documents/UFSCar/CC2/compilador-wallpaper/src/main/antlr4/wallpaper.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class wallpaperLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, HEX=15, NUM_INT=16, NUM_REAL=17, 
		WS=18, ENDL=19, IDENT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "LETRA", "ALGARISMO", "HEX", 
		"NUM_INT", "NUM_REAL", "WS", "ENDL", "IDENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Img'", "';'", "'='", "'{'", "'}'", "'['", "']'", "'id'", "'cor'", 
		"'tamanho'", "'('", "','", "')'", "'retornar'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "HEX", "NUM_INT", "NUM_REAL", "WS", "ENDL", "IDENT"
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


	public wallpaperLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "wallpaper.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\6\22f\n\22\r\22\16\22g\3\23\6\23k\n\23\r\23\16\23"+
		"l\3\24\6\24p\n\24\r\24\16\24q\3\24\3\24\6\24v\n\24\r\24\16\24w\3\25\3"+
		"\25\3\25\3\25\3\26\5\26\177\n\26\3\26\3\26\3\27\3\27\5\27\u0085\n\27\3"+
		"\27\3\27\3\27\7\27\u008a\n\27\f\27\16\27\u008d\13\27\2\2\30\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\21"+
		"%\22\'\23)\24+\25-\26\3\2\5\4\2C\\c|\3\2\62;\4\2\13\f\17\17\2\u0093\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2"+
		"\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23B\3\2"+
		"\2\2\25F\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33R\3\2\2\2\35T\3\2\2\2\37]\3"+
		"\2\2\2!_\3\2\2\2#a\3\2\2\2%j\3\2\2\2\'o\3\2\2\2)y\3\2\2\2+~\3\2\2\2-\u0084"+
		"\3\2\2\2/\60\7K\2\2\60\61\7o\2\2\61\62\7i\2\2\62\4\3\2\2\2\63\64\7=\2"+
		"\2\64\6\3\2\2\2\65\66\7?\2\2\66\b\3\2\2\2\678\7}\2\28\n\3\2\2\29:\7\177"+
		"\2\2:\f\3\2\2\2;<\7]\2\2<\16\3\2\2\2=>\7_\2\2>\20\3\2\2\2?@\7k\2\2@A\7"+
		"f\2\2A\22\3\2\2\2BC\7e\2\2CD\7q\2\2DE\7t\2\2E\24\3\2\2\2FG\7v\2\2GH\7"+
		"c\2\2HI\7o\2\2IJ\7c\2\2JK\7p\2\2KL\7j\2\2LM\7q\2\2M\26\3\2\2\2NO\7*\2"+
		"\2O\30\3\2\2\2PQ\7.\2\2Q\32\3\2\2\2RS\7+\2\2S\34\3\2\2\2TU\7t\2\2UV\7"+
		"g\2\2VW\7v\2\2WX\7q\2\2XY\7t\2\2YZ\7p\2\2Z[\7c\2\2[\\\7t\2\2\\\36\3\2"+
		"\2\2]^\t\2\2\2^ \3\2\2\2_`\t\3\2\2`\"\3\2\2\2ab\7\62\2\2bc\7z\2\2ce\3"+
		"\2\2\2df\5!\21\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h$\3\2\2\2ik\5"+
		"!\21\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m&\3\2\2\2np\5!\21\2on\3"+
		"\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\7\60\2\2tv\5!\21\2ut"+
		"\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x(\3\2\2\2yz\7\"\2\2z{\3\2\2\2{"+
		"|\b\25\2\2|*\3\2\2\2}\177\t\4\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\b\26\2\2\u0081,\3\2\2\2\u0082\u0085\5\37\20\2\u0083\u0085\7a\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u008b\3\2\2\2\u0086\u008a\7a"+
		"\2\2\u0087\u008a\5!\21\2\u0088\u008a\5\37\20\2\u0089\u0086\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c.\3\2\2\2\u008d\u008b\3\2\2\2\13\2glqw~"+
		"\u0084\u0089\u008b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}