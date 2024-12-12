package chapter02.iiterface;

public class BoxedItem2 implements Insurable {

	private String discript;
	private int price;
	private int weight;
	private boolean haz;
	private int height = 0;
	private int width = 0;
	private int depth = 0;
	
	public BoxedItem2() {
	}

	public BoxedItem2(String discript, int price, int weight, boolean haz) {
		this.discript = discript;
		this.price = price;
		this.weight = weight;
		this.haz = haz;
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
		return price / 2;
	}

	@Override
	public int weight() {
		return weight;
	}

	@Override
	public boolean isHazadous() {
		return haz;
	}
	
	public int insuredValue() {
		return price * 2;
	}
	
	public void setBox(int h, int w, int d) {
		this.height = h;
		this.width = w;
		this.depth = d;
	}

	

	

	
	
	
	
}
