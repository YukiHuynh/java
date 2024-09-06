package control_flow;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a:");
		try{
			while (!ip.hasNextInt()) {
			System.out.println("Invalid input.");
			ip.nextLine();
			}
		} catch (ArithmeticException e) {
			System.out.println("Divided by zero operation cannot possible");
		}
		int a = ip.nextInt();
		
		System.out.println("Enter b:");
		while (!ip.hasNextInt()) {
			System.out.println("Invalid input.");
			ip.nextLine();
		}
		int b = ip.nextInt();
		System.out.println("Enter c:");
		while (!ip.hasNextInt()) {
			System.out.println("Invalid input.");
			ip.nextLine();
		}
		int c = ip.nextInt();
		
		int delta = 2;
		
		ip.close();
	}
	
}
