package _13_exercicio_fixacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> dados = new HashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while (line != null) {
				String[] vect = line.split(",");
				String name = vect[0];
				Integer value = Integer.parseInt(vect[1]);
				
				if (dados.containsKey(name)) {
					Integer aux = dados.get(name) + value;
					dados.put(name, aux);
				} else {
					dados.put(name, value);
				}
				
				line = br.readLine();
				
			}
			
		} catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		for (String c : dados.keySet()) {
			System.out.println(c + ": " + dados.get(c) );
		}
		
		sc.close();

	}

}
