package model;

class Jogador {
	private int posicao[] = new int[2];
	private String nome;
	public Cartas []cartasJ;
	private int nCartas = 0; 
	
	public Jogador (String name) {
		this.nome = name;
	} 
	
	public void atribuirCarta(Cartas carta) {
		this.cartasJ[nCartas] = carta; 
		nCartas++; 
	}
	
	public String setNome(String s) {
		this.nome = s;
	}
	
	public String getNome() {
		return this.nome;
	}
	// x- linha e y - coluna
	public void move(int x, int y) {
		this.posicao[0] = x;
		this.posicao[1] = y;
	}
	public int[] getPosicao() {
		return posicao;
	}
}
