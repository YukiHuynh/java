package datatype;

import java.util.Scanner;

public class Ex10ToSequence {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("Enter a positive integer: ");
			
			if(ip.hasNextInt()) {
				n = ip.nextInt();
				
				if(n > 0) {
					break;
				} else {
					System.out.println("Invalid input.Please enter a positive integer: ");
				}
				
			} else {
				System.out.println("Invalid input. Please enter an integer: ");
			}
		}
		
		int[] digits = new int[6];
		for(int i = 0; i < 6; i++) {
			digits[5 - i] = n % 10;
			n /= 10;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(digits[i] + " ");
		}
		ip.close();
	}
	
}
