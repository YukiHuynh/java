package design_patterns.builder.pizza_example;

public class MidiumCoke extends Pepsi {

	@Override
	public String name() {
		return "500 ml Coke";
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
