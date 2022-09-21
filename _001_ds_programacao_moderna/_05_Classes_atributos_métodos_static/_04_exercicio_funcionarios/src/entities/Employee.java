package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	// void normalmente recebe de fora os dados e modifica algum atributo
	public void increaseSalary(double percent) {
		grossSalary += grossSalary * percent / 100;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}

}
