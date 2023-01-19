package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Quando vc vai receber uma String do usuário no programa, precisa criar isso,
		// e usalo pra formata a String antes e enviar o date correto pra classe
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		// O emum vai ter uma entrada em String, entao instanciamos um enum
		// WorkerLevel.valueOf("") e passamos a var dentro das aspas que la dentro o
		// método convertera a string para enum
		// Também instanciamos um departamento, já que no construtor do worker, ele
		// recebe um obj do tipo department, que recebe uma string name, entao
		// instanciamos um departamento e passamos a string
		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

		System.out.println("How many contracts to this worker? ");
		Integer n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Enter contract #" + i + " data");
			System.out.print("Date (DD/MM/YYYY): ");
			// Nao da pra receber uma String e enviala, por isso precisamos criar o sdf pra
			// que ele faça o parse do string recebido pra o date
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valueHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			worker.addContract(new HourContract(contractDate, valueHour, hours));
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		// Uma forma de converter string para int com parseInt
		// Esta fazendo uma substring da posiçao 0 e 1 que sera o mes, lembre se de
		// colocar um númer a mais
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		// Aqui pra pegar o year, só precisa do 3 pois ele vai recortar do 3 em diante
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		// Acessa outro objeto pra depois acessar o atributo
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(month, year)));

		sc.close();
	}

}
