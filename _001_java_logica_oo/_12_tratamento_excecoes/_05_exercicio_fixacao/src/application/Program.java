package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.exceptions.WithdrawExceptions;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initicalBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		Account account = new Account(number, holder, initicalBalance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter the amount for withdraw: ");
		double amount = sc.nextDouble();
		try {
			account.withdraw(amount);
			System.out.print("New balance: " + account.getBalance());
		} catch (WithdrawExceptions e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		
		sc.close();
		
	}

}
