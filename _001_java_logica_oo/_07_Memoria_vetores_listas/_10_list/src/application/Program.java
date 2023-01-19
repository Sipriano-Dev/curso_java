package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// Listas só aceitam wrapper classes
		// <Integer> é o que chamam de generics, parametriza a definicão de um tipo
		// informando outro tipo
		// List é a interface, n pode instancia, então vc instancia com uma classe que
		// implementa a List, no caso a arraylist é a mais usada
		List<String> list = new ArrayList<>();// ArrayList<String>();

		// Adiciona o nome a lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// Sobrecarga do add q adiciona o nome na posição desejada;
		list.add(2, "Marco");

		// Mostra o tamanho da lista
		System.out.println("Tamanho da lista: " + list.size());

		// Remove um elemento através de um nome, numero etc
		// list.remove("Anna");
		// list.remove(1);

		System.out.println("-----------------------------------");
		System.out.println("Elementos da lista: ");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------");

		// -> significa tal que
		// Use '' e não "" no charAt
		// Isso é uma função lambda conhecida como predicado, retorna um verdadeiro ou
		// falso, no caso se o predicado dentro do parenteses for verdadeiro, será
		// removido
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("Removido os que começam com M");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------------");
		System.out.println("Buscando por index");
		// Traz o número onde o objeto está indexado
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		// Quando o indexOf não encontra o elemento, ele retorna -1
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		System.out.println("---------------------------------------");

		// Cria uma list "result" que vai receber o resultado
		// "stream" converte o list pra que possa usar o predicado, pois o tipo list não
		// aceita lambda.
		// "filter" vai filtra a condição seguida do predicado
		// Depois vc volta pra tipo List usando o collect(Collectors.toList()) 

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		System.out.println("Filtrado só os que começam com A: ");
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");
		
		//"findFirst" encontra o primeiro objeto descrito no predicado (Optional string)
		//"orElse" retorna a condição dentro do parametro, no caso null
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		// Nesse caso retorna null
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println("Filtrado o primeiro que começa com B: ");
		System.out.println(name);
		System.out.println(name2);
		
		
	}

}
