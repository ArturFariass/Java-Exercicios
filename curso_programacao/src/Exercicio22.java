import java.util.Scanner;

//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.


public class Exercicio22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int fatorial, repeticoes = 1;
		
		System.out.println("Fatorial de: ");
		fatorial = sc.nextInt();
		
		for (int i = fatorial; i != 0; i--) {
			repeticoes *= i;
		}
		
		if (fatorial == 0) {
			System.out.println("1");
		}
		else {
			System.out.println(repeticoes);
		}
		
		
		
		
		sc.close();
	}

}
