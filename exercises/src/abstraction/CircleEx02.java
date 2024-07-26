package abstraction;

public class CircleEx02 extends Shape{

	private double radius;
	
	public CircleEx02() {
	}

	public CircleEx02(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "CircleEx01 [radius=" + radius + "]";
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
}
