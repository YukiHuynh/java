package conditional;

import java.util.Scanner;

public class Ex17IncrementTriangle {

	public static void main(String[] args) {
		int n;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		
		while(true) {
			if(ip.hasNextInt()) {
				n = ip.nextInt();
				if(n > 0) {
					break;
				} else {
					System.out.println("Please enter a positive number: ");
				}
			} else {
				System.out.println("Invalid input. Please try again.");
				ip.next();
			}
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++){
				System.out.print(i);
			}
			System.out.println("");
		}
		ip.close();
	}
	
}
