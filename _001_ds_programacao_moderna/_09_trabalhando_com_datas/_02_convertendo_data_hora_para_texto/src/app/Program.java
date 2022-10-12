package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-11-09");
		LocalDateTime d05 = LocalDateTime.parse("2022-11-09T01:40:24");
		Instant d06 = Instant.parse("2022-11-02T00:30:30Z");

		// Cria uma formataçao personalizada tanto pra receber quanto pra imprimir
		// Criando dessa forma, pode ser reaproveitado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		// Nesse caso pra o instant que é global tem de especificar o fuso, usamos o
		// withZone, e como parametro usamos um metodo que pega o fuso do sistema
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		// Voce pode usar uma lista de formataçao que tem na documentaçao, essa forma no
		// iso 8601, nao funciona no Instant por ser locadate
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		// Ele usara o utc por nao ter especificado o fuso
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

		// Imprime com o toString normal no formato iso 8601
		System.out.println("d04 = " + d04);
		// Imprime com a formataçao personalizada
		System.out.println("d04 fmt = " + d04.format(fmt1));
		// Outra forma de imprimir formatado
		System.out.println("d04 = " + fmt1.format(d04));
		// A primeira forma de forma direta, dessa forma o garbage collector vem limpar
		// Caso for usar só uma vez, compensa
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		// A segunda forma de forma direta
		System.out.println("d04 = " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(d04));

		System.out.println("d05 = " + d05.format(fmt1));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));

		System.out.println("d06 = " + d06);
		// Se chamar com o d06.format nao funciona pois o instant nao tem o format
		// Foi passado a data de londres, ma como na formataçao chamamos o zone do
		// sistema, veio com horario e data do gmt do sistema
		System.out.println("d06 = " + fmt3.format(d06));
		// Pra usar no formato iso nao precisa disso, é mostra normal no toString sem
		// formatar
		System.out.println("d06 = " + fmt5.format(d06));

	}

}
