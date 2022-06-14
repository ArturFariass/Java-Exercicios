import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
//a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
//b) a �rea do c�rculo de raio C. (pi = 3.14159)
//c) a �rea do trap�zio que tem A e B por bases e C por altura.
//d) a �rea do quadrado que tem lado B.
//e) a �rea do ret�ngulo que tem lados A e B.

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
		
		System.out.printf("Tri�ngulo: %.3f%n", areaTri);
		System.out.printf("Circulo: %.3f%n", areaCir);
		System.out.printf("Trapezio: %.3f%n", areaTra);
		System.out.printf("Quadrado: %.3f%n", areaQua);
		System.out.printf("Ret�ngulo: %.3f%n", areaRet);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
