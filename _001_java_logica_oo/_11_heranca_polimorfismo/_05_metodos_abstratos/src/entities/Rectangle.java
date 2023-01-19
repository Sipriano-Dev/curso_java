package entities;

import entities.enums.Color;

// Uma classe nao abstrata que extende uma abstrata é obrigada a sobrescrever um método abstrato da super classe
public class Rectangle extends Shape {

	private Double width;
	private Double height;

	public Rectangle() {
		// O construtor vazio é chamado aqui pois poder ser que haja alguma regra no
		// construtor da super classe
		super();
	}

	public Rectangle(Color color, Double width, Double height) {
		// Veja que o rectangle nao tem esse atributo, logo q ele herda de uma classe,
		// entao ele passa o valor que vai ser recebido para a classe que tem o atributo
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
