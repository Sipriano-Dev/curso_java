package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "D:\\1. Programming\\[Workspace]\\temp\\in.txt";

		// try com recursos, já fecha pra vc nao precisar ter que usar outro try pra
		// fechar dentro do finally
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			while (br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
