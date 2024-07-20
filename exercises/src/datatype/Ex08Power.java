package datatype;

import java.util.Scanner;

public class Ex08Power {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input number: ");
		double num = ip.nextDouble();
		
		double sqr = Math.pow(num, 2);
		double cube = Math.pow(num, 3);
		double forthPower = Math.pow(num, 4);
		
		System.out.println("Square of " + num + " is: " + sqr);
		System.out.println("Cube of " + num + " is: " + cube);
		System.out.println("Forth power of " + num + " is: " + forthPower);
		ip.close();
	}
	
}
