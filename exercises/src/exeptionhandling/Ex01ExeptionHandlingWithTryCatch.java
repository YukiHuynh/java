package exeptionhandling;

import utils.DivideValues;
import utils.IOUtils;

public class Ex01ExeptionHandlingWithTryCatch {
	
	public static void main(String[] args) {
		try {
			DivideValues values = IOUtils.inputValues();
			int dividend = values.getDividend();
			int divisor = values.getDivisor();
			
			int result = divideNumbers(dividend, divisor);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage()); 
		}
	}
	
	public static int divideNumbers(int dividend, int divisor) {
		if(divisor == 0) {
			throw new ArithmeticException("Cannot divide the given number by zero");
		}
		return dividend / divisor;
	}
	
}
