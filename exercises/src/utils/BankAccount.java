package utils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

	private double balance;
	private Lock lock;
	
	public BankAccount() {
		balance = 0.0;
		lock = new ReentrantLock();
	}

	public void deposit(double amount) {
		lock.lock();
		try {
			balance += amount;
			System.out.println("Deposit: " + amount);
			System.out.println("Balance after deposit: " + balance);
		} finally {
			lock.unlock();
		}
	}
	
	public void withdraw(double amount) {
		lock.lock();
		try {
			if(balance >= amount) {
				balance -= amount;
				System.out.println("Withdrawal: " + amount);
				System.out.println("Balance after withdrawal: " + balance);
			} else {
				System.out.println("Try to withdraw: " + amount);
				System.out.println("Insurfficient funds. Withdrawal cancelled.");
			}
		} finally {
			lock.unlock();
		}
	}
	
}
