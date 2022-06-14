import java.util.Scanner;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.


public class Exercicio24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Número: ");
		numero = sc.nextInt();
		
		for (int i=1; i <= numero; i++) {
			System.out.printf("%d ", i);
			System.out.printf("%d ", i*i);
			System.out.printf("%d%n", i*i*i);
			
		}
		
		
		
		sc.close();
	}

}
