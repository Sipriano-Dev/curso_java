package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	// Se usar a interface shape nao vai dar pois se fizer uma list integer ela nao
	// é um subtipo da lista shape
	// Se usar o ? também nao da pois nao garante que o tipo seja shape como ta no
	// for
	// Usando o extends shape resolve o problema
	// Porém novamente nao é possível inserir nessa lista ?, pois vc insere um
	// retangulo, mas a lista que já esta la pode ser um circulo
	// Covariancia, get ok put not ok
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
