import java.util.Scanner;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).



public class Exercicio16 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		x = 1;
		y = 1;
		
		while (x != 0 && y != 0) {
			System.out.println("Valor de X: ");
			x = sc.nextInt();
			System.out.println("Valor de Y");
			y = sc.nextInt();
			
			if (x > 0 && y > 0) {
				System.out.println("Q1");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Q4");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Q2");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Q3");
			}
			else {
				
			}
		}	
		
		
		
		
		sc.close();
	}

}
