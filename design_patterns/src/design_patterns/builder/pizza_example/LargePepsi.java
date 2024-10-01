package design_patterns.builder.pizza_example;

public class LargePepsi extends Pepsi {

	@Override
	public String name() {
		return "750 ml Pepsi";
	}

	@Override
	public String size() {
		return "Large size";
	}

	@Override
	public float price() {
		return 50.0f;
	}

}
