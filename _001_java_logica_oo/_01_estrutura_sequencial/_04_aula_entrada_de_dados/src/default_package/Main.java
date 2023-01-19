package default_package;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Associe o objeto sc do tipo Scanner ao teclado ao teclado em modo console

		/*
		 * String x; 
		 * x = sc.next(); //Permite receber uma palavra do teclado no console e ser guardada na variável x do tipo String
		 * System.out.println("You typed: " + x);
		 */

		/*
		 * int x; 
		 * x = sc.nextInt(); // Pegue um int e armazena em x
		 * System.out.println("You typed: " + x);
		 */

		/*
		 * double x; 
		 * x = sc.nextDouble(); //Usa a localidade do sistema para escolher ponto ou vírgula, Brasil é vírgula 
		 * //System.out.println("Você digitou: " + x); // com vírgula aceita mas mostra o resultado com ponto, pois println tem localidade independente 
		 * System.out.printf("Você digitou: %.2f%n", x); // com printf você insere uma vírgula, o resultado também sai como uma vírgula
		 */

		/*
		 * char x; 
		 * x = sc.next().charAt(0); // use a função para obter o primeiro caractere da palavra recebida e armazená-lo em var x
		 * System.out.println("Você digitou: " + x);
		 */

		String x;
		int y;
		double z;
		System.out.println("Entre com os dados: ");
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados inseridos: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();

	}

}