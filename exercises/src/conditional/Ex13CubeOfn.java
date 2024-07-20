package conditional;

import java.util.Scanner;

public class Ex13CubeOfn {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		while(!ip.hasNextInt()) {
			System.out.println("Invalid input. Please try again.");
			ip.next();
		}
		int n = ip.nextInt();
		
		for(int i = 0; i <= n; i++) {
			int cube = (int)Math.pow(i, 3);
			System.out.println("Number is " + i + ", cube of " + i + " is " + cube);
		}
		ip.close();
	}
	
}
