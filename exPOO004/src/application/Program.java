package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = scanner.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollarAmount = scanner.nextDouble();
		
		System.out.printf("Amount to be paid = R$ %.2f", CurrencyConverter.dollarToReal(dollarAmount, dollarPrice));
		
		scanner.close();

	}

}
