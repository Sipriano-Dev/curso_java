package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	// se n for static n pode ser usado dentro de um método estatico como o main
	// o final diz que o valor da variável n pode ser alterado
	// o PI em maiúsculo se refere à uma constante, use _ se for mais de uma palavra
	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = circunference(radius);

		double v = volume(radius);

		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi value: %.2f%n", PI);

		sc.close();

	}

	// da mesma forma que a constante, esse metodo sendo estático, eu posso chamalo
	// dentro de outro método estático como o main
	public static double circunference(double radius) {
		// formula da circunferencia de um circulo usando raio
		return 2 * PI * radius;
	}

	public static double volume(double radius) {
		// formula do volume de um circulo usando raio
		return 4 * PI * Math.pow(radius, 3) / 3;
	}

}
