package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	// Construtor obriga o dev a já instancia passando esses atributos no programa
	// principal
	public Product(String name, double price, int quantity) {
		// this referencia o objeto que sera criado
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Isso é uma sobrecarga de construtor, usar o mesmo construtor com parametros
	// diferentes
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}