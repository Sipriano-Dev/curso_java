package entities;

// Usando o comparavel, os objetos podem ser comparados
public class Employee implements Comparable<Employee> {
	
	private String name;
	private Double salary;
	
	public Employee() {
	}

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	// O objeto é comparado com outro que for informado nos parametros
	// Se o nome for maior retorna um numero positivo, se for menor negativo e se for igual zero
	// pra comparar nome vc usar o código dessa forma, por salario é só trocar
	// O "-" iverte pra ordem decrescente, por que o "-" com o positivo vira netagivo e com o negativo vira positivo
	public int compareTo(Employee o) {
		//return -name.compareTo(o.getName());
		return salary.compareTo(o.getSalary());
	}
	
	
	
	

}
