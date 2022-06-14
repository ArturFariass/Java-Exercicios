import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.


public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int horaC, horaT, duracao;
		
		System.out.println("Hora que começou: ");
		horaC = sc.nextInt();
		System.out.println("Hora que terminou: ");
		horaT = sc.nextInt();
		
		if (horaC > horaT) {
			duracao = horaC - horaT;
			System.out.printf("O jogo durou %d horas.%n", duracao);
		}
		else if (horaC < horaT) {
			duracao = horaT - horaC;
			System.out.printf("O jogo durou %d horas.%n", duracao);
		}
		else {
			System.out.println("O jogo durou 24 horas.");
		}
		
		
		sc.close();
		
	}

}
