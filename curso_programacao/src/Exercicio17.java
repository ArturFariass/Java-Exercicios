import java.util.Scanner;

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.


public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int combustivel, somaA = 0, somaG = 0, somaD = 0;
		
		System.out.println("Digite o número do produto: ");
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
				System.out.println("Código inválido. Digite novamente: ");
			}
			System.out.println("Produto: ");
			combustivel = sc.nextInt();
		}
		System.out.println("Muito obrigado pela preferência!");
		System.out.printf("Álcool: %d%n", somaA);
		System.out.printf("Gasolinda: %d%n", somaG);
		System.out.printf("Diesel: %d%n", somaD);
		
		
		
		
		sc.close();
		
	}

}
