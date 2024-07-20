package datatype;

import java.util.Scanner;

public class Ex01FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input Fahrenheit: ");
		double fahrenheit = ip.nextDouble();
		double celsius = (5 * (fahrenheit - 32)) / 9;
		
		System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius.");
		ip.close();
	}
	
}
