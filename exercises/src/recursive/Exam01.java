package recursive;
import java.util.Scanner;

public class Exam01 {

	


		public static void main(String[] args) {
			
			Scanner ip = new Scanner(System.in);
			String input;
			double number = 0;
			boolean validInput = false;
			int attemps = 0;
			
			while (!validInput && attemps < 3) {
				System.out.println("Enter a decimal number with a non-zero fractional: ");
				input = ip.nextLine();
				
				if(isValidDecimal(input)) {
					number = Double.parseDouble(input);
					if(number == (int)number) {
						System.out.println("The number does not have fractional part. Please try again");
					} else {
						validInput = true;
					}
				} else {
					System.out.println("Invalid input. Please try again.");
				}
				attemps++;
			}
			
			if(!validInput) {
				System.out.println("Out of attemps! Exiting.");
				ip.close();
				return;
			}
			ip.close();
			
			String fraction = convertToFraction(number);
			System.out.println("The simplified fraction is: " + fraction);
		}
		
		public static boolean isValidDecimal(String input) {
			if(input == null || input.isEmpty()) {
				return false;
			}
			
			int dotCount = 0;
			for(char c : input.toCharArray()) {
				if(c == '.') {
					dotCount++;
				} else if(!Character.isDigit(c) && c != '-') {
					return false;
				}
			}
			return dotCount == 1 && input.length() > 1 && input.charAt(input.length() - 1) != '.';
		}
		
		public static String convertToFraction(double number) {
			String numStr = Double.toString(number);
			int digitDec = numStr.length() - numStr.indexOf('.') - 1;
			int denominator = (int) Math.pow(10, digitDec);
			int numerator = (int) Math.round(number * denominator);
			
			int gcd = findGCD(numerator, denominator);
			numerator /= gcd;
			denominator /= gcd;
			
			return numerator + " / " + denominator;
		}
		
		public static int findGCD(int num1, int num2) {
			if(num2 == 0) {
				return num1;
			}
			return findGCD(num2, num1  % num2);
		}
		
	}

