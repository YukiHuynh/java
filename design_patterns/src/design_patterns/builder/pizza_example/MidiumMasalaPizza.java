package design_patterns.builder.pizza_example;

public class MidiumMasalaPizza extends VegPizza{

	@Override
	public float price() {
		return 120.0f;
	}

	@Override
	public String name() {
		return "Masala Pizza";
	}

	@Override
	public String size() {
		return "Midium size";
	}


}
