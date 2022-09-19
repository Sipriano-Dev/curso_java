package _03_desafio_atletas;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Atletas {

	public static void main(String[] args) {
		
		double contAtletas, contHomens, contMulheres;
		double altura, peso, pesoMedio, porcentagemHomen, alturaMediaMulheres;
		double totalAltura, totalPeso, maisAlto, totalAlturaMulheres;
		int n;
		String nome, sexo, nomeMaisAlto;
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		System.out.print("Qual a quantidade de atletas? ");
		n = scan.nextInt();
		
		totalAltura = 0;
		totalPeso = 0;
		contAtletas = 0;
		maisAlto = 0;
		contHomens = 0;
		contMulheres = 0;
		totalAlturaMulheres = 0;
		nomeMaisAlto = "Vazio";
		
		for(int i=1; i<=n; i++) {
			scan.nextLine();
			System.out.println("Digite os dados do atleta de numero " + i);
			System.out.print("Nome: ");
			nome = scan.nextLine();
			
			System.out.print("Sexo: ");
			sexo = scan.nextLine();
			while (!sexo.equals("F") && !sexo.equals("M")) {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = scan.nextLine();	
			}
			
			if (sexo.equals("M")) {
				contHomens++;
			} 
			if (sexo.equals("F")) {
				contMulheres++;
			}
			
			System.out.print("Altura: ");
			altura = scan.nextDouble();
			while (altura <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = scan.nextDouble();
			}
			
			totalAltura += altura;
			if (altura > maisAlto) {
				maisAlto = altura;
				nomeMaisAlto = nome;
			}
			
			if (sexo.equals("F")) {
				totalAlturaMulheres += altura;
			}
			
			System.out.print("Peso: ");
			peso = scan.nextDouble();
			while (peso <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = scan.nextDouble();
			}
			totalPeso += peso;
			
			contAtletas++;
			
		}
		
		pesoMedio = totalPeso / contAtletas;
		porcentagemHomen = 100 * contHomens / contAtletas;
		alturaMediaMulheres = totalAlturaMulheres / contMulheres;
		
		System.out.println();
		System.out.println("RELATÓRIO: ");
		System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
		System.out.println("Atleta mais alto: " + nomeMaisAlto);
		System.out.println(String.format("Porcentagem de homens %.1f", porcentagemHomen) + " %");
		if (totalAlturaMulheres == 0) {
			System.out.println("Não há mulheres cadastradas");
		} else {
			System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaMulheres);
		
		}
		

	}

}
