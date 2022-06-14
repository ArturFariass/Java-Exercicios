import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio27 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		
		System.out.print("Nome: ");
		stu.name = sc.nextLine();
		System.out.print("Primeira nota: ");
		stu.notaUm = sc.nextDouble();
		System.out.print("Segunda nota: ");
		stu.notaDois = sc.nextDouble();
		System.out.print("Terceira nome: ");
		stu.notaTres = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", stu.nota());
		
		if (stu.nota() < 60.) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", stu.missingPoints());
		}
		else
			System.out.println("PASS");
			
			
			
			
		sc.close();
	}

}
