package model;

public class Cartas {
	private String tipo; 
	private String nome;
	
	public Cartas(String tipo, String nome) {
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