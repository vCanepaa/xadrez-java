package chess;

import boardgame.Board;
import boardgame.Piece;
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
		colocaNovaPeca('c', 1, new Torre(tabu,Color.BRANCA));
		colocaNovaPeca('c', 2, new Torre(tabu,Color.BRANCA));
		colocaNovaPeca('d', 2, new Torre(tabu,Color.BRANCA));
		colocaNovaPeca('e', 2, new Torre(tabu,Color.BRANCA));
		colocaNovaPeca('e', 1, new Torre(tabu,Color.BRANCA));
		colocaNovaPeca('d', 1, new Rei(tabu,Color.BRANCA));
		
		colocaNovaPeca('c', 7, new Torre(tabu,Color.PRETA));
		colocaNovaPeca('c', 8, new Torre(tabu,Color.PRETA));
		colocaNovaPeca('d', 7, new Torre(tabu,Color.PRETA));
		colocaNovaPeca('e', 7, new Torre(tabu,Color.PRETA));
		colocaNovaPeca('e', 8, new Torre(tabu,Color.PRETA));
		colocaNovaPeca('d', 8, new Rei(tabu,Color.PRETA));
	}
	private void colocaNovaPeca(char coluna,int linha, ChessPiece p) {
		tabu.colocaPeca(p, new ChessPosition(coluna, linha).paraPosicao());
	}
	public ChessPiece performaMovimento(ChessPosition posInicial, ChessPosition posFinal) {
		Position origem = posInicial.paraPosicao();
		
		Position alvo = posFinal.paraPosicao();
		validaPosicaoOrigem(origem);
		Piece pecaCapturada = movimenta(origem, alvo);
		
		return (ChessPiece)pecaCapturada;
		
	}
	private void validaPosicaoOrigem(Position p) {
		if(!tabu.existePeca(p)) {
			throw new ChessException("Não existe peca na posicao inicial");
		};
	}
	private Piece movimenta(Position o, Position a) {
		Piece p = tabu.removePeca(o);
		Piece pecaCapturada = tabu.removePeca(a);
		
		tabu.colocaPeca(p, a);
		return pecaCapturada;
	}
}
