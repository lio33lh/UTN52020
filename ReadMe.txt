Analizador para la gramática dada que genera pilas en Pseudocodigo.

Alumno: Lionel Antonio López Villalba
Legajo: 52020

ESTRUCTURA DEL PROYECTO

- `analizadorutn.g4`: Gramática ANTLR del lenguaje.
- `/generated`: Archivos generados por ANTLR (lexer, parser, etc).
- `CustomAnalizadorVisitor.js`: Visitor personalizado para análisis semántico.
- `index.js`: Script principal que ejecuta el análisis y la traducción.
- `input.js` / `input.txt`: Archivo de entrada con el código fuente a analizar.
- `output.js`: Archivo generado con el código JavaScript traducido.
- `ReadMe.txt`: Este archivo.


INSTRUCCIONES:

1. Para generar el arbol de derivación se debe colocar la entrada en el archivo
input.txt y luego posicionarse sobre el plugin de ANTLR4 y con F5 generar el 
árbol.

2. Para generar la tabla de lexemas y tokens y la traduccion a JS, se debe
colocar la entrada en el archivo input.js y luego, desde la terminal, 
posiconarse en la ruta donde este guardada la carpeta con el analizador, y 
ejecutar el comando node index.js.

Estos archivos ya estan cargados con el ejemplo válido que se me dió en la 
asignación del tema.
Modifique levemente el ejemplo ya que tal cual como estaba en el tema que se
dió, no era válido para la gramática. Le agregué los signos de exclamacion '!'
al final de cada operación.