package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// Cria um formato de data customizado, passando a customizaçao como parametro
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		// Cria um formato customizado que aceita espaço depois da data
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

		// Instancia a data local
		LocalDate d01 = LocalDate.now();
		// Instancia a data e hora e fraçao de segundos
		LocalDateTime d02 = LocalDateTime.now();
		// Instancia data e hora global
		// Z indica gmt, portanto estao 3h adiantado, Greenwich TimeZone
		Instant d03 = Instant.now();

		// Tranforma um texto iso 8601 em um objeto LocalDate
		LocalDate d04 = LocalDate.parse("2022-11-09");
		// Transforma um texto iso 8601 em um objeto com data e hora
		LocalDateTime d05 = LocalDateTime.parse("2022-11-09T01:40:24");
		// Transforma um texto iso 8601 em um objeto com data e hora gmt global
		Instant d06 = Instant.parse("2022-11-02T00:30:30Z");
		// Instancia um texto iso 8601 gmt recebendo o horário de SP q é -03:00 no lugar
		// de Z
		Instant d07 = Instant.parse("2022-11-05T00:23:50-03:00");

		// Voce pode usar a customizaçao instanciada como segundo argumento
		LocalDate d08 = LocalDate.parse("20-10-2022", fmt1);
		// Ou voce pode instancia o segundo argumento direto
		//Recebe no formato customizado e mostra no formato iso
		LocalDate d09 = LocalDate.parse("20-10-2022", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDateTime d10 = LocalDateTime.parse("20-10-2022 01:30", fmt2);
		
		//Forma de receber dados isolados pra data e hora 
		LocalDate d11 = LocalDate.of(2022, 11, 9);
		LocalDateTime d12 = LocalDateTime.of(2022, 11, 9, 1, 35);

		// Todos geram o toString por baixo dos panos no formato iso 8601
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		System.out.println("d12 = " + d12);
	}

}
