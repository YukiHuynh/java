package datatype;

import java.util.Scanner;

public class Ex02InchToMeter {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input inches: ");
		double inch = ip.nextDouble();
		double meter = inch * 0.0254;
		ip.close();
		
		System.out.println(inch + " inches = " + meter + " meters.");
	}
	
}
