package twentybasicexercises;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		int n = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n: ");
		while(true) {
			if(ip.hasNextInt()) {
				n = ip.nextInt();
				if(n > 0) {
					break;
				} else {
					System.out.println("n must be positive.");
				}
			} else {
				System.out.println("Invalid input.");
				ip.nextLine();
			}
		}
		
		int[] array = new int[n];
		System.out.println("Enter the elements of array: ");
		for(int i = 0; i < array.length; i++) {
			while(true) {
				if(ip.hasNextInt()) {
					array[i] = ip.nextInt();
					break;
				} else {
					System.out.println("Invalid Input");
					ip.nextLine();
				}
			}
		}
		
		System.out.println("The array's elements are: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int sum = 0;
		for(int element : array) {
			sum += element;
		}
		double avg = (double) sum / n;
		
		System.out.println("The average of " + n + " elements is: " + avg);
		ip.close();
	}
	
}
