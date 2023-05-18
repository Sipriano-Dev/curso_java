package default_package;

public class Main {
	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x); //A recebe raiz quadrada de x
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("raiz quadrada de " + x + " = " + A);
		System.out.println("raiz quadrada de " + y + " = " + B);
		System.out.println("raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y); //A recebe x elevado a y
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " ao quadrado = " + B);
		System.out.println("5 ao quadrado = " + C);
		
		A = Math.abs(y); //A recebe absoluto de y
		B = Math.abs(z);
		
		System.out.println("valor absoluto de " + y + " = " + A);
		System.out.println("valor absoluto de " + z + " = " + B);
	}
}
