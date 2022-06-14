import java.util.Locale;
import java.util.Scanner;

//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.


public class Exercicio20 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		double valor1, valor2, valor3, media;
		
		System.out.println("Número de casos: ");
		num = sc.nextInt();
		
		for (int i=0; i < num; i++) {
			System.out.println("Primeiro valor: ");
			valor1 = sc.nextDouble();
			System.out.println("Segundo valor: ");
			valor2 = sc.nextDouble();
			System.out.println("Terceiro valor: ");
			valor3 = sc.nextDouble();
			
			media = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / 10;
			System.out.printf("%.1f%n", media);
		}
		
		
		
		
		sc.close();
	}

}
