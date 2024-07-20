package conditional;

import java.util.Scanner;

public class Ex07DaysInMonth {

	public static void main(String[] args) {
		int n;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		while(true) {
			if (ip.hasNextInt()) {
				n = ip.nextInt();
				if(n >= 1 && n <= 12) {
					break;
				} else {
					System.out.println("Input out of bound. Please try again.");
				}
			} else {
				System.out.println("Invalid input. Please try again.");
				ip.next();
			}
		}
		System.out.println(getDaysOfMonth(n));
		ip.close();
		
	}
	
	private static String getDaysOfMonth(int n) {
		String daysOfMonth = "";
		switch (n) {
		case 1: case 3: case 5: case 7: 
		case 8: case 10: case 12:
			daysOfMonth = "31";
			break;
		case 4: case 6: case 9: case 11:
			daysOfMonth = "30";
			break;
		case 2:
			daysOfMonth = "28";
		}
		return daysOfMonth;
	}	
	
}
