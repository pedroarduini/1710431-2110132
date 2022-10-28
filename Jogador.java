package model;

protected class Jogador {
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
	
	
	
	public Celula setCelula(Celula c) {
		this.posicao = c;
	}
	public Celula getPosicao() {
		return posicao;
	}
}
