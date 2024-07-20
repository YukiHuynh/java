package conditional;

import java.util.Scanner;

public class Ex15SumOfOddNumber {

	public static void main(String[] args) {
		int count;
		int sum = 0;
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		while(!ip.hasNextInt()) {
			System.out.println("Invalid input. Please try again.");
			ip.next();
		}
		count = ip.nextInt();
		
		System.out.println("The odd numbers are: ");
		int foundOddNumber = 0;
		int number = 1;
		
		while (foundOddNumber < count) {
			if(isOddNumber(number)) {
				System.out.println(number);
				sum += number;
				foundOddNumber++;
			}
			number++;
		}
		
		System.out.println("Sum of " + number + " odd numbers are: " + sum);
		ip.close();
	}
	
	private static boolean isOddNumber(int n) {
		return n % 2 != 0;
	}
	
}
