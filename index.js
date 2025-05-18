import antlr4 from 'antlr4';
import { CharStreams, CommonTokenStream } from 'antlr4';
import fs from 'fs';
import readline from 'readline';

import analizadorutnLexer from './generated/analizadorutnLexer.js';
import analizadorutnParser from './generated/analizadorutnParser.js';
import CustomAnalizadorVisitor from './CustomAnalizadorVisitor.js';

// Clase TraductorJS (nueva)
class TraductorJS {
    constructor() {
        this.jsCode = [];
        this.currentStack = null;
    }

    visitPrograma(ctx) {
        const stackName = ctx.ID().getText();
        this.currentStack = stackName;
        this.jsCode.push(`let ${stackName} = []; // Declaración de pila`);
        this.visitComandos(ctx.comandos());
        return this.jsCode.join('\n');
    }

    visitComandos(ctx) {
        ctx.operacion().forEach(op => this.visitOperacion(op));
    }

    visitOperacion(ctx) {
        if (ctx.push()) return this.visitPush(ctx.push());
        if (ctx.pop()) return this.visitPop(ctx.pop());
        if (ctx.peek()) return this.visitPeek(ctx.peek());
        if (ctx.crear()) return this.visitCrear(ctx.crear());
    }

    visitPush(ctx) {
        const value = this.visitValor(ctx.valor());
        this.jsCode.push(`${this.currentStack}.push(${value}); // empujar`);
    }

    visitPop() {
        this.jsCode.push(`${this.currentStack}.pop(); // sacar`);
    }

    visitPeek() {
        this.jsCode.push(`console.log(${this.currentStack}[${this.currentStack}.length - 1]); // mirar`);
    }

    visitCrear(ctx) {
        const elements = this.visitLista(ctx.lista());
        this.jsCode.push(`${this.currentStack} = ${elements}; // crear`);
    }

    visitValor(ctx) {
        if (ctx.numero()) return ctx.numero().getText();
        if (ctx.texto()) return ctx.texto().getText();
    }

    visitLista(ctx) {
        if (ctx.valor()) {
            const elements = ctx.valor().map(v => this.visitValor(v)).join(', ');
            return `[${elements}]`;
        }
        return '[]';
    }
}

async function main() {
    let input;

    try {
        input = fs.readFileSync('input.js', 'utf8');
    } catch (err) {
        input = await leerEntrada();
    }

    // Paso 1: Análisis léxico
    let inputStream = CharStreams.fromString(input);
    let lexer = new analizadorutnLexer(inputStream);
    const tokens = lexer.getAllTokens();

    if (tokens.length === 0) {
        console.error("No se generaron tokens. Verifica la entrada.");
        return;
    }

    // Tabla de Tokens y Lexemas
    console.log("\nTabla de Tokens y Lexemas:");
    console.log("--------------------------------------------------");
    console.log("| Lexema         | Token                         |");
    console.log("--------------------------------------------------");

    for (let token of tokens) {
        const tokenName = analizadorutnLexer.symbolicNames[token.type] || `UNKNOWN (${token.type})`;
        const lexema = token.text;
        console.log(`| ${lexema.padEnd(14)} | ${tokenName.padEnd(30)}|`);
    }

    console.log("--------------------------------------------------");

    // Paso 2: Análisis sintáctico
    inputStream = CharStreams.fromString(input);
    lexer = new analizadorutnLexer(inputStream);
    const tokenStream = new CommonTokenStream(lexer);
    const parser = new analizadorutnParser(tokenStream);
    const tree = parser.programa();

    if (parser._syntaxErrors > 0) {
        console.error("\nSe encontraron errores de sintaxis.");
        return;
    }

    console.log("\nEntrada válida.");
    console.log("Árbol de derivación:");
    console.log(tree.toStringTree(parser.ruleNames));

    // Paso 3: Análisis semántico (visitor original)
    const visitor = new CustomAnalizadorVisitor();
    visitor.visit(tree);

    // Paso 4: Traducción a JavaScript (nuevo)
    const translator = new TraductorJS();
    const jsCode = translator.visitPrograma(tree);
    
    console.log("\nCódigo JavaScript generado:");
    console.log("--------------------------------------------------");
    console.log(jsCode);
    console.log("--------------------------------------------------");

    // Opcional: Guardar en archivo
    try {
        fs.writeFileSync('output.js', jsCode);
        console.log("\nTraducción guardada en output.js");
    } catch (err) {
        console.error("\nNo se pudo guardar el archivo output.js");
    }
}

function leerEntrada() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    return new Promise(resolve => {
        rl.question("Ingrese una cadena: ", (answer) => {
            rl.close();
            resolve(answer);
        });
    });
}

main();