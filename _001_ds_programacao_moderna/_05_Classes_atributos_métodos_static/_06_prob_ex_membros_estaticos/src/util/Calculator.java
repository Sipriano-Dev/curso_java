package util;

public class Calculator {

	public final double PI = 3.14159;
	
	//como não são mais static, eu preciso instanciar um objeto pra usar
	public double circunference(double radius) {
		// formula da circunferencia de um circulo usando raio
		return 2 * PI * radius;
	}

	public double volume(double radius) {
		// formula do volume de um circulo usando raio
		return 4 * PI * Math.pow(radius, 3) / 3;
	}
}
