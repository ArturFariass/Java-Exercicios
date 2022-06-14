import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Exercicio29 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", account.getNumber(), account.getHolder(), account.getBalance());
		
		System.out.println();
		System.out.print("Enter deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", account.getNumber(), account.getHolder(), account.getBalance());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", account.getNumber(), account.getHolder(), account.getBalance());
		
		
		
		sc.close();
		
	}

}
