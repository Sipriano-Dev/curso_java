package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
	public void IncreaseSalary(Double percent) {
		salary += salary * percent / 100;
	}
	
	//Notação para que se escrever a sobrecarga errada o compilador avisa
	@Override
	// O toString não precisa ser alterado pq é uma lista, isso é feito no programa com for
	public String toString() {
		return String.format("%d, %s, %.2f", id, name, salary);
	}
	
	

}
