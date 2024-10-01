package design_patterns.builder.order_example.product.order;

import design_patterns.builder.order_example.product.type.BreadType;
import design_patterns.builder.order_example.product.type.OrderType;
import design_patterns.builder.order_example.product.type.SauceType;
import design_patterns.builder.order_example.product.type.VegetableType;

public class Order {

	private OrderType orderType;
	private BreadType breadType;
	private SauceType sauceType;
	private VegetableType vegetableType;
	
	public Order(OrderType orderType, BreadType breadType, SauceType sauceType, VegetableType vegetableType) {
		this.orderType = orderType;
		this.breadType = breadType;
		this.sauceType = sauceType;
		this.vegetableType = vegetableType;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public BreadType getBreadType() {
		return breadType;
	}

	public SauceType getSauceType() {
		return sauceType;
	}

	public VegetableType getVegetableType() {
		return vegetableType;
	}

	@Override
	public String toString() {
		return "Order [orderType=" + orderType + ", breadType=" + breadType + ", sauceType=" + sauceType
				+ ", vegetableType=" + vegetableType + "]";
	}
	
}
