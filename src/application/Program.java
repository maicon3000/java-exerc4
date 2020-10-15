package application;

import java.util.Scanner;

import util.Dolar;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	     
		System.out.print("WHAT IS THE DOLLAR PRICE? ");
		double price = sc.nextDouble();
		System.out.print("HOW MANNY DOLLARS WILL BE BOUGHT? ");
		double buy = sc.nextDouble();
		double total = Dolar.currencyConverter(buy, price);
		System.out.printf("AMOUNT TO BE PAID IN REAIS = %.2f", total);
	    sc.close();

	}

}
