package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	// Quando vc cria outros construtores, você perde o padrão, então precisa
	// coloca-lo manualmente
	public Product() {

	}

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

	// Serve para buscar e exibir o nome no programa
	public String getName() {
		return name;
	}

	// Serve para modificar o nome já que os atributos agora só podem ser acessados
	// pela própria classe, dessa forma tem se a vantagem de colocar regras no
	// método
	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
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