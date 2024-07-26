package abstraction;

public class Sphere extends Shape3D{

	private double radius;
	
	public Sphere() {
	}

	public Sphere(double radius) {
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
		return "Sphere [radius=" + radius + "]";
	}

	@Override
	public double calculateVolume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public double calculateSurfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
}
