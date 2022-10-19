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
		boolean verificaAcusacao(Acusacao ac) {
			if (ac.acusado.getNome() == "valido" && ac.lugar_acusacao.comodo == "valido" && ac.arma_acusacao == "valido") {
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
		//falta verificar se o palpiteiro esta no comodo
		//falta trazer o outro jogador para o comodo
		public Palpite(Jogador palpiteiro, Jogador palpitado, Comodo lugar, String arma) {
			this.palpiteiro = palpiteiro;
			this.palpitado = palpitado;
			this.lugar_palpite = lugar;
			this.arma_palpite = arma;
		}
		//valido definido no envelope
		boolean verificaPalpite(Palpite pp, Jogador p2) {
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
