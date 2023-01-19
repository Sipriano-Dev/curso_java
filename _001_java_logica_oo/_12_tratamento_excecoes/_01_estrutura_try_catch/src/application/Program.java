package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Ele vai tentar o bloco, caso de algum erro, vai partir pro catch e ver se tem algum tratamento pro erro la
		// O legal é q nao para o programa, caso vc trate a exceçao, o programa continua
		// Outra vantagem é q vc coloca uma msg mais amígável, ao invés de erro e fexar
		try {
			// Nao está declarado o tamanho do vetor, ele vai receber uma entrada separado
			// por espaço, e vai colocar cada um em uma posiçao, isso é a instanciaçao dele
			System.out.println("Digite os nomes");
			String[] vect = sc.nextLine().split(" ");
			System.out.println("Digite a posiçao");
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
		}
		// O e é só um apelido pra var q armazena a exceçao capturada
		// Caso ele capture essa exceçao, vai entra no bloco e executa-lo
		// Essa exceçao trata uma entrada que esta fora do alcançe do array
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		}
		catch(InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		System.out.println("End of the program!");

		sc.close();

	}

}
