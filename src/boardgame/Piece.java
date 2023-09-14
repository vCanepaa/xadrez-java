package boardgame;

public abstract class Piece {
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}


	protected Board getBoard() {
		return board;
	}
	public abstract boolean[][] movimentosPossiveis();
	
	public boolean movimentoPossivel(Position p) {
		return movimentosPossiveis()[p.getLinha()][p.getColuna()];
	}
	public boolean temMovimentoPossivel() {
		boolean mat[][] = movimentosPossiveis();
		for(int i =0 ; i<mat.length;i++) {
			for(int j=0; j<mat.length; j++) {
				if(mat[i][j]==true) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
}
