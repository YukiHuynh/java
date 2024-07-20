package conditional;

import java.util.Scanner;

public class Ex29CountNumberOfDigits {

	public static void main(String[] args) {
		long n;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		while(true) {
			if(ip.hasNextLong()) {
				n = ip.nextLong();
				if(n > 0 && n < 10000000000L) {
					int digitCount = countDigit(n);
					System.out.println(n + " has " + digitCount + " digits.");
				} else if (n >= 10000000000L){
					System.out.println("Number have to be less than ten billion.");
				} else {
					System.out.println("Please enter a positive number: ");
				}
			} else {
				System.out.println("Invalid input. Please try again.");
				ip.next();
			}
			ip.close();
		}
		
	}
	
	private static int countDigit(long n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}
	
}
