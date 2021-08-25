package entities;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Logica logica;
	private Leitor leitor;
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;	
	}

	public void tabuleiro(int[][] tab) {
		for (int i = 0; i < linhas; i++) {
			System.out.print(i + "  ");
			for (int j = 0; j < colunas; j++) {
				if (tab[i][j] == 1) {
					System.out.print("[x]  ");
				} else if (tab[i][j] == 2) {
					System.out.print("[o]  ");
				} else {
					System.out.print("[ ]  ");
				}
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("    0    1    2");
		System.out.println();
		System.out.println("______________________");
	}
}
