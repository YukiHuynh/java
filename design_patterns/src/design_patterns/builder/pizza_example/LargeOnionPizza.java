package design_patterns.builder.pizza_example;

public class LargeOnionPizza extends VegPizza{

	@Override
	public float price() {
		return 200.0f;
	}

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Extra-Large size";
	}

}
