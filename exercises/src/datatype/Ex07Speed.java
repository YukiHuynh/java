package datatype;

import java.util.Scanner;

public class Ex07Speed {

	public static void main(String[] args) {
		float timeSeconds;
		float mps, kph, mph;
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter distance in meter: ");
		float d = ip.nextFloat();
		System.out.println("Enter time in hours: ");
		float hour = ip.nextFloat();
		System.out.println("Enter time in minutes: ");
		float minute = ip.nextFloat();
		System.out.println("Enter time in seconds: ");
		float second = ip.nextFloat();
		
		timeSeconds = (hour * 3600) + (minute * 60) + second;
		mps = d / timeSeconds;
		kph = (d / 1000.0f) / (timeSeconds / 3600.0f);
		mph = kph / 1.600f;
		
		System.out.println("Speed in meter/second is: " + mps + " m/s");
		System.out.println("Speed in kilomiter/hour is: " + kph + " km/h");
		System.out.println("Speed in miles/hour is: " + mph + " mil/h");
		ip.close();
	}
	
}
