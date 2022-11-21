package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;

	private BrazilTaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public BrazilTaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		// Pega a duraçao entre duas datas de LocalDateTime
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		// pra poder arredondar a hora, o ideal é pegar em minutos pra ter fraçoes
		// sobrando, se pegar em horas, n vai ter minutos e nao vai dar pra arredondar
		double hours = minutes / 60;

		double basicPayment;
		if (hours < 12) {
			// Arredonda as horas pra cima, precisa estar em fraçoes
			basicPayment = pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}

		double tax = taxService.tax(basicPayment);
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}

}
