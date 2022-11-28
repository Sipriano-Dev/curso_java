package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	// O tipo integer nao é subtipo de Obj, em listas, entao pra lista receber qq
	// tipo, usa se interrogaçao
	// Voce nao pode adicionar com uma lista <?> generica, mas pode receber qualquer lista
	// e imprimir
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}