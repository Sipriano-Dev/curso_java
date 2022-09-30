package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// Declaração de um vetor do tipo double
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double average = soma / n;
		
		System.out.printf("Average: %.2f", average);
		
		sc.close();

	}

}
