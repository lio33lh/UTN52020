// Generated from analizadorutn.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import analizadorutnListener from './analizadorutnListener.js';
import analizadorutnVisitor from './analizadorutnVisitor.js';

const serializedATN = [4,1,17,85,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,1,0,1,0,1,0,1,0,1,0,1,
0,1,0,1,1,5,1,31,8,1,10,1,12,1,34,9,1,1,2,1,2,1,2,1,2,3,2,40,8,2,1,3,1,3,
1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,
1,6,1,6,1,7,1,7,3,7,66,8,7,1,8,1,8,1,8,1,8,5,8,72,8,8,10,8,12,8,75,9,8,3,
8,77,8,8,1,8,1,8,1,9,1,9,1,10,1,10,1,10,0,0,11,0,2,4,6,8,10,12,14,16,18,
20,0,0,80,0,22,1,0,0,0,2,32,1,0,0,0,4,39,1,0,0,0,6,41,1,0,0,0,8,47,1,0,0,
0,10,52,1,0,0,0,12,57,1,0,0,0,14,65,1,0,0,0,16,67,1,0,0,0,18,80,1,0,0,0,
20,82,1,0,0,0,22,23,5,1,0,0,23,24,5,17,0,0,24,25,5,8,0,0,25,26,3,2,1,0,26,
27,5,9,0,0,27,28,5,0,0,1,28,1,1,0,0,0,29,31,3,4,2,0,30,29,1,0,0,0,31,34,
1,0,0,0,32,30,1,0,0,0,32,33,1,0,0,0,33,3,1,0,0,0,34,32,1,0,0,0,35,40,3,6,
3,0,36,40,3,8,4,0,37,40,3,10,5,0,38,40,3,12,6,0,39,35,1,0,0,0,39,36,1,0,
0,0,39,37,1,0,0,0,39,38,1,0,0,0,40,5,1,0,0,0,41,42,5,2,0,0,42,43,5,6,0,0,
43,44,3,14,7,0,44,45,5,7,0,0,45,46,5,12,0,0,46,7,1,0,0,0,47,48,5,3,0,0,48,
49,5,6,0,0,49,50,5,7,0,0,50,51,5,12,0,0,51,9,1,0,0,0,52,53,5,4,0,0,53,54,
5,6,0,0,54,55,5,7,0,0,55,56,5,12,0,0,56,11,1,0,0,0,57,58,5,5,0,0,58,59,5,
6,0,0,59,60,3,16,8,0,60,61,5,7,0,0,61,62,5,12,0,0,62,13,1,0,0,0,63,66,3,
18,9,0,64,66,3,20,10,0,65,63,1,0,0,0,65,64,1,0,0,0,66,15,1,0,0,0,67,76,5,
10,0,0,68,73,3,14,7,0,69,70,5,13,0,0,70,72,3,14,7,0,71,69,1,0,0,0,72,75,
1,0,0,0,73,71,1,0,0,0,73,74,1,0,0,0,74,77,1,0,0,0,75,73,1,0,0,0,76,68,1,
0,0,0,76,77,1,0,0,0,77,78,1,0,0,0,78,79,5,11,0,0,79,17,1,0,0,0,80,81,5,15,
0,0,81,19,1,0,0,0,82,83,5,16,0,0,83,21,1,0,0,0,5,32,39,65,73,76];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class analizadorutnParser extends antlr4.Parser {

    static grammarFileName = "analizadorutn.g4";
    static literalNames = [ null, "'pila'", "'empujar'", "'sacar'", "'mirar'", 
                            "'crear'", "'('", "')'", "'{'", "'}'", "'['", 
                            "']'", "'!'", "','" ];
    static symbolicNames = [ null, null, "EMPUJAR", "SACAR", "MIRAR", "CREAR", 
                             "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", 
                             "RBRACKET", "EXCLAMACION", "COMA", "WS", "NUMERO", 
                             "TEXTO", "ID" ];
    static ruleNames = [ "programa", "comandos", "operacion", "push", "pop", 
                         "peek", "crear", "valor", "lista", "numero", "texto" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = analizadorutnParser.ruleNames;
        this.literalNames = analizadorutnParser.literalNames;
        this.symbolicNames = analizadorutnParser.symbolicNames;
    }



	programa() {
	    let localctx = new ProgramaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, analizadorutnParser.RULE_programa);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 22;
	        this.match(analizadorutnParser.T__0);
	        this.state = 23;
	        this.match(analizadorutnParser.ID);
	        this.state = 24;
	        this.match(analizadorutnParser.LBRACE);
	        this.state = 25;
	        this.comandos();
	        this.state = 26;
	        this.match(analizadorutnParser.RBRACE);
	        this.state = 27;
	        this.match(analizadorutnParser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	comandos() {
	    let localctx = new ComandosContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, analizadorutnParser.RULE_comandos);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 32;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 60) !== 0)) {
	            this.state = 29;
	            this.operacion();
	            this.state = 34;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	operacion() {
	    let localctx = new OperacionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, analizadorutnParser.RULE_operacion);
	    try {
	        this.state = 39;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 2:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 35;
	            this.push();
	            break;
	        case 3:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 36;
	            this.pop();
	            break;
	        case 4:
	            this.enterOuterAlt(localctx, 3);
	            this.state = 37;
	            this.peek();
	            break;
	        case 5:
	            this.enterOuterAlt(localctx, 4);
	            this.state = 38;
	            this.crear();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	push() {
	    let localctx = new PushContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, analizadorutnParser.RULE_push);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 41;
	        this.match(analizadorutnParser.EMPUJAR);
	        this.state = 42;
	        this.match(analizadorutnParser.LPAREN);
	        this.state = 43;
	        this.valor();
	        this.state = 44;
	        this.match(analizadorutnParser.RPAREN);
	        this.state = 45;
	        this.match(analizadorutnParser.EXCLAMACION);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	pop() {
	    let localctx = new PopContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, analizadorutnParser.RULE_pop);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 47;
	        this.match(analizadorutnParser.SACAR);
	        this.state = 48;
	        this.match(analizadorutnParser.LPAREN);
	        this.state = 49;
	        this.match(analizadorutnParser.RPAREN);
	        this.state = 50;
	        this.match(analizadorutnParser.EXCLAMACION);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	peek() {
	    let localctx = new PeekContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, analizadorutnParser.RULE_peek);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 52;
	        this.match(analizadorutnParser.MIRAR);
	        this.state = 53;
	        this.match(analizadorutnParser.LPAREN);
	        this.state = 54;
	        this.match(analizadorutnParser.RPAREN);
	        this.state = 55;
	        this.match(analizadorutnParser.EXCLAMACION);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	crear() {
	    let localctx = new CrearContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, analizadorutnParser.RULE_crear);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 57;
	        this.match(analizadorutnParser.CREAR);
	        this.state = 58;
	        this.match(analizadorutnParser.LPAREN);
	        this.state = 59;
	        this.lista();
	        this.state = 60;
	        this.match(analizadorutnParser.RPAREN);
	        this.state = 61;
	        this.match(analizadorutnParser.EXCLAMACION);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	valor() {
	    let localctx = new ValorContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, analizadorutnParser.RULE_valor);
	    try {
	        this.state = 65;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 15:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 63;
	            this.numero();
	            break;
	        case 16:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 64;
	            this.texto();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	lista() {
	    let localctx = new ListaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, analizadorutnParser.RULE_lista);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 67;
	        this.match(analizadorutnParser.LBRACKET);
	        this.state = 76;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===15 || _la===16) {
	            this.state = 68;
	            this.valor();
	            this.state = 73;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            while(_la===13) {
	                this.state = 69;
	                this.match(analizadorutnParser.COMA);
	                this.state = 70;
	                this.valor();
	                this.state = 75;
	                this._errHandler.sync(this);
	                _la = this._input.LA(1);
	            }
	        }

	        this.state = 78;
	        this.match(analizadorutnParser.RBRACKET);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	numero() {
	    let localctx = new NumeroContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, analizadorutnParser.RULE_numero);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 80;
	        this.match(analizadorutnParser.NUMERO);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	texto() {
	    let localctx = new TextoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 20, analizadorutnParser.RULE_texto);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 82;
	        this.match(analizadorutnParser.TEXTO);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

analizadorutnParser.EOF = antlr4.Token.EOF;
analizadorutnParser.T__0 = 1;
analizadorutnParser.EMPUJAR = 2;
analizadorutnParser.SACAR = 3;
analizadorutnParser.MIRAR = 4;
analizadorutnParser.CREAR = 5;
analizadorutnParser.LPAREN = 6;
analizadorutnParser.RPAREN = 7;
analizadorutnParser.LBRACE = 8;
analizadorutnParser.RBRACE = 9;
analizadorutnParser.LBRACKET = 10;
analizadorutnParser.RBRACKET = 11;
analizadorutnParser.EXCLAMACION = 12;
analizadorutnParser.COMA = 13;
analizadorutnParser.WS = 14;
analizadorutnParser.NUMERO = 15;
analizadorutnParser.TEXTO = 16;
analizadorutnParser.ID = 17;

analizadorutnParser.RULE_programa = 0;
analizadorutnParser.RULE_comandos = 1;
analizadorutnParser.RULE_operacion = 2;
analizadorutnParser.RULE_push = 3;
analizadorutnParser.RULE_pop = 4;
analizadorutnParser.RULE_peek = 5;
analizadorutnParser.RULE_crear = 6;
analizadorutnParser.RULE_valor = 7;
analizadorutnParser.RULE_lista = 8;
analizadorutnParser.RULE_numero = 9;
analizadorutnParser.RULE_texto = 10;

class ProgramaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorutnParser.RULE_programa;
    }

	ID() {
	    return this.getToken(analizadorutnParser.ID, 0);
	};

	LBRACE() {
	    return this.getToken(analizadorutnParser.LBRACE, 0);
	};

	comandos() {
	    return this.getTypedRuleContext(ComandosContext,0);
	};

	RBRACE() {
	    return this.getToken(analizadorutnParser.RBRACE, 0);
	};

	EOF() {
	    return this.getToken(analizadorutnParser.EOF, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.enterPrograma(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.exitPrograma(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorutnVisitor ) {
	        return visitor.visitPrograma(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ComandosContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorutnParser.RULE_comandos;
    }

	operacion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(OperacionContext);
	    } else {
	        return this.getTypedRuleContext(OperacionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.enterComandos(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.exitComandos(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorutnVisitor ) {
	        return visitor.visitComandos(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class OperacionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorutnParser.RULE_operacion;
    }

	push() {
	    return this.getTypedRuleContext(PushContext,0);
	};

	pop() {
	    return this.getTypedRuleContext(PopContext,0);
	};

	peek() {
	    return this.getTypedRuleContext(PeekContext,0);
	};

	crear() {
	    return this.getTypedRuleContext(CrearContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.enterOperacion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.exitOperacion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorutnVisitor ) {
	        return visitor.visitOperacion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PushContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorutnParser.RULE_push;
    }

	EMPUJAR() {
	    return this.getToken(analizadorutnParser.EMPUJAR, 0);
	};

	LPAREN() {
	    return this.getToken(analizadorutnParser.LPAREN, 0);
	};

	valor() {
	    return this.getTypedRuleContext(ValorContext,0);
	};

	RPAREN() {
	    return this.getToken(analizadorutnParser.RPAREN, 0);
	};

	EXCLAMACION() {
	    return this.getToken(analizadorutnParser.EXCLAMACION, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.enterPush(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.exitPush(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorutnVisitor ) {
	        return visitor.visitPush(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PopContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorutnParser.RULE_pop;
    }

	SACAR() {
	    return this.getToken(analizadorutnParser.SACAR, 0);
	};

	LPAREN() {
	    return this.getToken(analizadorutnParser.LPAREN, 0);
	};

	RPAREN() {
	    return this.getToken(analizadorutnParser.RPAREN, 0);
	};

	EXCLAMACION() {
	    return this.getToken(analizadorutnParser.EXCLAMACION, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.enterPop(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.exitPop(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorutnVisitor ) {
	        return visitor.visitPop(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PeekContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorutnParser.RULE_peek;
    }

	MIRAR() {
	    return this.getToken(analizadorutnParser.MIRAR, 0);
	};

	LPAREN() {
	    return this.getToken(analizadorutnParser.LPAREN, 0);
	};

	RPAREN() {
	    return this.getToken(analizadorutnParser.RPAREN, 0);
	};

	EXCLAMACION() {
	    return this.getToken(analizadorutnParser.EXCLAMACION, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.enterPeek(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.exitPeek(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorutnVisitor ) {
	        return visitor.visitPeek(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CrearContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorutnParser.RULE_crear;
    }

	CREAR() {
	    return this.getToken(analizadorutnParser.CREAR, 0);
	};

	LPAREN() {
	    return this.getToken(analizadorutnParser.LPAREN, 0);
	};

	lista() {
	    return this.getTypedRuleContext(ListaContext,0);
	};

	RPAREN() {
	    return this.getToken(analizadorutnParser.RPAREN, 0);
	};

	EXCLAMACION() {
	    return this.getToken(analizadorutnParser.EXCLAMACION, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.enterCrear(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.exitCrear(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorutnVisitor ) {
	        return visitor.visitCrear(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ValorContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorutnParser.RULE_valor;
    }

	numero() {
	    return this.getTypedRuleContext(NumeroContext,0);
	};

	texto() {
	    return this.getTypedRuleContext(TextoContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.enterValor(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.exitValor(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorutnVisitor ) {
	        return visitor.visitValor(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ListaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorutnParser.RULE_lista;
    }

	LBRACKET() {
	    return this.getToken(analizadorutnParser.LBRACKET, 0);
	};

	RBRACKET() {
	    return this.getToken(analizadorutnParser.RBRACKET, 0);
	};

	valor = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ValorContext);
	    } else {
	        return this.getTypedRuleContext(ValorContext,i);
	    }
	};

	COMA = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(analizadorutnParser.COMA);
	    } else {
	        return this.getToken(analizadorutnParser.COMA, i);
	    }
	};


	enterRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.enterLista(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.exitLista(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorutnVisitor ) {
	        return visitor.visitLista(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class NumeroContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorutnParser.RULE_numero;
    }

	NUMERO() {
	    return this.getToken(analizadorutnParser.NUMERO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.enterNumero(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.exitNumero(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorutnVisitor ) {
	        return visitor.visitNumero(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TextoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = analizadorutnParser.RULE_texto;
    }

	TEXTO() {
	    return this.getToken(analizadorutnParser.TEXTO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.enterTexto(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof analizadorutnListener ) {
	        listener.exitTexto(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof analizadorutnVisitor ) {
	        return visitor.visitTexto(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




analizadorutnParser.ProgramaContext = ProgramaContext; 
analizadorutnParser.ComandosContext = ComandosContext; 
analizadorutnParser.OperacionContext = OperacionContext; 
analizadorutnParser.PushContext = PushContext; 
analizadorutnParser.PopContext = PopContext; 
analizadorutnParser.PeekContext = PeekContext; 
analizadorutnParser.CrearContext = CrearContext; 
analizadorutnParser.ValorContext = ValorContext; 
analizadorutnParser.ListaContext = ListaContext; 
analizadorutnParser.NumeroContext = NumeroContext; 
analizadorutnParser.TextoContext = TextoContext; 
