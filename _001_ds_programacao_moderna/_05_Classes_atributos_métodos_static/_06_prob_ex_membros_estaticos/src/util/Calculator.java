package util;

public class Calculator {

	public static final double PI = 3.14159;
	
	//agora são static, uso chamando o nome da classe, sem cria instancia
	public static double circunference(double radius) {
		// formula da circunferencia de um circulo usando raio
		return 2 * PI * radius;
	}

	public static double volume(double radius) {
		// formula do volume de um circulo usando raio
		return 4 * PI * Math.pow(radius, 3) / 3;
	}
}
