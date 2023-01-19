package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/mm/yyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-in date (dd/mm/yyy): ");
			Date checkOut = sdf.parse(sc.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/mm/yyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-in date (dd/mm/yyy): ");
			checkOut = sdf.parse(sc.next());

			reservation.updateDate(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			// catch com erro que já existe em Exceptions (genérico)
		} catch (ParseException e) {
			System.out.println("Invalid date format!");
			// catch com erro personalizado
		} catch (DomainException e) {
			// e.getMessage é a mensagem que foi escrita na hora de instancia a exceçao
			System.out.println("Error in reservation: " + e.getMessage());
			// catch com erro genérico, pois com estou usando o Runtime o compilador nao
			// avisa, entao qualquer erro de Runtime vai ser tratado genericamente, com isso
			// se quiser nao quebra o programa
		} catch (RuntimeException e) {
			System.out.println("Unexpected eroor");
		}

		sc.close();

	}

}
