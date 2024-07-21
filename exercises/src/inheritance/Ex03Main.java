package inheritance;

import bean.Rectangle;

public class Ex03Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3, 10);
		double area = rectangle.getArea();
		System.out.println("The area of the rectangle: " + area);
	}
	
}
