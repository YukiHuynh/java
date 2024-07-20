package utils;

import java.util.Scanner;

public class IOUtils {
	private Scanner ip = new Scanner(System.in);
	
	private IOUtils() {
	}
	
	public void input(int numb1, int numb2, int num3) {
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
		ip.close();
	}
}
