package design_patterns.builder.order_example.concretebuilder;

import design_patterns.builder.order_example.builder.OrderBuilder;
import design_patterns.builder.order_example.product.order.Order;
import design_patterns.builder.order_example.product.type.BreadType;
import design_patterns.builder.order_example.product.type.OrderType;
import design_patterns.builder.order_example.product.type.SauceType;
import design_patterns.builder.order_example.product.type.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder{

	private OrderType orderType;
	private BreadType breadType;
	private SauceType sauceType;
	private VegetableType vegetableType;
	
	@Override
	public OrderBuilder orderType(OrderType orderType) {
		this.orderType = orderType;
		return this;
	}
	
	@Override
	public OrderBuilder orderBread(BreadType breadType) {
		this.breadType = breadType;
		return this;
	}
	
	@Override
	public OrderBuilder orderSauce(SauceType sauceType) {
		this.sauceType = sauceType;
		return this;
	}
	
	@Override
	public OrderBuilder orderVegetable(VegetableType vegetableType) {
		this.vegetableType = vegetableType;
		return this;
	}
	
	@Override
	public Order build() {
		return new Order(orderType, breadType, sauceType, vegetableType);
	}
	
	
	
}
