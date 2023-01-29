package desafio_bar;

import java.util.Scanner;

public class Bar {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sexo: ");
		String sexo = scan.next();
		System.out.print("Quantidade de cervejas: ");
		int qtdeCervejas = scan.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		int qtdeRefrigerantes = scan.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		int qtdeEspetinhos = scan.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO: ");
		
		double consumo = qtdeCervejas * 5.00 + qtdeRefrigerantes * 3.00 + qtdeEspetinhos * 7.00;
		System.out.printf("Consumo = %.2f", consumo);
		System.out.println();
		double couvert = 0;
		if (consumo > 30.00) {
			System.out.println("Isento de Couvert");
		} else {
			couvert = 4.00;
			System.out.printf("Couvert = %.2f", couvert);
			System.out.println();
		}
		double ingresso = 0;
		if (sexo.equals("F")) {
			ingresso = 8.00;
		} else {
			ingresso = 10.00;
		}
		System.out.printf("Ingresso = %.2f", ingresso);
		System.out.println();
		double total = consumo + couvert + ingresso;
		System.out.println();
		System.out.printf("Valor a pagar = R$%.2f", total);
		
		

	}

}
