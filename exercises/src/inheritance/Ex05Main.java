package inheritance;

import bean.BankAccount;
import bean.SavingAccount;

public class Ex05Main {

	public static void main(String[] args) {
		System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
		
		BankAccount bA1234 = new BankAccount("BA1234", "Nguyen", 500);
		System.out.println("Deposit $1000 into account BA1234:");
		bA1234.deposit(1000);
		System.out.println("New balance after depositing $1000: $" + bA1234.getBalance());
		System.out.println("Withdraw $600 from account BA1234:");
		bA1234.withdraw(600);
		System.out.println("New balance after withdrawing $600: $" + bA1234.getBalance());
		
		System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of $450:");
		SavingAccount sA1234 = new SavingAccount("SA1234", "Nguyen", 450);
		sA1234.withdraw(300);
		System.out.println("Balance after trying to withdraw $300: $" + sA1234.getBalance());

        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of $300:");
        SavingAccount sA1000 = new SavingAccount("SA1000", "Hung", 300);

        System.out.println("Try to withdraw $250 from SA1000!");
        sA1000.withdraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + sA1000.getBalance());
	}
	
}
