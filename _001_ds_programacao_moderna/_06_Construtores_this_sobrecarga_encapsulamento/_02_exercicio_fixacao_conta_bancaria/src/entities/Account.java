package entities;

public class Account {

	private String accountNumber;
	private String holder;
	private double balance;

	public Account() {

	}

	public Account(String account, String holder, double balance) {
		this.accountNumber = account;
		this.holder = holder;
		this.balance = balance;
	}

	public Account(String account, String holder) {
		this.accountNumber = account;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getAccount() {
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
