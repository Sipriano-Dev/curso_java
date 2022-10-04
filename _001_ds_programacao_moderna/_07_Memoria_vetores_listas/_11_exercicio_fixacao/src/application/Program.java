package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			employees.add(new Employee(id, name, salary));
			System.out.println();
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		Integer idIncreased = sc.nextInt();

		Employee emp = employees.stream().filter(x -> x.getId().equals(idIncreased)).findFirst().orElse(null);

		// Aqui estou usando null pois está verificando se a referencia de emp esta
		// vazia, n serviria equal que compara o valor dentro da referencia porque não
		// haveria valor pra comparar se é igual
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			Double percent = sc.nextDouble();
			emp.IncreaseSalary(percent);
		}

		System.out.println();
		System.out.println("List of employees: ");
		// Usando o toString
		for (Employee x : employees) {
			System.out.println(x);
		}

		sc.close();

	}

}
