import java.util.Scanner;

//Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".


public class Exercicio21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int pares, valor1, valor2;
		double divisao;
		
		System.out.println("N�mero de pares: ");
		pares = sc.nextInt();
		
		for (int i=0; i < pares; i++) {
			System.out.println("Primeiro valor: ");
			valor1 = sc.nextInt();
			System.out.println("Segundo valor: ");
			valor2 = sc.nextInt();
			
			if (valor2 != 0) {
				divisao = (double) valor1 / valor2;
				System.out.println(divisao);
			}
			else {
				System.out.println("Divis�o imposs�vel.");
			}
		}
		
		
		
		
		
		sc.close();
		
	}

}
