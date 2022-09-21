package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Nome: ");
		student.nome = sc.nextLine();
		
		System.out.print("Nota 1: ");
		student.semestre1 = sc.nextDouble();
		
		System.out.print("Nota 2: ");
		student.semestre2 = sc.nextDouble();
		
		System.out.print("Nota 3: ");
		student.semestre3 = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();

	}

}
