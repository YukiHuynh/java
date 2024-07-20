package datatype;

import java.util.Scanner;

public class Ex03SumDigits {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input an integer between 0 and 1000: ");
		int number = ip.nextInt();
		
		if (number < 0 || number > 1000) {
			System.out.println("Invalid input. Please enter an integer between 0 and 1000: ");
			//return;
		}
		
		int sum = 0;
		int temp = number; // 125
		
		while (temp > 0) {
			int digit = temp % 10;
			sum += digit;
			temp /= 10;
		}
		
		System.out.println("The sum of all digit in " + number + " is " + sum);
		ip.close();
	}
	
}
