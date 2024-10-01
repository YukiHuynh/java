package design_patterns.builder.pizza_example;

public class ExtraLargeOnionPizza extends VegPizza{

	@Override
	public float price() {
		return 180.0f;
	}

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Large size";
	}

}
