package view;

import java.util.Scanner;

public class Ex01ReverseNumber {

	public static void main(String[] args) {
		int n = 0;
		try (Scanner ip = new Scanner(System.in)) {
			System.out.println("Enter a number: ");
			while(true) {
				if(ip.hasNextInt()) {
					n = ip.nextInt();
					break;
				} else {
					System.out.println("Invalid Input!");
					ip.nextLine();
				}
			}
		}
		
		int reversedNumber = reverse(n);
		System.out.println("Reversed number: " + reversedNumber);
	
	}
	
	private static int reverse(int n) {
		int reversed = 0;
		while(n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /= 10;
		}
		return reversed;
		
	}
	
}
