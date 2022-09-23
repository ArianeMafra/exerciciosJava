package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the student's name and their three grades: ");
		student.name = scanner.nextLine();
		student.grade1 = scanner.nextDouble();
		student.grade2 = scanner.nextDouble();
		student.grade3 = scanner.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f\n", student.finalGrade());
		System.out.println(student.isApproved());
		
		
		scanner.close();

	}

}
