package twentybasicexercises;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		int n = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n: ");
		while(true) {
			if(ip.hasNextInt()) {
				n = ip.nextInt();
				if(n > 0 && n < 1000) {
					break;
				} else {
					System.out.println("n must be between 0 and 1000.");
					ip.nextLine();
				}
			} else {
				System.out.println("Invalid input.");
				ip.nextLine();
			}
		}
		ip.close();
		
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		for(int num : array) {
			if(isPrime(num)) {
				System.out.print(num + " ");
			}
		}
	}
	
	private static boolean isPrime(int n) {
		if(n == 1) {return false;}
		if(n == 2 || n == 3) { return true; }
		if(n % 2 == 0 || n % 3 == 0) { return false; }
		for(int i = 5; i < Math.sqrt(n); i += 6) {
			if(n % i == 0 || n % i + 2 == 0) {
				return false;
			}
		}
		return true;
	}
	
}
