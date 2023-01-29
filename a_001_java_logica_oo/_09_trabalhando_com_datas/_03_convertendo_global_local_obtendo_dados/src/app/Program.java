package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-11-09");
		LocalDateTime d05 = LocalDateTime.parse("2022-11-09T01:40:24");
		Instant d06 = Instant.parse("2022-11-02T01:30:30Z");

		// ZoneId.get... mostra uma lista de fusos disponíveis
		// É interessante o fato de usar um coleçao dentro do for em lambda
		// for (String s : ZoneId.getAvailableZoneIds()) {
		// System.out.println(s);
		// }

		// Converte o Instat(global) para uma data local, recebendo o obj instant e o
		// zoneId, no caso o do sistema, no caso o LocalDate pega só a data, mesmo tendo
		// mais dados como hora
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		// Com esse código vc passa o nome do lugar, que contem na lista de zoneIds
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);

		// Pegando o dia do mes, mes e ano de um data local
		System.out.println("d04 = " + d04.getDayOfMonth());
		System.out.println("d04 = " + d04.getMonthValue());
		System.out.println("d04 = " + d04.getYear());

		// Pegando hora e minuto de um local date
		System.out.println("d04 = " + d05.getHour());
		System.out.println("d04 = " + d05.getMinute());

	}

}