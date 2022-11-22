package domain.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import domain.entities.Contract;
import domain.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		Double mensalidade = contract.getTotalValue() / months;
		
		for (int i=1; i<months+1; i++) {
			LocalDate dueDate = contract.getDate().plus(i, ChronoUnit.MONTHS);
			Double interest = onlinePaymentService.interest(mensalidade, i);
			Double fee = onlinePaymentService.paymentFee(mensalidade + interest);
			Double parcela = mensalidade + interest + fee;
			Installment installment = new Installment(dueDate, parcela);
			contract.getInstallments().add(installment);
			
		}
		
		
	}

}
