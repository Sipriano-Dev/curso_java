package entities;

// Relaçao é um (é um Account) diferente de composiçao que tem 1
// Especializaçao
// Herança é uma associaçao entre classe e nao entre objetos, 
// na composiçao quando vc instancia um objeto que contem outro, o atributo instancia um objeto
// mas na herança nao, vc só instancia um que contem os atributos da classe herdada
public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		// Repetindo o construtor aqui, pois pode ter alguma lógica no construtor padrao
		// do super que eu queira repetir aqui
		super();
	}

	// O Construtor está recebendo os dados da intancia dessa classe e vai passa
	// para a super classe, pois é ela que tem os argumentos
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

}
