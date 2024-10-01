package design_patterns.builder.pizza_example;

public class MidiumOnionPizza extends VegPizza{

	@Override
	public float price() {
		return 120.0f;
	}

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Small size";
	}

}
