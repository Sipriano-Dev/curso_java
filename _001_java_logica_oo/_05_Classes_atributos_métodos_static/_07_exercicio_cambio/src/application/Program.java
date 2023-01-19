package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dolar? ");
		double cotacao = sc.nextDouble();
		System.out.print("Quantos dolares serão comprados? ");
		double qtde = sc.nextDouble();
		
		double convertido = CurrencyConverter.cambio(cotacao, qtde);
		
		System.out.printf("Valor a ser pago em reais: %.2f", convertido);
		
		
		sc.close();

	}

}
