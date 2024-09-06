package twentybasicexercises;

import java.util.Random;
import java.util.Scanner;

public class Ex22PrintArraysElements {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter the number of the array: ");
			while(!ip.hasNextInt()) {
				System.out.println("Invalid input");
				ip.next();
			}
			n = ip.nextInt();
		} while(n <= 0);
		
		int[] array = new int[n];
		
		Random rd = new Random();
		for(int i = 0; i < n; i++) {
			array[i] = rd.nextInt(100);
			System.out.println("Element at index " + i + " is: " + array[i]);
		}
			
		ip.close();
	}
	
}
