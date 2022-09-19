package _03_funcoes_sintaxe;

import java.util.Scanner;

public class Program_with_function {
	//função padrão do entry point da aplicação, iniciada primeiro
	//toda classe que vai ser um programa precisa desse metodo main
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//função recebe 3 num inteiros(assinatura) e retorna um inteiro   
		int higher = max(a, b, c);
		
		//função recebe um int e apresenta uma msg na tela
		showResult(higher);
		sc.close();
	}

	//aqui começa a função, a parte que fica escondida do programa principal
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	//função recebe um inteiro e apresenta na tela
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
