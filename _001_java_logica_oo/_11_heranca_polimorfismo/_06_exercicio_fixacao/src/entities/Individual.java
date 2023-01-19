package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		int percent = 0;
		if (super.getAnualIncome() < 20000.0) {
			percent = 15;
		} else {
			percent = 25;
		}
		return super.getAnualIncome() * percent / 100 - (healthExpenditures * 0.5);
	}

}
