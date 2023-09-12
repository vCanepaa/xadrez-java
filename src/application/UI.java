package application;

import chess.ChessPiece;

public class UI {
	public static void printBoard(ChessPiece[][] p) {
		for(int i = 0; i<p.length; i++) {
			System.out.print((8-i) + " ");
			for(int j = 0; j<p.length; j++) {
				printPiece(p[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	private static void printPiece(ChessPiece p) {
		if(p == null) {
			System.out.print("-");
		}else {
			System.out.print(p);
		}
		System.out.print(" ");
	}
}
