package model;

class Jogador {
	private Celula posicao; 
	private String nome;
	private ArrayList<Cartas> cartasJ;
	private int nCartas = 0; 
	private ArrayList<String> blocoDeNotas = new ArrayList<String>;
	
	public Jogador (String name) {
		this.nome = name;
		posicao = new Celula();
	} 
	
	public void atribuirCarta(Cartas carta) {
		this.cartasJ.add(carta); 
		nCartas++; 
	}
	
	public void anotaBlocoDeNotas(String nome){
		blocoDeNotas.add(nome);	
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
