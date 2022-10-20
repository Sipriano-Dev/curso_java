package entities;

public class SavingsAccountPlus extends SavingsAccount {

	//Nao pode ser sobre  
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
