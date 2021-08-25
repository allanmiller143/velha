package entities;

import java.util.Scanner;

public class Leitor {
	
	Scanner sc = new Scanner(System.in);
	public void leitura(int[][] tab) {
		
		System.out.println();
		System.out.println("      JOGADOR 1");
		System.out.println();
		System.out.print("linha: ");
		int linha = sc.nextInt();
		System.out.print("coluna: ");
		int coluna = sc.nextInt();

		while (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
			System.out.println("VALORES INVALIDOS, TENTE NOMAVENTE!!!");
			System.out.println();
			System.out.print("linha: ");
			linha = sc.nextInt();
			System.out.print("coluna: ");
			coluna = sc.nextInt();
		}
		while (tab[linha][coluna] == 2 || tab[linha][coluna] == 1) {
			System.out.println();
			System.out.println("POSIÇÃO INVALIDA, TENTE NOVAMENTE!!! ");
			System.out.print("linha: ");
			linha = sc.nextInt();
			System.out.print("coluna: ");
			coluna = sc.nextInt();
			tab[linha][coluna] = 1;
		}
		tab[linha][coluna] = 1;
		System.out.println();

	
	}

	public void leitura2(int[][] tab) {
		
		System.out.println();
		System.out.println("      JOGADOR 2");
		System.out.println();
		System.out.print("linha: ");
		int linha = sc.nextInt();
		System.out.print("coluna: ");
		int coluna = sc.nextInt();

		while (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
			System.out.println("VALORES INVALIDOS, TENTE NOMAVENTE!!!");
			System.out.println();
			System.out.print("linha: ");
			linha = sc.nextInt();
			System.out.print("coluna: ");
			coluna = sc.nextInt();
		}
		while (tab[linha][coluna] == 2 || tab[linha][coluna] == 1) {
			System.out.println();
			System.out.println("POSIÇÃO INVALIDA, TENTE NOVAMENTE!!! ");
			System.out.print("linha: ");
			linha = sc.nextInt();
			System.out.print("coluna: ");
			coluna = sc.nextInt();
		}
		tab[linha][coluna] = 2;
		System.out.println();
		
	}
	
	

}
