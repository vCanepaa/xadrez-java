package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rei extends ChessPiece {

	public Rei(Board board, Color cor) {
		super(board, cor);
	}

	
	@Override
	public String toString() {
		return "K";
	}
}
