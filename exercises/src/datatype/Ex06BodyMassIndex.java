package datatype;

import java.util.Scanner;

public class Ex06BodyMassIndex {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your weight in kg: ");
		double weight = ip.nextDouble();
		System.out.println("Enter your height in m: ");
		double height = ip.nextDouble();
		
		double bmi = (int)(weight / Math.pow(height, 2));
		System.out.println("You body mass index (IBM) is " + bmi);
		
		if (bmi < 18.5) {
			System.out.println("Thin");
		} else if (18.5 <= bmi && bmi <= 24.9 ) {
			System.out.println("Normal");
		} else if (25 <= bmi && bmi <= 29.9) {
			System.out.println("Pre-obesity");
		} else if (30 <= bmi && bmi <= 34.9) {
			System.out.println("Grade 1 obesity");
		} else if (35 <= bmi && bmi <= 39.9) {
			System.out.println("Grade 2 obesity");
		} else {
			System.out.println("Grade 3 obesity");
		}
		ip.close();
	}
	
}
