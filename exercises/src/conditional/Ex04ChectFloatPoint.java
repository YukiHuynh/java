package conditional;

import java.util.Scanner;

public class Ex04ChectFloatPoint {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a floating-point number: ");
		while(!ip.hasNextFloat()) {
			System.out.println("Invalid input. Please try again.");
		}
		float n = ip.nextFloat();
		
		if(n > 0) {
			if(n < 1) {
				System.out.println(n + " is small.");
			} else if (n > 1000000) {
				System.out.println(n + " is large.");
			} else {
				System.out.println(n + " is positive.");
			}
		} else if(n < 0) {
			if(Math.abs(n) < 1) {
				System.out.println(n + " is small.");
			} else if (Math.abs(n) > 1000000) {
				System.out.println(n + " is large.");
			} else {
				System.out.println(n + " is negative.");
			}
		} else {
			System.out.println("Zero");
		}
		ip.close();	
	}
	
}
