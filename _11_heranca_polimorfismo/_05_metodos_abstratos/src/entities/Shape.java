package entities;

import entities.enums.Color;

// Classe é abstrata pois o tem um metodo ou mais abstratos, classes e metodos abstratos nao podem ser instanciados
public abstract class Shape {

	private Color color;

	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Método abstrato, o que forçao a classe a ser abstrato
	public abstract double area();
}
