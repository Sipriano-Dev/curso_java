package default_package;

import java.util.Locale;//Pacote da biblioteca util responsavel por configura a regiao

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);// Usa "US" para ponto ao inves de virgula

		System.out.print("Hello World"); // Nao quebra a linha no final do comando
		System.out.println("Good Morning"); // Quebra a linha no final do comando
//------------------------------------------------ --------

		int y = 32; // Cria uma var y tipo integer com o valor 32 nela
		double x = 10.35784; // Cria uma var x double(numeros quebrados) com o valor 10.35784 nela

		System.out.println(y);
		System.out.printf("%.2f%n", x);
		/*
		 * "printf" Formata a saida; "%" sera substituido pela var; ".2f" formata para 2 casas decimais; 
		 * "%n" Quebra linha em printf Usa virgula pra separar as var
		 */
//------------------------------------------------ --------

		System.out.println("Result = " + x + " meters"); // O simbolo "+" eh usado pra concatenar as var em println
		System.out.printf("Result = %.2f meters %n", x); // Concatenando com printf

		String name = "Mary";
		int age = 31;
		double income = 4000.0;

		System.out.printf("%s is %d years old and earns BRL %.2f reais%n", name, age, income);
		// Saida concatenada com varios tipos de mascaras

	}

}