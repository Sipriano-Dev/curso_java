package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Adress;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String nomeDep = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int diaPagamento = sc.nextInt();
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		Adress adress = new Adress(email, phone);
		Department dep = new Department(nomeDep, diaPagamento, adress);

		System.out.print("Quantos funcionários tem o departamento: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Dados do funcionário " + i);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			Employee emp = new Employee(nome, salario);
			dep.addEmployee(emp);
		}
		
		System.out.println();
		showReport(dep);

		sc.close();

	}

	private static void showReport(Department dep) {
		System.out.println("FOLHA DE PAGAMENTO: ");
		System.out.println("Departamento vendas = " + String.format("R$ %.2f", dep.payroll()));
		System.out.println("Pagamento realizado no dia " + dep.getPayDay());
		System.out.println("Funcionários: ");
		dep.getEmployees().forEach(x -> System.out.println(x.getName()));
		System.out.println("Para dúvidas favor entrar em contato: vendas@lojatop.com");
		
	}

}
