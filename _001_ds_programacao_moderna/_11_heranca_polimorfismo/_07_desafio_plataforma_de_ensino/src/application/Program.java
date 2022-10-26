package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados da " + i + "a aula: ");
			System.out.print("Counteúdo ou tarefa (c/t)? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Título: ");
			String titulo = sc.nextLine();
			if (resp == 'c') {
				System.out.print("Url do video: ");
				String url = sc.nextLine();
				System.out.print("Duraçao em segundos: ");
				int duracao = sc.nextInt();
				list.add(new Video(titulo, url, duracao));
			} else {
				System.out.print("Descriçao: ");
				String descricao = sc.nextLine();
				System.out.print("Quantidade de questoes: ");
				int qtde = sc.nextInt();
				list.add(new Task(titulo, descricao, qtde));
			}
			System.out.println();
		}
		
		int total = 0;
		for (Lesson e : list) {
			total += e.duration();
		}
		
		System.out.println("DURAÇAO TOTAL DO CURSO = " + total + " segundos");
		
		sc.close();

	}

}
