package entities;

public class Produto {
	
	private String nome;
	private Double price;
	private Integer quantidade;
	
	public Produto() {	
	}

	public Produto(String nome, Double price, Integer quantidade) {
		this.nome = nome;
		this.price = price;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double subtotal() {
		return price * quantidade;
	}

	
	

}
