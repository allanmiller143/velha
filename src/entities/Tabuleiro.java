package entities;

public class Tabuleiro {
	public void tabuleiro(int[][] tab) {
		for (int i = 0; i < 3; i++) {
			System.out.print(i + "  ");
			for (int j = 0; j < 3; j++) {
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
