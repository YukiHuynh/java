package design_patterns.builder.pizza_example;

import java.io.IOException;

public class BuilderDemo {

	public static void main(String[] args) throws IOException {
		
		OrderBuilder builder = new OrderBuilder();
		OrderedItems orderedItems = builder.preparePizza();
		
		orderedItems.showItems();
		System.out.println("\n");
		System.out.println("TotalCost: " + orderedItems.getCost());
		
	}
	
}
