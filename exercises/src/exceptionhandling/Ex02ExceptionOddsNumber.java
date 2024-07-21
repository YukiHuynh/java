package exceptionhandling;

import utils.IOUtils;

public class Ex02ExceptionOddsNumber {

	public static void main(String[] args) {
		int number = IOUtils.inputInterger();
		tryNumber(number);
	}
	
	public static void tryNumber(int n) {
		try {
			checkEvenNumber(n);
			System.out.println(n + " is even");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void checkEvenNumber(int number) {
		if(number % 2 != 0) {
			throw new IllegalArgumentException(number + " is odd.");
		}
	}
	
}
