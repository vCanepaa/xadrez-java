package boardgame;

public class Board {
	private int linhas;
	private int colunas;
	private Piece[][] pecas;
	
	
	public Board(int linhas, int colunas) {
		if(linhas <1 || colunas <1) {
			throw new BoardException("Erro ao criar o tabuleiro, é necessario, pelo menos, 1 linha e 1 coluna");
		}
		
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Piece[linhas][colunas];
	}


	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Piece peca(int l, int c) {
		if(!existePos(l,c)) {
			throw new BoardException("Não existe essa posicao no tabuleiro");
		}
		
		return pecas[l][c];
	}
	public Piece peca(Position p) {
		return pecas[p.getLinha()][p.getColuna()];
	}
	
	public void colocaPeca(Piece p, Position pos) {
		if(existePeca(pos)) {
			throw new BoardException("Erro ao posicionar peça, posição ocupada");
		}
		
		pecas[pos.getLinha()][pos.getColuna()] = p;
		p.position = pos;
	}
	public Piece removePeca(Position p) {
		if(!existePos(p)) {
			throw new BoardException("Não existe essa posicao no tabuleiro");
		}
		
		if(!existePeca(p)) {
			return null;
		}
		Piece aux = peca(p);
		aux.position = null;
		pecas[p.getLinha()][p.getColuna()] = null;
		return aux;
		
	}
	
	
	private boolean existePos(int l, int c) {
		if((l >=0 && l<= this.linhas) && (c >=0 && c <= this.colunas)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean existePos(Position p) {
		return existePos(p.getLinha(), p.getColuna());
	}
	
	public boolean existePeca(Position p) {
		if(!existePos(p)) {
			throw new BoardException("Não existe essa posicao no tabuleiro");
		}
		return peca(p) != null;
	}
	
	
	
	
	

}
