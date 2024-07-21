package bean;

public class SavingAccount extends BankAccount{
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(String accountNumber, String accountName, double balance) {
		super(accountNumber, accountName, balance);
	}
	
	@Override
	public void withdraw(double amount) {
		if(getBalance() - amount < 100) {
			System.out.println("Mimum balance of $100 required!");
		} else {
			super.withdraw(amount);
		}
	}
	
}