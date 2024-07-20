package recursive;

public class Ex09SumOfOddNumberInArray {

	public static void main(String[] args) {
		int[] numbers = {
			      1,
			      2,
			      3,
			      4,
			      5,
			      6,
			      7,
			      8,
			      9
			    };
			    int sum = calculateOddNumberSum(numbers);
			    System.out.println("The sum of all odd numbers in the array is: " + sum);
	}
	
	public static int calculateOddNumberSum(int[] arr) {
		return calculateOddNumberSum(arr, 0);
	}
	
	private static int calculateOddNumberSum(int[] arr, int index) {
		if(index == arr.length) {
			return 0;
		}
		
		int sum = calculateOddNumberSum(arr, index + 1);
		if(arr[index] % 2 != 0) {
			sum += arr[index];
		}
		return sum;
	}
	
}
