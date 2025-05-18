import analizadorutnVisitor from './generated/analizadorutnVisitor.js';

class CustomAnalizadorVisitor extends analizadorutnVisitor {
    constructor() {
        super();
        this.pila = [];
    }

    visitPrograma(ctx) {
        return this.visit(ctx.comandos());
    }

    visitComandos(ctx) {
        for (let operacionCtx of ctx.operacion()) {
            this.visit(operacionCtx);
        }
    }

    visitPush(ctx) {
        const valor = this.visit(ctx.valor());
        this.pila.push(valor);
        console.log(`> empujar(${valor}) → pila: [${this.pila.join(', ')}]`);
    }

    visitPop(ctx) {
        const eliminado = this.pila.pop();
        console.log(`> sacar() → se eliminó: ${eliminado} → pila: [${this.pila.join(', ')}]`);
    }

    visitPeek(ctx) {
        const tope = this.pila.length > 0 ? this.pila[this.pila.length - 1] : undefined;
        console.log(`> mirar() → tope: ${tope}`);
    }

    visitCrear(ctx) {
        const listaValores = this.visit(ctx.lista());
        this.pila = [...listaValores];
        console.log(`> crear(${listaValores.join(', ')}) → pila inicializada: [${this.pila.join(', ')}]`);
    }

    visitValor(ctx) {
        if (ctx.numero()) return this.visit(ctx.numero());
        if (ctx.texto()) return this.visit(ctx.texto());
    }

    visitNumero(ctx) {
        return Number(ctx.getText());
    }

    visitTexto(ctx) {
        // Elimina las comillas del texto
        return ctx.getText().slice(1, -1);
    }

    visitLista(ctx) {
        return ctx.valor().map(valorCtx => this.visit(valorCtx));
    }
}

export default CustomAnalizadorVisitor;
