import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.


public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número inteiro: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.printf("%d é um número POSITIVO.%n", numero);
		}
		else {
			System.out.printf("%d é um número NEGATIVO.%n", numero);
		}
		
		
		sc.close();
		
	}

}
