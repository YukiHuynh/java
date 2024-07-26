package abstraction;

public class Triangle extends Shape{

	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}


	public double getLength() {
		return side1;
	}

	public void setLength(double length) {
		this.side1 = length;
	}

	public double getWidth() {
		return side2;
	}

	public void setWidth(double width) {
		this.side2 = width;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	@Override
	public String toString() {
		return "RectangleEx02 [length=" + side1 + ", width=" + side2 + "]";
	}

	@Override
	public double calculatePerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public double calculateArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
}
