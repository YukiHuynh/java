package basicpart;

import java.util.Scanner;

public class B1Ex12 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input first number: ");
		double n1 = ip.nextDouble();
		System.out.println("Input second number: ");
		double n2 = ip.nextDouble();
		System.out.println("Input third number: ");
		double n3 = ip.nextDouble();
		ip.close();
		double avg = (n1 + n2 + n3) / 3;
		System.out.println("Avarag: " + avg);
	}
	
}
