//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.


import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1, valor2, resultado;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		resultado = valor1 + valor2;
		
		System.out.println("A soma é: " + resultado);

		sc.close();
	}

}
