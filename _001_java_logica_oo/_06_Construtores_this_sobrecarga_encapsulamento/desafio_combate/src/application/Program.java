package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion[] champion = new Champion[2];

		for (int i = 0; i < 2; i++) {

			if (i == 0) {
				System.out.println("Digite os dados do primeiro campeão: ");
			} else {
				System.out.println("Digite os dados do segundo campeão: ");
			}

			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Vida inicial: ");
			int vidaInicial = sc.nextInt();
			System.out.print("Ataque: ");
			int ataque = sc.nextInt();
			System.out.print("Armadura: ");
			int armadura = sc.nextInt();
			sc.nextLine();
			System.out.println();

			champion[i] = new Champion(nome, vidaInicial, ataque, armadura);
		}

		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			champion[0].takeDamage(champion[1]);
			champion[1].takeDamage(champion[0]);

			System.out.println("Resultado do turno " + (i + 1) + ": ");
			System.out.println(champion[0].status());
			System.out.println(champion[1].status());
			System.out.println();

			if (champion[0].getLife() == 0 || champion[1].getLife() == 0) {
				break;
			}

		}

		System.out.println("FIM DO COMBATE!");

		sc.close();

	}

}
