//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
//ordem crescente ou decrescente.
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Primeiro n�mero: ");
		n1 = sc.nextInt();
		System.out.println("Segundo n�mero: ");
		n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("S�o m�ltiplos.");
		}
		else {
			System.out.println("N�o s�o m�ltiplos.");
		}
		
		
		
		sc.close();
		
	}

}
