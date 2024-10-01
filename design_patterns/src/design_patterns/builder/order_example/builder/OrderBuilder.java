package design_patterns.builder.order_example.builder;

import design_patterns.builder.order_example.product.order.Order;
import design_patterns.builder.order_example.product.type.BreadType;
import design_patterns.builder.order_example.product.type.OrderType;
import design_patterns.builder.order_example.product.type.SauceType;
import design_patterns.builder.order_example.product.type.VegetableType;

public interface OrderBuilder {

	OrderBuilder orderType(OrderType orderType);
	OrderBuilder orderBread(BreadType breadType);
	OrderBuilder orderSauce(SauceType sauceType);
	OrderBuilder orderVegetable(VegetableType vegetableType);
	Order build();
	
}
