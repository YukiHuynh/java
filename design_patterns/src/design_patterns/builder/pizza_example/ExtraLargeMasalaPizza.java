package design_patterns.builder.pizza_example;

public class ExtraLargeMasalaPizza extends VegPizza{

	@Override
	public float price() {
		return 150.0f;
	}

	@Override
	public String name() {
		return "Masala Pizza";
	}

	@Override
	public String size() {
		return "Large size";
	}


}
