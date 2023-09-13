package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rei;
import chess.pieces.Torre;

public class ChessMatch {
	private Board tabu;

	public ChessMatch() {
		tabu = new Board(8,8);
		initialSetup();
		
	}
	public ChessPiece[][] getPecas() {
		ChessPiece[][] mat = new ChessPiece[tabu.getLinhas()][tabu.getColunas()];
		for(int i = 0; i<tabu.getLinhas();i++) {
			for(int j = 0; j<tabu.getColunas(); j++) {
				mat[i][j] = (ChessPiece) tabu.peca(i,j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		tabu.colocaPeca(new Torre(tabu,Color.BRANCA), new Position(2,1));
		tabu.colocaPeca(new Rei(tabu, Color.BRANCA), new Position(3,1));
	}
	
}
