package conditional;

import java.util.Scanner;

public class Ex16IncrementLineTriangle {

	public static void main(String[] args) {
		int n;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number of lines: ");
		while(true) {
			if(ip.hasNextInt()) {
				n = ip.nextInt();
				if(n > 0) {
					break;
				} else {
					System.out.println("Please enter a positive number.");
				}
			} else {
				System.out.println("Invalid input, please try again,");
				ip.next();
			}
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		ip.close();
	}
	
}
