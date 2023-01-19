package services;

import java.util.List;

public class CalculationService {

	// <T> é pra dizer que esse método vai trabalha com algum tipo T, já que nao
	// está na classe é necessário colocar aqui
	// Dentro do <T ...> está dizendo que extende um comparable do tipo T e que vai
	// trabalha com um comparable T, desde que o T seja de qualquer subtipo de
	// Comparable<T> isso é pra poder usar o compareTo
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
