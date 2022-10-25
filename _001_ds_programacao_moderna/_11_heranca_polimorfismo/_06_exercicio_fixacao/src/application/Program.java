package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();

			if (c == 'i') {
				System.out.print("Health expenditures: ");
				double hs = sc.nextDouble();
				list.add(new Individual(name, income, hs));
			} else {
				System.out.print("Number of Employees: ");
				int ne = sc.nextInt();
				list.add(new Company(name, income, ne));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer tp : list) {
			System.out.printf("%s : $%.2f%n", tp.getName(), tp.tax());
		}
		
		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: " + sum);
		
		sc.close();

	}

}
