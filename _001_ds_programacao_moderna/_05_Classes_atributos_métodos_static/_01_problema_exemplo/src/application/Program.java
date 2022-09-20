package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;//cria variáveis na memoria stack(estática) do tipo Triangle
		x = new Triangle();//cria um objeto na memoria heap(dinâmica) usando a classe Triangle com molde 
		y = new Triangle();//o x e o y recebe o endereço desse objeto e se torna um ponteiro
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();//o ponto é pra poder usar o que estiver dentro do objeto
		x.b = sc.nextDouble();//depois do ponto vem o a que é um atributo do objeto
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}