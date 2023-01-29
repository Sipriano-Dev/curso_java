package default_package;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) { //enquanto x diferente de 0 o bloco será rodado
			soma += x; //soma = soma + x
			x = sc.nextInt();
		} //se o x for igual a 0 saiá do bloco, se não testara a condição novamente
		
		System.out.println(soma);
		
		sc.close();

	}

}
