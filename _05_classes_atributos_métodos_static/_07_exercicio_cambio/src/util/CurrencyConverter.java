package util;

public class CurrencyConverter {
	
	public static double cambio(double cotacao, double qtde) {
		return cotacao * qtde * 1.06;
	}

}
