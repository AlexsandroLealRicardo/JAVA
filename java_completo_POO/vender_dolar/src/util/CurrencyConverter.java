package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	double valorDolar;
	double compraDolar;
	
	public static double calculoDolar(double valorDolar, double compraDolar) {
		return valorDolar * compraDolar	 * (1.0 + IOF);
	}
	
}