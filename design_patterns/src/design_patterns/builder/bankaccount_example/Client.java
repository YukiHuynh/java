package design_patterns.builder.bankaccount_example;

public class Client {

	public static void main(String[] args) {
		BankAccount newAccount = new BankAccount.BankAccountBuilder("Nguyen", "0123456789")
					.withEmail("hvhn3295@gmail.com")
					.wantNewsletter(true).build();
		System.out.println(newAccount);
		
	}
	
}
