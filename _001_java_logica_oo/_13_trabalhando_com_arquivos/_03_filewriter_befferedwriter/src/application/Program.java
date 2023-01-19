package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		// Instancia um vetor com valores
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		String path = "D:\\1. Programming\\[Workspace]\\temp\\out.txt";

		// new FileWriter(path) ele cria um arquivo caso nao tenha, e se usar o (path,
		// true) ele só escreve em cima do que já existe
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

			// Faz um for e pega cada linha do vetor e escreve no arquivo
			for (String line : lines) {
				bw.write(line);
				// pula uma linha dessa forma
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
