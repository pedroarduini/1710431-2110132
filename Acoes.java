package model;

public class Acoes {
	class Acusacao {
		private Jogador acusador;
		private Jogador acusado;
		private Comodo lugar_acusacao;
		private String arma_acusacao;
		
		//faz a acusacao
		public Acusacao(Jogador acusador, Jogador acusado, Comodo lugar, String arma) {
			this.acusador = acusador;
			this.acusado = acusado;
			this.lugar_acusacao = lugar;
			this.arma_acusacao = arma;
		}
		
		//verifica se a acusacao feita eh valida
		//valio definido no envelope
		public boolean verificaAcusacao(Acusacao ac, ArrayList<Cartas> envelope) {
			if (ac.acusado.getNome() == envelope.get(0).getNome() && ac.lugar_acusacao.getNome() == envelope.get(1).getNome() && ac.arma_acusacao == envelope.get2).getNome()) {
				System.out.printf("%s GANHOU!", ac.acusador.getNome());
				return true;
			}
			else {
				//para de andar
				//se tiver bolqueando comodo vai pro meio
				return false;
			}
		}
	}
	
	class Palpite {
		private Jogador palpiteiro;
		private Jogador palpitado;
		private Comodo lugar_palpite;
		private String arma_palpite;
		
		public Palpite(Jogador palpiteiro, Jogador palpitado, Comodo lugar, String arma) {
			this.palpiteiro = palpiteiro;
			this.palpitado = palpitado;
			this.lugar_palpite = lugar;
			this.arma_palpite = arma;
		}
		
		//falta fazer versão em que cada jogador em ordem tenta provar falso o palpite
		public boolean verificaPalpite(Palpite pp, Jogador p2) {
			if (pp.palpitado.getNome() == "valido" && pp.lugar_palpite.comodo == "valido" && pp.arma_palpite == "valido") {
				return true;
			}
			else {
				//mostrar uma carta
				return false;
			}
		}
	}

}
