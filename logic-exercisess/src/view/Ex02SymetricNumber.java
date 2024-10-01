package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02SymetricNumber {

	public static void main(String[] args) {

		int n = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		while (true) {
			try {
				n = ip.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input");
				ip.nextLine();
			}
		}
		
		System.out.println("Is " + n + " Symetric? --> " + isSymetric(n));
		
		ip.close();
	}
	
	private static boolean isSymetric(int n) {
		int original = n;
		int reversed = 0;
		while(n != 0) {
			int digit = n % 10;
			reversed = reversed * 10 + digit;
			n /= 10;
		}
		
		return (reversed == original);
	}

}
