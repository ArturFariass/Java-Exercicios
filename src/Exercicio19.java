import java.util.Scanner;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).


public class Exercicio19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, valores, somaIn = 0, somaOut = 0;
		
		System.out.println("Quantos valores serão lidos: ");
		x = sc.nextInt();
		
		for (int i=0; i < x ;i++ ) {
			System.out.println("Valor: ");
			valores = sc.nextInt();
			if (valores >= 10 && valores <= 20) {
				somaIn += 1;
			}
			else {
				somaOut += 1;
			}
		}	
		System.out.println(somaIn + " In");
		System.out.println(somaOut + " Out");
		
		sc.close();
		
	}

}
