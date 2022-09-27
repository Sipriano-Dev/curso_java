package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		String accountNumber = sc.next();

		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);

		//Voce deve criar a variável fora do if pra poder usar ela fora 
		Account account;
		// Fique atento pois o char vc precisa usar aspas simples e pode usar o sinal
		// ==, já no String aspas duplas e o equals
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, holder, initialDeposit);
		} else {
			account = new Account(accountNumber, holder);
		}
		
		System.out.println();
		System.out.println("Account Data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		
		System.out.println("Account Data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		
		System.out.println("Account Data: ");
		System.out.println(account);

		sc.close();

	}

}
