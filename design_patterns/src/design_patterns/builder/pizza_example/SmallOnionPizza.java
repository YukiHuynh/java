package design_patterns.builder.pizza_example;

public class SmallOnionPizza extends VegPizza{

	@Override
	public float price() {
		return 150.0f;
	}

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Midium size";
	}

}
