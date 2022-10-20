package entities;

public class SavingsAccount extends Account{
	
	private Double interestRates;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRates) {
		super(number, holder, balance);
		this.interestRates = interestRates;
	}

	public Double getInterestRates() {
		return interestRates;
	}

	public void setInterestRates(Double interestRates) {
		this.interestRates = interestRates;
	}
	
	public void updateBalance() {
		balance += balance * interestRates;
	}

}
