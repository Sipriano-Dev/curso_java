package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "Maria@gmail.com");
		Client c2 = new Client("Maria", "Maria@gmail.com");
		
		// Valor literal é quando nao usa o new, como se fosse primitivo
		String s1 = "test";
		String s2 = "test";
		// Nesse caso é um obj
		String s3 = new String("Test");
		String s4 = new String("Test");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		// O == (tirando String que tem tratamento especial) compara as referencias e
		// nao o obj, acaba servindo pra variavel primitiva
		// O equals compara o valor dentro do objeto
		// Usando o hashcode e equals personalizado vc escolher como quer comparar nome
		// e email etc...
		System.out.println(c1 == c2);
		// Da true pq quando o valor é literal o String é tratado como primitivo
		System.out.println(s1 == s2);
		// Agora da diferente por que nao é mais literal é um objeto e esta comparando o que esta dentro da referencia
		System.out.println(s3 == s4);
		

	}

}
