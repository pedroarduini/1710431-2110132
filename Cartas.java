package model;

protected class Cartas {
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
	
	public String setTipo(TipoCarta t) {
		this.tipo = t;
	}
	
	public String setNome(String s) {
		this.nome = s;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
}
