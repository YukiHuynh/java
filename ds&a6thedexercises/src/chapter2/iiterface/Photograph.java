package chapter2.iiterface;

public class Photograph implements Sellable {

	private String discript;
	private int price;
	private boolean color;
	
	public Photograph() {
	}
	
	
	public Photograph(String discript, int price, boolean color) {
		this.discript = discript;
		this.price = price;
		this.color = color;
	}


	@Override
	public String description() {
		return discript;
	}

	@Override
	public int listPrice() {
		return price;
	}

	@Override
	public int lowestPrice() {
		return price/2;
	}
	
	public boolean isColor() {
		return color;
	}
	
}
