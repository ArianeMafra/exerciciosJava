package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = scanner.nextInt();
		System.out.print("Enter account holder: ");
		scanner.nextLine();
		String holder = scanner.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = scanner.next().charAt(0);
		
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = scanner.nextDouble();
			account = new Account(accountNumber, holder, initialDeposit);
		} else {
			account = new Account(accountNumber, holder);
		}
		
		System.out.println();
		System.out.println("Accont data");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositAmount = scanner.nextDouble();
		account.deposit(depositAmount);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawAmount = scanner.nextDouble();
		account.withdraw(withdrawAmount);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		scanner.close();

	}

}
