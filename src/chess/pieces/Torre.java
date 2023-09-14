package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Torre extends ChessPiece {

	public Torre(Board board, Color cor) {
		super(board, cor);
	}
	
	
	@Override
	public String toString() {
		return "T";
	}
	
	public boolean[][] movimentosPossiveis(){
		boolean[][] mat = new boolean[getBoard().getLinhas()][getBoard().getColunas()];
		return mat;
	}
	
	

}
