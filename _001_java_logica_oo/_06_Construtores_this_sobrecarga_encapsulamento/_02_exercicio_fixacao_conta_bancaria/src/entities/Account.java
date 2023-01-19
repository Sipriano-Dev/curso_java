package entities;

public class Account {

	private int accountNumber;
	private String holder;
	private double balance;

	public Account() {

	}

	// Ao invés de colocar balance no construtor, colocamos initial deposit, pois
	// sera um deposito inicial
	public Account(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		// Ao invés de balance aqui, colocamos o metodo de deposito, já que é um
		// deposito, assim fica mais consistente, e o balance não é alterado diretamente
		// se um dia a regra de deposito mudar, só precisa mexer no metodo de deposito e
		// não no construtor
		deposit(initialDeposit);
	}

	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double value) {
		balance += value;
	}

	public void withdraw(double value) {
		balance -= value + 5.00;
	}

	public String toString() {
		return "Account: " + accountNumber + ", Holder: " + holder + String.format(", Balance: $ %.2f", balance);
	}

}
