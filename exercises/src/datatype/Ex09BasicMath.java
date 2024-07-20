package datatype;

import java.util.Scanner;

public class Ex09BasicMath {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input 1st integer: ");
		while (!ip.hasNextInt()) {
			System.out.println("Invalid input. Please enter an integer: ");
			ip.next();
		}
		int num1 = ip.nextInt();
		
		System.out.println("Input 2nd integer: ");
		while (!ip.hasNextInt()) {
			System.out.println("Invalid input. Please enter an integer: ");
			ip.next();
		}
		int num2 = ip.nextInt();
		
		System.out.println("First integer is: " + num1);
		System.out.println("Second integer is: " + num2);
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		int sum = num1 + num2;
		int diff = num1 - num2;
		int prod = num1 * num2;
		int avg = sum / 2;
		int dist = max - min;
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);
		System.out.println("Product: " + prod);
		System.out.println("Average: " + avg);
		System.out.println("Distance: " + dist);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		ip.close();
	}
	
}
