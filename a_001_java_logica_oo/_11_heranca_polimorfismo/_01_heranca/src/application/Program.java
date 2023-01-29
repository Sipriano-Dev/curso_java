package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		// Polimorfismo é o fato a variavel x e y ser do mesmo tipo (Account) e
		// apontarem pra objetos diferentes, formas diferentes, isso acontece na criaçao
		// que há em tempo de execuçao com o upcasting
		x.withdraw(50.0);
		y.withdraw(50.0);

		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}

}
