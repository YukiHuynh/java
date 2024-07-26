package abstraction;

public class Ex12Main {
	
	public static void main(String[] args) {
		GeometricShape triangle = new TriangleEx12(4, 5, 6);
		GeometricShape square = new Square(6);
		
		System.out.println("Triangle Area: " + triangle.area());
	    System.out.println("Triangle Perimeter: " + triangle.perimeter());

	    System.out.println("Square Area: " + square.area());
	    System.out.println("Square Perimeter: " + square.perimeter());
		
	}
	
}
