package basicpart;

import java.util.Scanner;

public class B1Ex07 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input number: ");
		int n = ip.nextInt();
		ip.close();
		
		for (int i = 1; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}
	
}
