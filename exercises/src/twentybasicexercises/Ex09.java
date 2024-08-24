package twentybasicexercises;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		int n = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n: ");
		while(true) {
			if(ip.hasNextInt()) {
				n = ip.nextInt();
				if(n >= 0 || n <= 20) {
					break;
				} else {
					System.out.println("n must be smaller than or equal to 20.");
				}
			} else {
				System.out.println("Invalid input.");
				ip.nextLine();
			}
		}
		ip.close();
		
		int result = fibonacci(n);
		System.out.println("Fibonacci number of n = " + n + " is: " + result);
		
	}
	
	private static int fibonacci(int n) {
		
		if(n == 0 || n == 1) { return 1; }
		int a = 1, b = 1, c = 1;
		for(int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
		
	}
	
}
