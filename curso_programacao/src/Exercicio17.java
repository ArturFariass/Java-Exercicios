import java.util.Scanner;

//Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
//um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
//que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme exemplo.


public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int combustivel, somaA = 0, somaG = 0, somaD = 0;
		
		System.out.println("Digite o n�mero do produto: ");
		combustivel = sc.nextInt();
		
		while (combustivel != 4) {
			
			if (combustivel == 1) {
				somaA += 1;
			}
			else if (combustivel == 2) {
				somaG += 1;
			}
			else if (combustivel == 3) {
				somaD += 1;
			}
			else {
				System.out.println("C�digo inv�lido. Digite novamente: ");
			}
			System.out.println("Produto: ");
			combustivel = sc.nextInt();
		}
		System.out.println("Muito obrigado pela prefer�ncia!");
		System.out.printf("�lcool: %d%n", somaA);
		System.out.printf("Gasolinda: %d%n", somaG);
		System.out.printf("Diesel: %d%n", somaD);
		
		
		
		
		sc.close();
		
	}

}
