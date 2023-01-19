package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		//TreeMap esta ordenado em ordem alfabética
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "Maria@gmail.com");
		cookies.put("phone", "99711122");
		
		//remove do map usando key
		cookies.remove("email");
		//vai sobrescrever pois não aceita repetições
		cookies.put("phone", "99771133");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		//retorna null quando não existe
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES");
		
		//keySet é um metodo do map para trazer o conjunto set 
		for(String key: cookies.keySet()) {
			//Mostra a key e depois na lista busca o valor usando a key
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
