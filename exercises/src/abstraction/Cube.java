package abstraction;

public class Cube extends Shape3D{
	
	private double sideLength;
	
	public Cube() {
	}

	public Cube(double sideLength) {
		super();
		this.sideLength = sideLength;
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public String toString() {
		return "Cube [sideLength=" + sideLength + "]";
	}

	@Override
	public double calculateVolume() {
		return Math.pow(sideLength, 3);
	}

	@Override
	public double calculateSurfaceArea() {
		return 6 * Math.pow(sideLength, 2);
	}
	
}
