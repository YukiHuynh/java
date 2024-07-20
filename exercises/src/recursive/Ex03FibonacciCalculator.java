package recursive;

import java.util.Scanner;

public class Ex03FibonacciCalculator {

	public static void main(String[] args) {
		int position;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		while(true) {
			if(ip.hasNextInt()) {
				position = ip.nextInt();
				if(position >= 0) {
					break;
				} else {
					System.out.println("Enter a positive number: ");
				}
			} else {
				System.out.println("Invalid input.");
				ip.next();
			}
		}
		
		int fibonacciNumber = calculateFibonacci(position);
		System.out.println("The Fibonacci numner at position " + position + " is " + fibonacciNumber);
		ip.close();
	}
	
	public static int calculateFibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} 
		return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
	}
	
}
