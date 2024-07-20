package conditional;

import java.util.Scanner;

public class Ex31IncreasingOrDecreasing {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter 1st number ");
		while(!ip.hasNextInt()) {
			System.out.println("Invalid input.");
			ip.next();
		}
		int n1 = ip.nextInt();
		
		System.out.println("Enter 2nd number: ");
		while(!ip.hasNextInt()) {
			System.out.println("Invalid input.");
			ip.next();
		}
		int n2 = ip.nextInt();
		
		System.out.println("Enter 3rd number: ");
		while(!ip.hasNextInt()) {
			System.out.println("Invalid input.");
			ip.next();
		}
		int n3 = ip.nextInt();
		
		isIncrement(n1, n2, n3);
		ip.close();
	}
	
	private static void isIncrement(int n1,int n2, int n3) {
		if(n1 < n2 && n2 < n3) {
			System.out.println("Increament order.");
		} else if(n1 > n2 && n2 > n3) {
			System.out.println("Decreament order.");
		} else {
			System.out.println("Neither.");
		}
	}
}
