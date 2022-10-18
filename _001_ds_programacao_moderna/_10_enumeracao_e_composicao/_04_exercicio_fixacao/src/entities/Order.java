package entities;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> orderItens = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItens() {
		return orderItens;
	}
	
	public void addItem(OrderItem item) {
		orderItens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItens.remove(item);
	}
	
	Double sum = 0.0;
	public Double total() {
		for (OrderItem o : orderItens) {
			sum += o.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMARY: \n");
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client.getName());
		// O sdf mudar o formato da data e hora
		sb.append(" (" + sdf2.format(client.getBirthDate()) + ")");
		sb.append(" - " + client.getEmail() + "\n");
		sb.append("Order itens: \n");
		for (OrderItem o : orderItens) {
			sb.append(o.getProduct().getName() + ", ");
			sb.append("$" + o.getPrice() + ", ");
			sb.append("Quantity: ");
			sb.append(o.getQuantity() + ", ");
			sb.append("Subtotal: $");
			sb.append(o.subTotal() + "\n");
		}
		sb.append("Total price: $");
		sb.append(total());
		return sb.toString();
	}
	
}
