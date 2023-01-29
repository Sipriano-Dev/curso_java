package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// Duas barras pois o barra é pra caracteres especiais tipo barra n, nesse caso
		// é duas barras
		// O file tá encapsulando o endereço e tbm contém tudo que é preciso pra acessar
		// o arquivo
		File file = new File("D:\\1. Programming\\[Workspace]\\temp\\in.txt");
		// Instancia um scanner
		Scanner sc = null;
		// Ai pra ler o arquivo o qual o endereço está dentro do File, vc instancia o
		// scanner com o arquivo, dentro do try pois pode gerar uma exeçao IO
		try {
			sc = new Scanner(file);
			// Verifica se ainda tem uma linha
			while (sc.hasNextLine()) {
				// Impirmi a proxima linha
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			// Isso fecha o recurso independente se o try rodou ou nao, boa prática
		} finally {
			// Verifica com if pq a exceçao pode ocorrer antes do sc ter algo nele, nesse
			// caso só precisa fechar se tiver algo
			if (sc != null) {
				sc.close();
			}
		}

	}

}
