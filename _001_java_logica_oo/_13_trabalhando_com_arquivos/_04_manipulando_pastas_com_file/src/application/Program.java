package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// Cria um vetor que recebe a filtragem de pastas que contem no caminho, basta
		// mudar o isDirectory para isFile pra buscar a lista de arquivos
		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}

		File[] files = path.listFiles(File::isFile);

		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}

		// Cria uma pasta dentro do caminho especificado, ta sendo usado o strPath para
		// encurtar, mas vc pode escrever todo o caminho
		boolean success = new File(strPath + "\\teste").mkdir();
		System.out.println("Directory created succefully: " + success);

		sc.close();

	}

}
