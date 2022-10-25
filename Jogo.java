package model;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

public class Jogo {
	Random random = new Random();
	private int dado[] = new int[2];

	private ArrayList<Cartas> cartas;
	private ArrayList<Cartas> baralho;
	private ArrayList<Jogador> jogadores;
	protected ArrayList<Cartas> envelope;
	
	private Tabuleiro tabuleiro;
	
	public Jogo( ) {
		iniciaCartas();
		iniciaJogadores();
		montaEnvelope(
		//tabuleiro = new Tabuleiro();
		// criar o envelope
		// setar o tabuleiro
		
		
	}
	
	protected iniciaCartas(){
		cartas = new ArrayList<Cartas>();
		
		temp = new Cartas(TipoCarta.ARMA, "Corda");
		cartas.add(temp);
		temp.setNome("Cano de Chumbo");
		cartas.add(temp);
		temp.setNome("Faca");
		cartas.add(temp);
		temp.setNome("Chave Inglesa");
		cartas.add(temp);
		temp.setNome("Castical");
		cartas.add(temp);
		temp.setNome("Revolver");
		cartas.add(temp);
		
		temp.setTipo(TipoCarta.JOGADOR);
		temp.setNome("Srta. Scarlet");
		cartas.add(temp);
		temp.setNome("Coronel Mustard");
		cartas.add(temp);
		temp.setNome("Professor Plum");
		cartas.add(temp);
		temp.setNome("Reverendo Green");
		cartas.add(temp);
		temp.setNome("Sra. White");
		cartas.add(temp);
		temp.setNome("Sra. Peacock");
		cartas.add(temp);
		
		temp.setTipo(TipoCarta.COMODO);
		temp.setNome("Cozinha");
		cartas.add(temp);
		temp.setNome("Escritorio");
		cartas.add(temp);
		temp.setNome("Biblioteca");
		cartas.add(temp);
		temp.setNome("Sala de estar");
		cartas.add(temp);
		temp.setNome("Entrada");
		cartas.add(temp);
		temp.setNome("Sala de jantar");
		cartas.add(temp);
		temp.setNome("Sala de musica");
		cartas.add(temp);
		temp.setNome("Jardim de inverno");
		cartas.add(temp);
		temp.setNome("Salão de jogos");
		cartas.add(temp);
					
		baralho = (ArrayList<Cartas>)cartas.clone();
		embaralhaCartas();
	}
	
	protected embaralhaCartas( ){
		ArrayList<Cartas> temp = (ArrayList<Cartas>)cartas.clone();
		ArrayList<Cartas> embaralhado = new ArrayList<Cartas>();
		int sorteio;
		for(int i = 0;i<21;i++){
			sorteio = random.nextInt(21-i);
			embaralhado.add(temp.get(sorteio));
			temp.remove(sorteio);
		}
		cartas = (ArrayList<Cartas>)embaralhado.clone();
		
	}
	
	protected iniciaJogadores(){
		jogadores = new ArrayList<Jogador>();
		temp = new Jogador("Srta. Scarlet");
		jogadores.add(temp);
		temp.setNome("Coronel Mustard");
		jogadores.add(temp);
		temp.setNome("Professor Plum");
		jogadores.add(temp);
		temp.setNome("Reverendo Green");
		jogadores.add(temp);
		temp.setNome("Sra. White");
		jogadores.add(temp);
		temp.setNome("Sra. Peacock");
		jogadores.add(temp);
	}	
	
	protected montaEnvelope(){
		int sorteio;
		envelope = new ArrayList<Cartas>();
		
		sorteio = random.nextInt(6);
		envelope.add(cartas.get(sorteio));
		baralho.remove(sorteio);
		
		sorteio = random.nextInt(6) + 6;
		envelope.add(cartas.get(sorteio));
		baralho.remove(sorteio-1);
		
		sorteio = random.nextInt(9) + 12;
		envelope.add(cartas.get(sorteio));
		baralho.remove(sorteio-2);
	}	
	
	protected distribuiCartas(){
		int atual = 0;
		montaEnvelope();
		Iterator<Cartas> aux = baralho.iterator();
		while(aux.hasNext()){
			jogadores.get(atual).atribuirCarta(aux.next());
			jogadores.get(atual).anotaBlocoDeNotas(aux.next().nome);
			aux.remove();
			atual++;
			if(atual==6){
				atual = 0;	
			}	
		}	
	}
			
	protected int[] jogaDados(){
	        dado[0] = random.nextInt(6) + 1;
	        dado[1] = random.nextInt(6) + 1;
	        return dado;
	}

}
