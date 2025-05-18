grammar analizadorutn;

programa: 'pila' ID LBRACE comandos RBRACE EOF;

comandos: operacion*;

operacion: push
         | pop
         | peek
         | crear
         ;

push: EMPUJAR LPAREN valor RPAREN EXCLAMACION;
pop: SACAR LPAREN RPAREN EXCLAMACION;
peek: MIRAR LPAREN RPAREN EXCLAMACION;
crear: CREAR LPAREN lista RPAREN EXCLAMACION;

valor: numero 
     | texto
     ;

lista: LBRACKET (valor (COMA valor)*)? RBRACKET;

numero: NUMERO;
texto: TEXTO;



EMPUJAR: 'empujar';
SACAR: 'sacar';
MIRAR: 'mirar';
CREAR: 'crear';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
EXCLAMACION: '!';
COMA: ',';
WS: [ \t\r\n]+ -> skip;
NUMERO: [0-9]+;
TEXTO: '"' .*? '"';
ID: [a-zA-Z][a-zA-Z0-9_]*;