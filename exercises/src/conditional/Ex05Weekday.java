package conditional;

import java.util.Scanner;

public class Ex05Weekday {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		System.out.println("Please enter an number between 1 and 7: ");
		while(true) {
			if(ip.hasNextInt()) {
				n = ip.nextInt();
				if(n >= 1 && n <= 7) {
					break;
				} else {
					System.out.println("Out of bound. Please enter an number between 1 and 7");
				}
			} else {
				System.out.println("Invalid input. Please try again.");
				ip.next();
			}
		}
		
		System.out.println(getDayName(n));
		ip.close();
		
	}
	
	private static String getDayName(int n) {
		String dayName ="";
		switch(n) {
		case 1: dayName = "Monday";
		break;
		case 2: dayName = "Tuesday";
		break;
		case 3: dayName = "Wednesday";
		break;
		case 4: dayName = "Thursday";
		break;
		case 5: dayName = "Friday";
		break;
		case 6: dayName = "Saturday";
		break;
		case 7: dayName = "Sunday";
		}
		return dayName;
	}
	
}
