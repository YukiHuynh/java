package conditional;

import java.util.Scanner;

public class Ex06TestTwoFloatingPoint {
		
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter 1st floating-point number: ");
		while(!ip.hasNextFloat()) {
			System.out.println("Invalid input. Please try again.");
			ip.next();
		}
		float a = ip.nextFloat();
		
		System.out.println("Enter 2nd floating-point number: ");
		while(!ip.hasNextFloat()) {
			System.out.println("Invalid input. Please try again.");
			ip.next();
		}
		float b = ip.nextFloat();
		
		System.out.println("1st floating-point number is: " + a);
		System.out.println("2nd floating-point number is: " + b);
		
		a = Math.round(a * 1000);
		a /= 1000;
		
		b = Math.round(b * 1000);
		b /= 1000;
		
		if(a == b) {
			System.out.println("They are the same up to three decimal place.");
		} else {
			System.out.println("They are different.");
		}
		ip.close();
	}
	
}
