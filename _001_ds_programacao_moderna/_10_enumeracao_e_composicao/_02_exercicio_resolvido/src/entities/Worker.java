package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	// Isso é uma associaçao/composiçao 1 para 1
	private Department department;
	// Isso é uma associaçao/composiçao 1 para muitos
	// É necessário já instanciar e nao incluir no construtor
	// Pode gera o get e set
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public Double income(Integer month, Integer year) {
		Double sum = baseSalary;
		//Intancia um calendario pra ficar mais facil trabalhar com a data
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			//Aqui a cada rodada do for, a data do elemento da lista passa para o calendario
			cal.setTime(c.getDate());
			//Aqui criamos uma variavel de escopo pra receber o ano e mes dos objetos da lista para poder se trabalhar, 
			//ja que pegar de forma direta esta deprecated
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			//Agora que foi pego os valores das datas da lista, é possivel comparar
			if (c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}
		return sum;

	}

}
