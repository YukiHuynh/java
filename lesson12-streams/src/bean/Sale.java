package bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Sale {

	private String product;
	private LocalDate date;
	private int amount;
	
	public Sale() {
	}

	public Sale(String product, LocalDate date, int amount) {
		this.product = product;
		this.date = date;
		this.amount = amount;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public static List<Sale> generateSales(int count) {
		List<Sale> sales = new ArrayList<>();
		Random rd = new Random();
		String[] products = {"Laptop", "Phone", "Tablet", "Headphones", "Monitor", 
				"Keyboard", "Mouse", "Printer", "Camera", "Speaker"};
		for(int i = 0; i < count; i++) {
			String product = products[rd.nextInt(products.length)];
			LocalDate date = LocalDate.of(2024, rd.nextInt(12) + 1, rd.nextInt(28) + 1);
			int amount = rd.nextInt(100) + 1;
			sales.add(new Sale(product, date, amount));
		}
		
		return sales;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, date, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		return amount == other.amount && Objects.equals(date, other.date) && Objects.equals(product, other.product);
	}

	@Override
	public String toString() {
		return "Sale [product=" + product + ", date=" + date + ", amount=" + amount + "]";
	}
	
}
