import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
//come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.


public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int horaC, horaT, duracao;
		
		System.out.println("Hora que come�ou: ");
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
