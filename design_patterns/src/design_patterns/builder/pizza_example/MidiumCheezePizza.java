package design_patterns.builder.pizza_example;

public class MidiumCheezePizza extends VegPizza{

	@Override
	public float price() {
		return 300.0f;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Extra-Large size";
	}
	
}
