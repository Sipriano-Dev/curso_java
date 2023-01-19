package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas Pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];
		
		
		for (int i=0; i<pessoa.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "o Pessoa");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Pessoa(nome, idade, altura);
		}
		
		double soma = 0.0;
		
		for (int i=0; i<pessoa.length; i++) {
			soma += pessoa[i].getAltura();
		}
		
		double media = soma / pessoa.length;
		System.out.print("Altura média: " + media);
		System.out.println();
		
		int cont = 0;
		for (int i=0; i<pessoa.length; i++) {
			
			if (pessoa[i].getIdade() < 16) {
				cont ++;
			}
		}
		
		System.out.print("Pessoas com menos de 16 anos: " + cont);
		
		
		sc.close();

	}

}
