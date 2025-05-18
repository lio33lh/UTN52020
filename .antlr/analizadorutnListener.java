// Generated from d:/Usuario/Desktop/ANALIZADOR/analizadorutn.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link analizadorutnParser}.
 */
public interface analizadorutnListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link analizadorutnParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(analizadorutnParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorutnParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(analizadorutnParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorutnParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(analizadorutnParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorutnParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(analizadorutnParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorutnParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(analizadorutnParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorutnParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(analizadorutnParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorutnParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(analizadorutnParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorutnParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(analizadorutnParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorutnParser#pop}.
	 * @param ctx the parse tree
	 */
	void enterPop(analizadorutnParser.PopContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorutnParser#pop}.
	 * @param ctx the parse tree
	 */
	void exitPop(analizadorutnParser.PopContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorutnParser#peek}.
	 * @param ctx the parse tree
	 */
	void enterPeek(analizadorutnParser.PeekContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorutnParser#peek}.
	 * @param ctx the parse tree
	 */
	void exitPeek(analizadorutnParser.PeekContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorutnParser#crear}.
	 * @param ctx the parse tree
	 */
	void enterCrear(analizadorutnParser.CrearContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorutnParser#crear}.
	 * @param ctx the parse tree
	 */
	void exitCrear(analizadorutnParser.CrearContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorutnParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(analizadorutnParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorutnParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(analizadorutnParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorutnParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(analizadorutnParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorutnParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(analizadorutnParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorutnParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(analizadorutnParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorutnParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(analizadorutnParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link analizadorutnParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(analizadorutnParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link analizadorutnParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(analizadorutnParser.TextoContext ctx);
}