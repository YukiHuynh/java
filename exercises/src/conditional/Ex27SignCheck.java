package conditional;

import java.util.Scanner;

public class Ex27SignCheck {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		
		while(!ip.hasNextInt()) {
			System.out.println("Invalid input. Please enter an integer: ");
			ip.next();
		}
		int n = ip.nextInt();
		
		if(n > 0) {
			System.out.println(n + " is positive.");
		} else if (n < 0) {
			System.out.println(n + " is negative.");
		} else {
			System.out.println("Zero");
		}
		ip.close();
	}
	
}
