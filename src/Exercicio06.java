import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTri, areaCir, areaTra, areaQua, areaRet;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTri = A * C / 2;
		areaCir = 3.14159 * Math.pow(C, 2);
		areaTra = (A + B) * C / 2;
		areaQua = Math.pow(B, 2);
		areaRet = A * B;
		
		System.out.printf("Triângulo: %.3f%n", areaTri);
		System.out.printf("Circulo: %.3f%n", areaCir);
		System.out.printf("Trapezio: %.3f%n", areaTra);
		System.out.printf("Quadrado: %.3f%n", areaQua);
		System.out.printf("Retângulo: %.3f%n", areaRet);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
