package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// é preciso instanciar um objeto no programa pra acessar os atributos e métodos
		// e mandar as entradas pra ele
		Rectangle rectangle = new Rectangle();

		System.out.println("Entre com a largura e altura do retângulo: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();

		System.out.println();
		System.out.println(rectangle);

	}

}
