package twentybasicexercises;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		int n = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n: ");
		while(true) {
			if(ip.hasNextInt()) {
				n = ip.nextInt();
				break;
			} else {
				System.out.println("Invalid Input.");
				ip.nextLine();
			}
		}
		ip.close();
		
		int[] array = new int[20];
		for(int i = 0; i < 20; i++) {
			array[i] = i + 1;
		}
		
		int result = 0;
		for(int num : array) {
			result = num * n;
			System.out.print(num + " * " + n + " = " + result);
		}
	}
	
}
