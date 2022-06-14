//Ler um número inteiro N e calcular todos os seus divisores
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Número: ");
		numero = sc.nextInt();
		
		for (int i = numero; i != 0; i--) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}
			
		sc.close();
	}

}
