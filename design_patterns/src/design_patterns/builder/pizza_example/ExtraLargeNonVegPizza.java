package design_patterns.builder.pizza_example;

public class ExtraLargeNonVegPizza extends NonVegPizza{

	@Override
	public float price() {
		return 250.0f;
	}

	@Override
	public String name() {
		return "Non-Veg Pizza";
	}

	@Override
	public String size() {
		return "Extra-Large size";
	}

}