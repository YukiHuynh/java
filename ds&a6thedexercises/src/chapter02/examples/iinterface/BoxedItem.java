package chapter02.examples.iinterface;

public class BoxedItem implements Sellable, Transportable {

	private String descript;
	private int price;
	private int weight;
	private boolean haz;
	private int height = 0;
	private int width = 0;
	private int dept = 0;
	
	public BoxedItem() {
	}

	public BoxedItem(String descript, int price, int weight, boolean haz, int height, int width, int dept) {
		this.descript = descript;
		this.price = price;
		this.weight = weight;
		this.haz = haz;
		this.height = height;
		this.width = width;
		this.dept = dept;
	}
	
	public BoxedItem(String desc, int p, int w, boolean h) {
		this.descript = desc;
		this.price = p;
		this.weight = w;
		this.haz = h;
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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHaz() {
		return haz;
	}

	public void setHaz(boolean haz) {
		this.haz = haz;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	@Override
	public int weight() {
		return weight;
	}

	@Override
	public boolean isHazardous() {
		return haz;
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
	
	public int insuredValue() {
		return price * 2;
	}
	
	public void setBox(int h, int w, int d) {
		height = h;
		width = w;
		dept = d;
	}

	@Override
	public String toString() {
		return "BoxedItem [descript=" + descript + ", price=" + price + ", weight=" + weight + ", haz=" + haz
				+ ", height=" + height + ", width=" + width + ", dept=" + dept + "]";
	}
	
}
