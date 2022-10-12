package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-11-09");
		LocalDateTime d05 = LocalDateTime.parse("2022-11-09T01:40:24");
		Instant d06 = Instant.parse("2022-11-02T01:30:30Z");

		// Subtrai 7 dias a data, pode usar outros metodos no d04, com adicionar meses
		// e anos e horas minutos etc
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		// Adiciona 7 dias a data
		// Detalhe, as datas sao imutaveis, vc n pode altera-las, vc cria outro objeto
		// com data alterada
		LocalDate nextWeekLocalDate = d04.plusDays(7);

		System.out.println("Past Week: " + pastWeekLocalDate);
		System.out.println("Next Week: " + nextWeekLocalDate);

		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

		System.out.println("Past Week Time: " + pastWeekLocalDateTime);
		System.out.println("Next Week Time: " + nextWeekLocalDateTime);

		// No caso do Instant, n funciona como o localDate, pra varir
		// Voce chama o metodo, depois passa a quantidade e a unidade temporal, usando o
		// ChrononUnit
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);

		// Como o localDate nao tem tempo, n iria funciona, pois usa-se a hora, nesse
		// caso use esse metodo pra adicionar a hora ao localDate
		Duration t0 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		// Dessa forma é mais facil e bonito, vai usar 0 horas e 0 minutos
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		// Calcula a duraçao entre duas datas, e traz em horas
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		// Usando no Instant
		Duration t3 = Duration.between(pastWeekInstant, d06);
		// Como aqui a data mais recente esta primeiro, vai mostra negativo
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println("t1 dias: " + t1.toDays());
		// Vem em horas, use metodos pra trazer no tempo que preferir
		System.out.println("t2 dias: " + t2.toDays());
		System.out.println("t3 dias: " + t3.toDays());
		System.out.println("t4 dias: " + t4.toDays());

	}

}
