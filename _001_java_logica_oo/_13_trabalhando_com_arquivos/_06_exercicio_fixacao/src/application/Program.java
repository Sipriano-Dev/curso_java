package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		// Caminho do arquivo a ser lido
		String path = "D:\\1. Programming\\[Workspace]\\temp\\trabalhando com arquivos\\exercicio\\lista.csv";
		// Usando o caminho pra criar um arquivo pra poder extrair o caminho sem o nome
		// do arquivo
		File filePath = new File(path);
		// Extraindo só o caminho sem o nome do arquivo
		File newPath = new File(filePath.getParent());
		// Criando uma subpasta usando o novo caminho
		boolean success = new File(newPath + "\\out").mkdir();

		// Lista criada pra cria qualquer filtro a apartir dela
		List<Produto> list = new ArrayList<>();

		// Usando try com recursos(n precisa de finally burocratico)
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// Enquanto o arquivo tiver uma linha a ser lida
			while (br.ready()) {
				String line = br.readLine();
				// Cria um vetor e usa a linha separando os itens por virgula
				String[] vect = line.split(",");
				String name = vect[0];
				// Converte o String pra double
				Double price = Double.parseDouble(vect[1]);
				Integer quantity = Integer.parseInt(vect[2]);
				list.add(new Produto(name, price, quantity));
			}

			// Cria um novo arquivo a partir do novo caminho + a pasta que foi criada
			// Sem o true ele vai recria o arquivo, com o true ele adiciona ao que já tem, se nao tem ele cria
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(newPath + "\\out\\summary.csv", true))) {
				for (Produto x : list) {
					// Pega o nome e o subtotal e coloca em uma linha do arquivo separado por
					// virgula
					bw.write(x.getNome() + ", " + x.subtotal());
					bw.newLine();
				}

				// Pra mostrar no console que o arquivo foi criado
				System.out.println("CREATED!");

			} catch (IOException e) {
				System.out.println("Error writting file: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

	}

}
