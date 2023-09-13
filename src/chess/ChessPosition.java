package chess;

import boardgame.Position;

public class ChessPosition{
	private char coluna;
	private int linha;
	public ChessPosition(char coluna, int linha) {
		if(coluna < 'a' || coluna >'h' || linha <1 || linha > 8) {
			throw new ChessException("Erro na ChessPosition valores validos são a1 - h8");
		}
		this.coluna = coluna;
		this.linha = linha;
	}
	public char getColuna() {
		return coluna;
	}
	public int getLinha() {
		return linha;
	}
	
	protected Position paraPosicao() {
		 return new Position(8-linha, coluna-'a');
	}
	
	protected static ChessPosition daPosicao(Position pos) {
		return new ChessPosition((char)('a'-pos.getColuna()), 8 - pos.getLinha());
	}
	
	@Override
	
	public String toString() {
		return ""+ coluna + linha;
	}
}
