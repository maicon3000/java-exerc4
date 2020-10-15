package util;

public class Dolar {
	
	public static double currencyConverter(double buy, double price) {
		return (buy + (buy * 0.06)) * price;
	}
}