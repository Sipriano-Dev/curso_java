package app;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		// New Date() cria uma instancia de data no momento atual da intanciacao
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		// Na hora de mostra o enum PENDING_PAYMENT, n se confunda, vai ser convertido
		// pra String e sera mostrada com o mesmo nome
		// Está sendo usado o toString
		System.out.println(order);

		// Objeto instanciado do tipo enum recebendo um valor que existe na classe
		OrderStatus os1 = OrderStatus.DELIVERED;
		// Obejto instanciado do tipo enum recebendo um valor String, detalhe é q essa
		// string precisa existir na classe, lembre se também que o obj os2 é um enum
		// com valor DELIVERED, Porém na hora de mostrar é convertido pra uma string
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(os1);
		System.out.println(os2);

	}

}
