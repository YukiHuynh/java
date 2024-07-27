package thread;

import utils.BankAccount;

public class Ex07BankAccount {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		Thread depositThread1 = new Thread(() -> account.deposit(1000));
		Thread depositThread2 = new Thread(() -> account.deposit(300));
		
		Thread withdrawalThread1 = new Thread(() -> account.withdraw(1000));
		Thread withdrawalThread2 = new Thread(() -> account.withdraw(1000));
		
		depositThread1.start();
		depositThread2.start();
		withdrawalThread1.start();
		withdrawalThread2.start();
		
	}
	
}
