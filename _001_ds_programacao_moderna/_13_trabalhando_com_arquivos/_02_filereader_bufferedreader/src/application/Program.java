package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	//ESSE É UM JEITO MEIO ANTIGO, FECHAMENTO VERBOSO, TEM UM JEITO MAIS FÁCIL
	public static void main(String[] args) {

		String path = "D:\\1. Programming\\[Workspace]\\temp\\in.txt";
		// stream de leitura de caracteres a partir de arquivos
		FileReader fr = null;
		// Mais rápido
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			/* Meu jeito
			while (br.ready()) {
				System.out.println(br.readLine());
			}*/
			
			//Jeito do professor
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			// Poder dar erro pra fechar esses dois, por isso o try
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
