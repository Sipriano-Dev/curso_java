package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		String path = "D:\\1. Programming\\[Workspace]\\temp\\trabalhando com arquivos\\exercicio\\lista.csv";
		
		List<Produto> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while (br.ready()) {
				String line = br.readLine();
				String[] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer quantity = Integer.parseInt(vect[2]);
				list.add(new Produto(name, price, quantity));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String newPath = "D:\\1. Programming\\[Workspace]\\temp\\trabalhando com arquivos\\exercicio\\out\\summary.csv";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(newPath, true))) {
			for (Produto x : list) {
				bw.write(x.getNome() + ", " + x.subtotal());
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
