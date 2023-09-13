package application;

import java.util.Scanner;
import chess.ChessPosition;
import chess.ChessMatch;
import chess.ChessPiece;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch partida = new ChessMatch();
		
		
		while(true) {
		UI.printBoard(partida.getPecas());
		System.out.println();
		System.out.print("Origem: ");
		ChessPosition origem = UI.lerChessPosition(sc);
		System.out.println();
		System.out.print("Destino: ");
		ChessPosition destino = UI.lerChessPosition(sc);
		
		ChessPiece pecaCapturada = partida.performaMovimento(origem, destino);
		
		
		}
	}

}
