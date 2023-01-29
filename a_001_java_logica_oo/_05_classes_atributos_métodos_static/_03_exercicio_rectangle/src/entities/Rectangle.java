package entities;

public class Rectangle {

	public double width;
	public double height;

	// o médoto n tem parametros porque foi instanciado no programa e está recebendo
	// as variaves que precisa no objeto, dessa forma o objeto ja tem o necessário
	// pra trabalhar nele mesmo
	public double area() {
		return width * height;
	}

	public double perimeter() {
		return width * 2 + height * 2;
	}

	public double diagonal() {
		return Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
	}

	//se o toString for chamado no programa, retornará o que está no bloco 
	public String toString() {
		return "Area = " + String.format("%.2f%n", area()) 
				+ "Perimetro = " + String.format("%.2f%n", perimeter())
				+ "Diagonal = " + String.format("%.2f", diagonal());
	}

}
