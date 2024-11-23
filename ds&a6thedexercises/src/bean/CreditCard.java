package bean;

public class CreditCard {

	private String customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;
	
	public CreditCard() {
	}

	public CreditCard(String customer, String bank, String account, int limit, double balance) {
		this.customer = customer;
		this.bank = bank;
		this.account = account;
		this.limit = limit;
		this.balance = balance;
	}
	
	public CreditCard(String customer, String bank, String account, int limit) {
		this(customer, bank, account, limit, 0.0);
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean charge(double price) {
		if(price + balance > limit) {
			return false;
		}
		balance += price;
		return true;
	}
	
	public void makePayment(double amount) {
		balance -= amount;
	}

	@Override
	public String toString() {
		return "CreditCard [customer=" + customer + ", bank=" + bank + ", account=" + account + ", limit=" + limit
				+ ", balance=" + balance + "]";
	}
	
}
