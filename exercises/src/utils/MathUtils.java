package utils;

public class MathUtils {
	
	static int[] array = IOUtils.IntegerArrayInput();
	
	public static int sumValueOfArray() {
		int sum = 0;
		for(int i : array) {
			sum += i;
		}
		return sum;
	}
	
	public static double avgValueOfArray() {
		int sum = sumValueOfArray();
		return (double) sum / array.length;
	}
	
}
