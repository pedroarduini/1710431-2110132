package model;

class Cartas {
	public enum TipoCarta{
		JOGADOR,ARMA,COMODO
		};
	
	private TipoCarta tipo; 
	private String nome;
	
	public Cartas(TipoCarta tipo, String nome) {
		super();
		this.tipo = tipo;
		this.nome  = nome;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
}
