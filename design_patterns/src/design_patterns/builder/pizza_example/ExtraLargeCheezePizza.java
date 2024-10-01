package design_patterns.builder.pizza_example;

public class ExtraLargeCheezePizza extends VegPizza{

	@Override
	public float price() {
		return 220.0f;
	}

	@Override
	public String name() {
		return "Cheeze Pizza";
	}

	@Override
	public String size() {
		return "Midium size";
	}
	
}
