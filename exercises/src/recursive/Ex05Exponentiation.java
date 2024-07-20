package recursive;

import java.util.Scanner;

public class Ex05Exponentiation {

	public static void main(String[] args) {
		double base;
		int exponent;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter base: ");
		while(!ip.hasNextDouble()) {
			System.out.println("Invalid input");
			ip.next();
		}
		base = ip.nextDouble();
		
		System.out.println("Enter the exponent: ");
		while(true) {
			if(ip.hasNextInt()) {
				exponent = ip.nextInt();
				if(exponent > 0) {
					break;
				} else {
					System.out.println("Please enter a positive integer:");
				}
			} else {
				System.out.println("Invalid input");
				ip.next();
			}
		}
		double result = calculateExponentiation(base, exponent);
		System.out.println(base + " raise to the power of " + exponent + " is: " + result);
		ip.close();
	}
	
	public static double calculateExponentiation(double base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		return base * calculateExponentiation(base, exponent - 1);
	}
	
}
