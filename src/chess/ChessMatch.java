package chess;

import boardgame.Board;

public class ChessMatch {
	private Board tabu;

	public ChessMatch() {
		tabu = new Board(8,8);
		
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
	
}
