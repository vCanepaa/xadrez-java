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
	
	
	

}
