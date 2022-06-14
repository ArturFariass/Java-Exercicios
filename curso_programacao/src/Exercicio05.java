import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.


public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pecaUm, quantiPecasUm, pecaDois, quantiPecasDois;
		double valorPecaUm, valorPecaDois, preco;
		
		pecaUm = sc.nextInt();
		quantiPecasUm = sc.nextInt();
		valorPecaUm = sc.nextDouble();
		
		pecaDois = sc.nextInt();
		quantiPecasDois = sc.nextInt();
		valorPecaDois = sc.nextDouble();
		preco = quantiPecasUm * valorPecaUm + quantiPecasDois * valorPecaDois;
		
		System.out.printf("Valor a pagar: R$ %.2f%n", preco);
		
		
		sc.close();
		
	}

}
