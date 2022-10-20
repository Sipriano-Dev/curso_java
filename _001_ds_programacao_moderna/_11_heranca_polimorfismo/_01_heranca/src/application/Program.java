package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

		// UPCASTING
		// É possível pois bacc também é uma account
		Account acc1 = bacc;
		// Interessante pois o Account nao tem o loanLimite mais nao da erro, porém nao
		// consegue acessar o get dele
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING

		BusinessAccount acc4 = (BusinessAccount) acc2;
		// Nao seria possivel com acc2 usar o loan pois só está na BusinessAccount
		acc4.loan(100.00);
		// Essa conversao nao é possivel pois o acc3 é SavingsAccount,
		// BusinessAccount acc5 = (BusinessAccount) acc3;

		// Para evitar erro faça o procedimento abaixo
		// Porém aqui como nao é instancia nao vai printa na tela
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}

		// Nesse caso vai printa na tela pois é uma instancia
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}

	}

}
