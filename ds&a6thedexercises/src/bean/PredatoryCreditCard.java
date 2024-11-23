package bean;

public class PredatoryCreditCard extends CreditCard {
	
	private double apr;
	
	public PredatoryCreditCard() {
	}

	public PredatoryCreditCard(String customer, String bank, String account, int limit, double balance, double rate) {
		super(customer, bank, account, limit, balance);
		this.apr = rate;
	}
	
	public void processMonth() {
		if(balance > 0) {
			double monthlyFactor = Math.pow(1 + apr, 1.0/12);
			balance *= monthlyFactor;
		}
	}
	
	@Override
	public boolean charge(double price) {
		boolean isSuccess = super.charge(price);
		if(!isSuccess) {
			balance += 5;
		}
		return isSuccess;
	}

}
