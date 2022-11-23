package services;

import java.security.InvalidParameterException;

public interface InterestService {

	// Uma adaptaçao inteligente para o metodo que a implementar usar um atributo
	// seu, pois interface nao pode usar atributo, até poi isso esse metodo nao pode
	// ser defautl
	double getInterestRate();

	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
