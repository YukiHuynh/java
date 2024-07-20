package recursive;

public class Ex02CalculateSum {

	public static void main(String[] args) {
		int number = 7;
		int sum = calculateSum(number);
		System.out.println("Sum of numbers for 1 to " + number + " is " + sum);
	}
	
	public static int calculateSum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + calculateSum(n-1);
	}
}
