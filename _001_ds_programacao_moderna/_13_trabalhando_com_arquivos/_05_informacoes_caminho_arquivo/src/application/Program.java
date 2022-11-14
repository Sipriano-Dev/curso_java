package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Pega o nome do arquivo (ultimo nome depois da barra)
		System.out.println("getName: " + path.getName());
		// Pega o caminho (todo nome antes da última barra)
		System.out.println("getParent: " + path.getParent());
		// Pega todo o caminho (o que escreveu)
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
		
	}

}
