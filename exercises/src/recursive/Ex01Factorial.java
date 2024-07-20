package recursive;

public class Ex01Factorial {

	public static void main(String[] args) {
		int number = 7;
		int factorial = calculateFactorial(number);
		System.out.println("Factorial of " + number + " is " + factorial);
		number = 10;
		factorial = calculateFactorial(number);
		System.out.println("Factorial of " + number + " is " + factorial);
	}

	public static int calculateFactorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * calculateFactorial(n - 1);
	}
	
}
