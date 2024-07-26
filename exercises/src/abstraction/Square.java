package abstraction;

public class Square extends GeometricShape{
	
	private double side;
	
	public Square() {
	}

	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	@Override
	public double area() {
		return Math.pow(side, 2);
	}

	@Override
	public double perimeter() {
		return 4 * side;
	}
	
}
