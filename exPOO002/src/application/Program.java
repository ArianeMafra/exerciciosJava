package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Employee employee  = new Employee();
		
		System.out.println("Enter employee details");
		System.out.print("Name: ");
		employee.name = scanner.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = scanner.nextDouble();
		System.out.print("Tax: ");
		employee.tax = scanner.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f\n", employee.name, employee.netSalary());
		System.out.print("Which percentage to increase salary? ");
		double percentage  = scanner.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		
		System.out.println("Updated data: " + employee.toString());
		
		scanner.close();

	}

}
