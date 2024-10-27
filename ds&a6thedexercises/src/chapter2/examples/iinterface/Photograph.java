package chapter2.examples.iinterface;

public class Photograph implements Sellable {
	
	private String descript;
	private int price;
	private boolean color;
	
	public Photograph() {
	}

	public Photograph(String descript, int price, boolean color) {
		this.descript = descript;
		this.price = price;
		this.color = color;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	@Override
	public String description() {
		return descript;
	}

	@Override
	public int listPrice() {
		return price;
	}

	@Override
	public int lowestPrice() {
		return price / 2;
	}
	
}
