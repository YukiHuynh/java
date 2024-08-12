package logic;

import java.util.Arrays;

public class CountPositivesSumNegatives {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
		int[] result = countPositivesSumNegatives(numbers);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] countPositivesSumNegatives(int[] numbers) {
		int count = 0;
		int sum = 0;
		for(int number : numbers) {
			if(number > 0 ) {
				count++;
			} else {
				sum += number;
			}
		}
		return new int[]{count, sum};
	}
	
}
