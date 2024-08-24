package twentybasicexercises;

import java.util.Scanner;

public class Ex12And13 {

	public static void main(String[] args) {
		
		int n;
		Scanner ip = new Scanner(System.in);
		
		do {
			System.out.println("Enter a positive integer n: ");
			while(!ip.hasNextInt()) {
				System.out.println("Invalid input.");
				ip.next();
			}
			n = ip.nextInt();
		} while (n <= 0);
		
		int[] array = new int[n];
		System.out.println("Enter the element of the array: ");
		for(int i = 0; i < n; i++) {
			while(!ip.hasNextInt()) {
				System.out.println("Invalid input");
				ip.next();
			}
			array[i] = ip.nextInt();
		}
		
		int max = array[0];
		int min = array[0];
		System.out.println("Array elements are: ");
		for(int element : array) {
			System.out.print(element + " ");
			if(element > max)  max = element; 
			if(element < min)  min = element; 
		}
		System.out.println("\nThe element with the highest value is: " + max);
		System.out.println("\nThe element with the lowest value is: " + min);
		
		ip.close();
	}
		
}
