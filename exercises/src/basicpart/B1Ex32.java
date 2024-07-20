package basicpart;

import java.util.Scanner;

public class B1Ex32 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input first number: " );
		int num1 = ip.nextInt();
		System.out.println("Input second number: ");
		int num2 = ip.nextInt();
		ip.close();
		
		if(num1 == num2) {
			System.out.println(num1 + " == " + num2);
		} 
		if (num1 != num2) {
			System.out.println(num1 + " != " + num2 );
		}
		if (num1 > num2) {
			System.out.println(num1 + " > " + num2 );
		}
		if (num1 >= num2) {
			System.out.println(num1 + " >= " + num2 );
		}
		if (num1 < num2) {
			System.out.println(num1 + " < " + num2 );
		}
		if (num1 <= num2) {
			System.out.println(num1 + " <= " + num2 );
		}
		
		
	}
	
}
