package conditional;

import java.util.Scanner;

public class Ex01PositiveOrNegative {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input a number: ");
		while(!ip.hasNextInt()) {
			System.out.println("Invalid input. please try again.");
			ip.next();
		}
		int n = ip.nextInt();
		if(n > 0) {
			System.out.println(n + " is a positive integer.");
		} else {
			System.out.println(n + " is a negative integer.");
		}
		ip.close();
	}
	
}
