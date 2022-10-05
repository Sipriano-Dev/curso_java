package entities;

public class TaxPayer {

	private double salaryIncome;
	private double servicesIcome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;

	public TaxPayer(double salaryIncome, double servicesIcome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIcome = servicesIcome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIcome() {
		return servicesIcome;
	}

	public void setServicesIcome(double servicesIcome) {
		this.servicesIcome = servicesIcome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		double mensalAverage = salaryIncome / 12;
		double tax;
		if (mensalAverage < 3000.00) {
			tax = 0;
		} else if (mensalAverage < 5000) {
			tax = salaryIncome * 0.10;
		} else {
			tax = salaryIncome * 0.20;
		}

		return tax;
	}

	public double servicesTax() {
		return servicesIcome * 0.15;
	}

	public double capitalTax() {
		return capitalIncome * 0.20;
	}

	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}

	public double taxRebate() {
		double deductibleExpenses = healthSpending + educationSpending;
		double maximumDeductible = grossTax() * 0.3;
		double abatement = 0;
		if (deductibleExpenses < maximumDeductible) {
			abatement = deductibleExpenses;
		} else {
			abatement = maximumDeductible;
		}
		return abatement;
	}

	public double netTax() {
		return grossTax() - taxRebate();
	}

	@Override
	public String toString() {
		return String.format("Imposto bruto total: %.2f%nAbatimento: %.2f%nImposto devido: %.2f%n", grossTax(),
				taxRebate(), grossTax() - taxRebate());
	}

}
