package design_patterns.builder.order_example.director;

import design_patterns.builder.order_example.concretebuilder.FastFoodOrderBuilder;
import design_patterns.builder.order_example.product.order.Order;
import design_patterns.builder.order_example.product.type.BreadType;
import design_patterns.builder.order_example.product.type.OrderType;
import design_patterns.builder.order_example.product.type.SauceType;

public class Client {

	public static void main(String[] args) {
		Order order = new FastFoodOrderBuilder().orderType(OrderType.ON_SITE)
				.orderBread(BreadType.OMELETTE)
				.orderSauce(SauceType.SOY_SAUCE).build();
		System.out.println(order);
	}
	
}
