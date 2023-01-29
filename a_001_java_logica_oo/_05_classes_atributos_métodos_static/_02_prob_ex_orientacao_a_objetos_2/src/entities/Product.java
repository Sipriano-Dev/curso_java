package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	// this explicita que se refere ao atributo da classe
	// dentro dos parenteses está o parametro a ser recebido
	// vai receber e armazenar em quantity pra trabalhar com ela
	// depois sera desalocada, essa var n é a mesma do programa e nem da classe, é
	// independente
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	//toString é um metodo do Object(todas a classes é uma subclasse dela)
	//chamando o toString estamos fazendo um sobreposição do metodo toString
	public String toString() {
		//retorna uma string, então é como o println sem parenteses
		return name 
			+ ", $" 
			//String.format é como o printf
			+ String.format("%.2f", price) 
			+ ", " 
			+ quantity 
			+ " units, Total: " 
			+ String.format("%.2f", totalValueInStock());
	}

}
