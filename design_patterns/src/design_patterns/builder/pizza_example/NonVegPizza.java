package design_patterns.builder.pizza_example;

public abstract class NonVegPizza extends Pizza{

	@Override
	public abstract float price();
	
	@Override
	public abstract String name();
	
	@Override
	public abstract String size();
	
}
