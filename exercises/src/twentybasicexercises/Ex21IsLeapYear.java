package twentybasicexercises;

import java.time.Year;
import java.util.Scanner;

public class Ex21IsLeapYear {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a year: ");
		while(!ip.hasNextInt()) {
			System.out.println("Invalid input.");
			ip.nextLine();
		}
		int year = ip.nextInt();
		if(Year.isLeap(year)) {
			System.out.println(year + " là năm nhuận.");
		} else {
			System.out.println(year + " không phải năm nhuận.");
		}
		
		ip.close();
	}
	
}
