package default_package;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números vão ser somados?: ");
		int n = sc.nextInt();
		
		int soma = 0;
		for (int i=0; i<n; i++) {
			System.out.println("Digite o número a somar: ");
			int x = sc.nextInt();
			soma += x;
		}
		//int i=0 -> inicia uma var com o valor 0
		//i<n -> enquanto a var i for menor que a var n
		//i++ -> o i será inclementado em +1
		
		/*quando o bloco termina ele testa pra ver se o 
		i é menor q o n se for ele entra no bloco se n ele sai
		usa-se o for quando ses sabe previamente a quantidade a ser usado*/
		
		System.out.println("Total: " + soma);
		
		
		
		
		sc.close();

	}

}
