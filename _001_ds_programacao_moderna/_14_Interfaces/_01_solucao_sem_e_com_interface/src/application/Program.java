package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Cria um padrao de formato especifico
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		// Para receber pelo console usa-se esse código, fazendo o parse e passando a
		// formataçao
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

		// Como carRental tem uma associaçao com vehicle, vc instancia um vehicle para
		// poder passa o atributo
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Entre com preço por hora: ");
		Double pricePerHour = sc.nextDouble();
		System.out.print("Entre com preço por dia: ");
		Double pricePerDay = sc.nextDouble();

		// BrazilTaxService instanciado sem passa nada, pra poder usar o metodo desse
		// serviço
		// Aqui está a mágica da interface, é aqui que é decidido o imposto de qual
		// país, sem precisar mexer muito
		// "new BrazilTaxService()" Injetando a dependencia
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

		rentalService.processInvoice(cr);

		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		sc.close();

	}

}
