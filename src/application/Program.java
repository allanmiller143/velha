package application;

import entities.Leitor;
import entities.Logica;
import entities.Tabuleiro;

public class Program {

	public static void main(String[] args) {

			String Xvence = "jogador 1 venceu";
			String Ovence = "jogador 2 venceu";
			int[][] tab = new int[3][3];
			Tabuleiro tabuleiro = new Tabuleiro();
			Logica l = new Logica(Xvence, Ovence);
			Leitor leitor = new Leitor();
			System.out.println("---> JOGO DA VELHA  <---");
			System.out.println();

			tabuleiro.tabuleiro(tab);
			for (int i = 1; i < 10; i++) {
				if (i % 2 != 0) {
					leitor.leitura(tab);
				} else {
					leitor.leitura2(tab);
				}
				tabuleiro.tabuleiro(tab);
				l.vencedor(tab);
			}
			System.out.println("empate!!!");

	}

}
