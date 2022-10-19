package model;
import java.util.Random;

public class Jogo {
	Random random = new Random();
	int dado[] = new int[2];
	int solucao[] = new int[3];
	Cartas cartas[];
	Jogador jogadores[];
	Cartas envelope [];
	Tabuleiro tabuleiro;
	
	public Jogo( ) {
		cartas = new Cartas[]
				{
					new Cartas("arma", "Corda"),
					new Cartas("arma", "Cano de Chumbo"),
					new Cartas("arma", "Faca"),
					new Cartas("arma", "Chave Inglesa"),
					new Cartas("arma", "Castical"),
					new Cartas("arma", "Revolver"),
					new Cartas("suspeito", "Srta. Scarlet"),
					new Cartas("suspeito", "Coronel Mustard"),
					new Cartas("suspeito", "Professor Plum"),
					new Cartas("suspeito", "Reverendo Green"),
					new Cartas("suspeito", "Sra. White"),
					new Cartas("suspeito", "Sra. Peacock"),
					new Cartas("comodo", "Cozinha"),
					new Cartas("comodo", "Escritorio"),
					new Cartas("comodo", "Biblioteca"),
					new Cartas("comodo", "Cozinha"),
					new Cartas("comodo", "Sala de estar"),
					new Cartas("comodo", "Sala de jantar"),
					new Cartas("comodo", "Jardim"),
					new Cartas("comodo", "Sala de musica"),
					new Cartas("comodo", "Entrada"),
				};
		
		jogadores = new Jogador[]
				{
						new Jogador("Srta. Scarlet"), new Jogador("Coronel Mustard"), new Jogador("Professor Plum"), new Jogador("Reverendo Green"), new Jogador("Sra. White"), new Jogador("Sra. Peacock"),
				};
		//tabuleiro = new Tabuleiro();
		// criar o envelope
		// setar o tabuleiro
		
		solucao[0] = random.nextInt(6);
		solucao[1] = random.nextInt(6) + 6;
		solucao[2] = random.nextInt(6) + 12;
		
		public int[] jogaDados(){
	        dado[0] = random.nextInt(6) + 1;
	        dado[1] = random.nextInt(6) + 1;
	        return dado;
	    }
	}

}
