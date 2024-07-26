package abstraction;

public class Ex02Main {

	public static void main(String[] args) {
		double r = 4.0;
		CircleEx02 circle= new CircleEx02(r);
		
		double tS1= 3.0, tS2 = 4.0, tS3 = 5.0;
		Triangle triangle = new Triangle(tS1, tS2, tS3);
		
		System.out.println("Radius of the Circle: " + r);
        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());

        System.out.println("\nSides of the Triangle are: " + tS1 + ',' + tS2 + ',' + tS3);
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
	}
	
}
