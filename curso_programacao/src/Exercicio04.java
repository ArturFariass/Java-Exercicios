import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
//decimais.
public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario, horasTrab;
		double GanhoHora, salario;
		
		funcionario = sc.nextInt();
		horasTrab = sc.nextInt();
		GanhoHora = sc.nextDouble();
		
		salario = horasTrab * GanhoHora;
		
		System.out.println("Number = " + funcionario);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		
		sc.close();
		
		
	}

}
