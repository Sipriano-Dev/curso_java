package default_package;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x; 
		String s1, s2, s3;
		
		System.out.println("enter the data: ");
		x = sc.nextInt(); //Qualquer comando antes de nextLine colocará uma linha em branco em s1, tem que limpar o buffer
		sc.nextLine(); //Isso vai limpar o buffer
		s1 = sc.nextLine(); //Permitirá inserir texto até que você quebre a linha (toque em enter)
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS INTRODUZIDOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}
}