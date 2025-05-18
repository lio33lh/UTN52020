// Generated from c:/UTN/2 año/SINTAXIS/ANALIZADORES/ANALIZADOR/analizadorutn.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class analizadorutnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, EMPUJAR=2, SACAR=3, MIRAR=4, CREAR=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, LBRACKET=10, RBRACKET=11, EXCLAMACION=12, COMA=13, WS=14, NUMERO=15, 
		TEXTO=16, ID=17;
	public static final int
		RULE_programa = 0, RULE_comandos = 1, RULE_operacion = 2, RULE_push = 3, 
		RULE_pop = 4, RULE_peek = 5, RULE_crear = 6, RULE_valor = 7, RULE_lista = 8, 
		RULE_numero = 9, RULE_texto = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comandos", "operacion", "push", "pop", "peek", "crear", 
			"valor", "lista", "numero", "texto"
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

	@Override
	public String getGrammarFileName() { return "analizadorutn.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public analizadorutnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(analizadorutnParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(analizadorutnParser.LBRACE, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(analizadorutnParser.RBRACE, 0); }
		public TerminalNode EOF() { return getToken(analizadorutnParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			match(ID);
			setState(24);
			match(LBRACE);
			setState(25);
			comandos();
			setState(26);
			match(RBRACE);
			setState(27);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) {
				{
				{
				setState(29);
				operacion();
				}
				}
				setState(34);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperacionContext extends ParserRuleContext {
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public PopContext pop() {
			return getRuleContext(PopContext.class,0);
		}
		public PeekContext peek() {
			return getRuleContext(PeekContext.class,0);
		}
		public CrearContext crear() {
			return getRuleContext(CrearContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operacion);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPUJAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				push();
				}
				break;
			case SACAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				pop();
				}
				break;
			case MIRAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				peek();
				}
				break;
			case CREAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				crear();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PushContext extends ParserRuleContext {
		public TerminalNode EMPUJAR() { return getToken(analizadorutnParser.EMPUJAR, 0); }
		public TerminalNode LPAREN() { return getToken(analizadorutnParser.LPAREN, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(analizadorutnParser.RPAREN, 0); }
		public TerminalNode EXCLAMACION() { return getToken(analizadorutnParser.EXCLAMACION, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(EMPUJAR);
			setState(42);
			match(LPAREN);
			setState(43);
			valor();
			setState(44);
			match(RPAREN);
			setState(45);
			match(EXCLAMACION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PopContext extends ParserRuleContext {
		public TerminalNode SACAR() { return getToken(analizadorutnParser.SACAR, 0); }
		public TerminalNode LPAREN() { return getToken(analizadorutnParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(analizadorutnParser.RPAREN, 0); }
		public TerminalNode EXCLAMACION() { return getToken(analizadorutnParser.EXCLAMACION, 0); }
		public PopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pop; }
	}

	public final PopContext pop() throws RecognitionException {
		PopContext _localctx = new PopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(SACAR);
			setState(48);
			match(LPAREN);
			setState(49);
			match(RPAREN);
			setState(50);
			match(EXCLAMACION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PeekContext extends ParserRuleContext {
		public TerminalNode MIRAR() { return getToken(analizadorutnParser.MIRAR, 0); }
		public TerminalNode LPAREN() { return getToken(analizadorutnParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(analizadorutnParser.RPAREN, 0); }
		public TerminalNode EXCLAMACION() { return getToken(analizadorutnParser.EXCLAMACION, 0); }
		public PeekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peek; }
	}

	public final PeekContext peek() throws RecognitionException {
		PeekContext _localctx = new PeekContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_peek);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(MIRAR);
			setState(53);
			match(LPAREN);
			setState(54);
			match(RPAREN);
			setState(55);
			match(EXCLAMACION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CrearContext extends ParserRuleContext {
		public TerminalNode CREAR() { return getToken(analizadorutnParser.CREAR, 0); }
		public TerminalNode LPAREN() { return getToken(analizadorutnParser.LPAREN, 0); }
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(analizadorutnParser.RPAREN, 0); }
		public TerminalNode EXCLAMACION() { return getToken(analizadorutnParser.EXCLAMACION, 0); }
		public CrearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crear; }
	}

	public final CrearContext crear() throws RecognitionException {
		CrearContext _localctx = new CrearContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_crear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(CREAR);
			setState(58);
			match(LPAREN);
			setState(59);
			lista();
			setState(60);
			match(RPAREN);
			setState(61);
			match(EXCLAMACION);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valor);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				numero();
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				texto();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(analizadorutnParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(analizadorutnParser.RBRACKET, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(analizadorutnParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(analizadorutnParser.COMA, i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LBRACKET);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERO || _la==TEXTO) {
				{
				setState(68);
				valor();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(69);
					match(COMA);
					setState(70);
					valor();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(78);
			match(RBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(analizadorutnParser.NUMERO, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(NUMERO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(analizadorutnParser.TEXTO, 0); }
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(TEXTO);
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
		"\u0004\u0001\u0011U\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005"+
		"\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002(\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007B\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bH\b\b\n\b\f\bK\t\b\u0003\bM\b"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0000"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000"+
		"P\u0000\u0016\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004"+
		"\'\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b/\u0001\u0000"+
		"\u0000\u0000\n4\u0001\u0000\u0000\u0000\f9\u0001\u0000\u0000\u0000\u000e"+
		"A\u0001\u0000\u0000\u0000\u0010C\u0001\u0000\u0000\u0000\u0012P\u0001"+
		"\u0000\u0000\u0000\u0014R\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u0001"+
		"\u0000\u0000\u0017\u0018\u0005\u0011\u0000\u0000\u0018\u0019\u0005\b\u0000"+
		"\u0000\u0019\u001a\u0003\u0002\u0001\u0000\u001a\u001b\u0005\t\u0000\u0000"+
		"\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000"+
		"\u001d\u001f\u0003\u0004\u0002\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000#(\u0003\u0006\u0003\u0000$(\u0003\b\u0004\u0000%(\u0003\n\u0005"+
		"\u0000&(\u0003\f\u0006\u0000\'#\u0001\u0000\u0000\u0000\'$\u0001\u0000"+
		"\u0000\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(\u0005"+
		"\u0001\u0000\u0000\u0000)*\u0005\u0002\u0000\u0000*+\u0005\u0006\u0000"+
		"\u0000+,\u0003\u000e\u0007\u0000,-\u0005\u0007\u0000\u0000-.\u0005\f\u0000"+
		"\u0000.\u0007\u0001\u0000\u0000\u0000/0\u0005\u0003\u0000\u000001\u0005"+
		"\u0006\u0000\u000012\u0005\u0007\u0000\u000023\u0005\f\u0000\u00003\t"+
		"\u0001\u0000\u0000\u000045\u0005\u0004\u0000\u000056\u0005\u0006\u0000"+
		"\u000067\u0005\u0007\u0000\u000078\u0005\f\u0000\u00008\u000b\u0001\u0000"+
		"\u0000\u00009:\u0005\u0005\u0000\u0000:;\u0005\u0006\u0000\u0000;<\u0003"+
		"\u0010\b\u0000<=\u0005\u0007\u0000\u0000=>\u0005\f\u0000\u0000>\r\u0001"+
		"\u0000\u0000\u0000?B\u0003\u0012\t\u0000@B\u0003\u0014\n\u0000A?\u0001"+
		"\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\u000f\u0001\u0000\u0000"+
		"\u0000CL\u0005\n\u0000\u0000DI\u0003\u000e\u0007\u0000EF\u0005\r\u0000"+
		"\u0000FH\u0003\u000e\u0007\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JM\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LD\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0005\u000b\u0000"+
		"\u0000O\u0011\u0001\u0000\u0000\u0000PQ\u0005\u000f\u0000\u0000Q\u0013"+
		"\u0001\u0000\u0000\u0000RS\u0005\u0010\u0000\u0000S\u0015\u0001\u0000"+
		"\u0000\u0000\u0005 \'AIL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}