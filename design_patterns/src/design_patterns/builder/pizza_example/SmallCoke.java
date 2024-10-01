package design_patterns.builder.pizza_example;

public class SmallCoke extends Coke{

	@Override
	public String name() {
		return "300 ml Coke";
	}

	@Override
	public String size() {
		return "Small size";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}
