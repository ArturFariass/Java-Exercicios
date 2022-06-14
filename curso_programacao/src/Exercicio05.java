import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.


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
