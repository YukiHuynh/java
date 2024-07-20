package conditional;

import java.util.Scanner;

public class Ex09LeapYearCheck {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = ip.nextInt();
		
		if(isLeapYear(year)) {
			System.out.println(year + " is a leap year.");
		} else {
				System.out.println(year + " is not a leap year.");
		}
		ip.close();
	}
	
	private static boolean isLeapYear(int year) {
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			return true;
		} return false;
	}
	
}
