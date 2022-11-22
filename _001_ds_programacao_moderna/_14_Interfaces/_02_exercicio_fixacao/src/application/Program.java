package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import domain.entities.Contract;
import domain.entities.Installment;
import domain.service.ContractService;
import domain.service.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Número: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		// Uma forma de receber string e já converter pra data
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(num, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int numParcelas = sc.nextInt();
		
		//Injeçao de dependencia
		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(contract, numParcelas);
		
		
		System.out.println("Parcelas: ");
		for (Installment i : contract.getInstallments()) {
			System.out.println(i);
		}
		
		
		
		
		sc.close();

	}

}
