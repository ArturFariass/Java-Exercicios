import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.


public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero inteiro: ");
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.printf("%d � um n�mero POSITIVO.%n", numero);
		}
		else {
			System.out.printf("%d � um n�mero NEGATIVO.%n", numero);
		}
		
		
		sc.close();
		
	}

}
