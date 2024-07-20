package recursive;

import java.util.Scanner;

public class Ex07GCDCalculator {

	public static void main(String[] args) {
		int num1, num2;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		while(true) {
			if(ip.hasNextInt()) {
				num1 = ip.nextInt();
				if(num1 > 0) {
					break;
				} else {
					System.out.println("Enter a positive integer: ");
				} 
			} else {
				System.out.println("Invalid Input: ");
				ip.next();
			}
		}
		
		System.out.println("Enter 2nd number: ");
		while(true) {
			if(ip.hasNextInt()) {
				num2 = ip.nextInt();
				if(num2 > 0) {
					break;
				} else {
					System.out.println("Enter a positive integer: ");
				} 
			} else {
				System.out.println("Invalid Input: ");
				ip.next();
			}
		}
		
		int gcd = calculateGCD(num1, num2);
		System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
		ip.close();
	}
	
	public static int calculateGCD(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}
		int remainder = num1 % num2;
		return calculateGCD(num2, remainder);
	}
	
}
