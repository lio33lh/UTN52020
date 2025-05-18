// Generated from c:/UTN/2 año/SINTAXIS/ANALIZADORES/ANALIZADOR/analizadorutn.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class analizadorutnLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, EMPUJAR=2, SACAR=3, MIRAR=4, CREAR=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, LBRACKET=10, RBRACKET=11, EXCLAMACION=12, COMA=13, WS=14, NUMERO=15, 
		TEXTO=16, ID=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "EMPUJAR", "SACAR", "MIRAR", "CREAR", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACKET", "RBRACKET", "EXCLAMACION", "COMA", "WS", "NUMERO", 
			"TEXTO", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pila'", "'empujar'", "'sacar'", "'mirar'", "'crear'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'!'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "EMPUJAR", "SACAR", "MIRAR", "CREAR", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "EXCLAMACION", "COMA", "WS", 
			"NUMERO", "TEXTO", "ID"
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


	public analizadorutnLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "analizadorutn.g4"; }

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
		"\u0004\u0000\u0011n\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0004\rT\b\r\u000b\r\f\rU\u0001\r\u0001\r\u0001\u000e\u0004"+
		"\u000e[\b\u000e\u000b\u000e\f\u000e\\\u0001\u000f\u0001\u000f\u0005\u000f"+
		"a\b\u000f\n\u000f\f\u000fd\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0005\u0010j\b\u0010\n\u0010\f\u0010m\t\u0010\u0001b\u0000"+
		"\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0004\u0003\u0000\t\n\r\r"+
		"  \u0001\u000009\u0002\u0000AZaz\u0004\u000009AZ__azq\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0001#\u0001\u0000\u0000\u0000\u0003(\u0001\u0000\u0000\u0000\u00050"+
		"\u0001\u0000\u0000\u0000\u00076\u0001\u0000\u0000\u0000\t<\u0001\u0000"+
		"\u0000\u0000\u000bB\u0001\u0000\u0000\u0000\rD\u0001\u0000\u0000\u0000"+
		"\u000fF\u0001\u0000\u0000\u0000\u0011H\u0001\u0000\u0000\u0000\u0013J"+
		"\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017N\u0001\u0000"+
		"\u0000\u0000\u0019P\u0001\u0000\u0000\u0000\u001bS\u0001\u0000\u0000\u0000"+
		"\u001dZ\u0001\u0000\u0000\u0000\u001f^\u0001\u0000\u0000\u0000!g\u0001"+
		"\u0000\u0000\u0000#$\u0005p\u0000\u0000$%\u0005i\u0000\u0000%&\u0005l"+
		"\u0000\u0000&\'\u0005a\u0000\u0000\'\u0002\u0001\u0000\u0000\u0000()\u0005"+
		"e\u0000\u0000)*\u0005m\u0000\u0000*+\u0005p\u0000\u0000+,\u0005u\u0000"+
		"\u0000,-\u0005j\u0000\u0000-.\u0005a\u0000\u0000./\u0005r\u0000\u0000"+
		"/\u0004\u0001\u0000\u0000\u000001\u0005s\u0000\u000012\u0005a\u0000\u0000"+
		"23\u0005c\u0000\u000034\u0005a\u0000\u000045\u0005r\u0000\u00005\u0006"+
		"\u0001\u0000\u0000\u000067\u0005m\u0000\u000078\u0005i\u0000\u000089\u0005"+
		"r\u0000\u00009:\u0005a\u0000\u0000:;\u0005r\u0000\u0000;\b\u0001\u0000"+
		"\u0000\u0000<=\u0005c\u0000\u0000=>\u0005r\u0000\u0000>?\u0005e\u0000"+
		"\u0000?@\u0005a\u0000\u0000@A\u0005r\u0000\u0000A\n\u0001\u0000\u0000"+
		"\u0000BC\u0005(\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u0005)\u0000"+
		"\u0000E\u000e\u0001\u0000\u0000\u0000FG\u0005{\u0000\u0000G\u0010\u0001"+
		"\u0000\u0000\u0000HI\u0005}\u0000\u0000I\u0012\u0001\u0000\u0000\u0000"+
		"JK\u0005[\u0000\u0000K\u0014\u0001\u0000\u0000\u0000LM\u0005]\u0000\u0000"+
		"M\u0016\u0001\u0000\u0000\u0000NO\u0005!\u0000\u0000O\u0018\u0001\u0000"+
		"\u0000\u0000PQ\u0005,\u0000\u0000Q\u001a\u0001\u0000\u0000\u0000RT\u0007"+
		"\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WX\u0006\r\u0000\u0000X\u001c\u0001\u0000\u0000\u0000Y[\u0007\u0001"+
		"\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u001e\u0001\u0000\u0000"+
		"\u0000^b\u0005\"\u0000\u0000_a\t\u0000\u0000\u0000`_\u0001\u0000\u0000"+
		"\u0000ad\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005"+
		"\"\u0000\u0000f \u0001\u0000\u0000\u0000gk\u0007\u0002\u0000\u0000hj\u0007"+
		"\u0003\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\"\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000\u0005\u0000U\\bk\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}