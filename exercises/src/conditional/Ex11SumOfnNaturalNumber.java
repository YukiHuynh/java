package conditional;

import java.util.Scanner;

public class Ex11SumOfnNaturalNumber {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n;
		int sum = 0;
		double avg;
		
		while(true) {
			if(ip.hasNextInt()) {
				n = ip.nextInt();
				if (n > 0) {
					break;
				} else {
					System.out.println("Invalid input. Please try again.");
					ip.next();
				}
			}
		}
	
		for(int i = 0; i < n; i++) {
			sum += i;
		}
		avg = sum / n;
		System.out.println("The sum of " + n + " natural number is: " + sum);
		System.out.println("the average of " + n + " natural number is: " + avg);
		ip.close();
	}
	
}
