import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
//come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme exemplo.


public class Exercicio24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("N�mero: ");
		numero = sc.nextInt();
		
		for (int i=1; i <= numero; i++) {
			System.out.printf("%d ", i);
			System.out.printf("%d ", i*i);
			System.out.printf("%d%n", i*i*i);
			
		}
		
		
		
		sc.close();
	}

}
