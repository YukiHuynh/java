package conditional;

import java.util.Scanner;

public class Ex02QuadraticEquations {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a: ");
		while (!ip.hasNextInt()) {
			System.out.println("Invalid number. Please try again.");
			ip.next();
		}
		double a = ip.nextDouble();
		
		System.out.println("Enter b: ");
		while (!ip.hasNextInt()) {
			System.out.println("Invalid number. Please try again.");
			ip.next();
		}
		double b = ip.nextDouble();
		
		System.out.println("Enter c: ");
		while (!ip.hasNextInt()) {
			System.out.println("Invalid number. Please try again.");
			ip.next();
		}
		double c = ip.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a *c;
		
		if(delta > 0) {
			double root1 = (-b + Math.sqrt(delta)) / 2*a;
			double root2 = (-b - Math.sqrt(delta)) / 2*a;
			System.out.println("The equation has two distinct root: " + root1 + " and " + root2);
		} else if (delta == 0) {
			double root = -b / (2 * a);
			System.out.println("The equation has one double root: " + root);
		} else {
			System.out.println("The equation has no real roots.");
		}
		ip.close();
		
	}
	
}
