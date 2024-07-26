package abstraction;

public class SavingAccount extends BankAccount{

	public SavingAccount() {
	}

	public SavingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
	}
	
}
