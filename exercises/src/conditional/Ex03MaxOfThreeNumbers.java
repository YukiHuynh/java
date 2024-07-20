package conditional;

import java.util.Scanner;

public class Ex03MaxOfThreeNumbers {

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
		
		if (a > b) {
			if (a > c) {
				System.out.println("Max is " + (int)a);
			}
		}
		
		if (b > a) {
			if (b > c) {
				System.out.println("Max is " + (int)b);
			}
		}
		
		if (c > a) {
			if (c > b) {
				System.out.println("Max is " + (int)c);
			}
		}
		ip.close();
		
	}
	
}
