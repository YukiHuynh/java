package conditional;

import java.util.Scanner;

public class Ex14MultiplicationTable {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		while(!ip.hasNextInt()) {
			System.out.println("Invalid input. Please try again.");
			ip.next();
		}
		int number = ip.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			int m = number * i;
			System.out.println(number + " * " + i + " = " + m);
		}
		ip.close();
	}
	
}
