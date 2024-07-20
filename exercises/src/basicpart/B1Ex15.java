package basicpart;

import java.util.Scanner;

public class B1Ex15 {

	public static void main(String[] args) {
		int a, b, temp;
		Scanner ip = new Scanner(System.in);
		System.out.println("Input a: ");
		a = ip.nextInt();
		System.out.println("Input b: ");
		b = ip.nextInt();
		ip.close();
		System.out.println("Before swapping a = " + a + ", b = " + b);
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping a = " + a + ", b = " + b);
	}
	
}
