import java.util.Locale;
import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.


public class Exercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double preco;
		
		System.out.println("Qual item você deseja? ");
		int item = sc.nextInt();
		System.out.println("E a quantidade? ");
		int quantidade = sc.nextInt();
		
		if (item == 1) {
			preco = 4 * quantidade;
			System.out.printf("O preço é R$ %.2f%n", preco);
		}
		else if (item == 2) {
			preco = 4.5 * quantidade;
			System.out.printf("O preço é R$ %.2f%n", preco);
		}
		else if (item == 3) {
			preco = 5 * quantidade;
			System.out.printf("O preço é R$ %.2f%n", preco);
		}
		else if (item == 4) {
			preco = 2 * quantidade;
			System.out.printf("O preço é R$ %.2f%n", preco);
		}
		else if (item == 5) {
			preco = 1.5 * quantidade;
			System.out.printf("O preço é R$ %.2f%n", preco);
		}
		else {
			System.out.println("Esse item não consta no cardápio.");
		}
		
		
		sc.close();
	}

}
