package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a ordem da matriz: ");
		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		//mat[i].length significa que o mat na linha i usara o tanto de coluna pra definir o tamanho
		System.out.println("Digite os valores da matriz: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Main Diagonal: ");
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + ", ");
				}	
			}
		}
		
		int cont = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					cont++;
				}	
			}
		}
		
		System.out.println();
		System.out.print("Quantidade de impares: " + cont);
		

		sc.close();

	}

}
