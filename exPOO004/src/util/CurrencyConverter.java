package util;

public class CurrencyConverter {
	public static double IOF = 0.06;
	
	public static double dollarToReal(double dollarAmount, double dollarPrice) {
		return dollarAmount * dollarPrice * (1.00 + IOF);
	}
}
