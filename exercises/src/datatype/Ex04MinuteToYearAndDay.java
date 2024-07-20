package datatype;

import java.util.Scanner;

public class Ex04MinuteToYearAndDay {

	public static void main(String[] args) {
		double minuteInYear = 60 * 24 * 365;
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Input minutes: ");
		double minute = ip.nextDouble();
		
		long year = (long)(minute / minuteInYear);
		int day = (int)(minute / 60 / 24) % 365;
		
		System.out.println((int) minute + " minutes is approximately " + year + " year(s) and " + day + " day(s)");
		ip.close();
	}
	
}
