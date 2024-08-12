package logic;

public class SumOfPositive {
	public static void main(String[] args) {
		int[] arr = { 1, -4, 7, 12 };
		int result = sumOfPositive(arr);
		System.out.println(result);
	}

	public static int sumOfPositive(int[] numbers) {
		int sum = 0;

		for (int number : numbers) {
			if (number > 0) {
				sum += number;
			}
		}
		return sum;
	}
}
