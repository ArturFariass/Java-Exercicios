import java.util.Locale;
import java.util.Scanner;

//Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. Em seguida, calcule e
//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

//Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, pois a faixa de
//sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa �
//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//duas casas decimais.

public class Exercicio14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double imposto;
		
		System.out.println("Sal�rio: ");
		double salario = sc.nextDouble();
		
		if (salario <= 2000) {
			System.out.println("Isento.");
		}
		else if (salario > 2000 && salario <= 3000) {
			imposto = (salario - 2000) * 0.08;
			System.out.printf("O imposto � de R$ %.2f%n", imposto);
		}
		else if (salario > 3000 && salario <= 4500) {
			salario = (salario - 2000);
				if (salario > 1000) {
					
				}
		}
		
		
		sc.close();
	}

}
