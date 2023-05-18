package entities;

// final indica que a classe nao pode ser herdada, em um método indica que nao pode ser sobreposto, 
//classe final tem prioridade na velocidade de execuçao, o String é final
//public final class SavingsAccount extends Account {
public class SavingsAccount extends Account {

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

	@Override
	// Indica que esse metodo nao pode ser sobreposto, na maioria dos casos o ideal
	// é usar o final na sobreposiçao, pois sobrepor metodos sobreposto pode abrir
	// portas pra inconsitencias
	public final void withdraw(double amount) {
		balance -= amount;
	}

}
