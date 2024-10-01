package design_patterns.builder.pizza_example;

public class MidiumPepsi extends Pepsi {

	@Override
	public String name() {
		return "500 ml Pepsi";
	}

	@Override
	public String size() {
		return "Midium size";
	}

	@Override
	public float price() {
		return 35.0f;
	}

}
