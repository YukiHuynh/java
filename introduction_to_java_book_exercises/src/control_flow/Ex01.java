package control_flow;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a:");
		while (!ip.hasNextInt()) {
			System.out.println("Invalid input.");
			ip.nextLine();
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
		
		if(a == b && b == c) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
		ip.close();
	}

}
