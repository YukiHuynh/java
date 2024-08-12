package logic;

public class FindSmallestInt {

	public static void main(String[] args) {
		int[] arr = {34, 15, 88, 2};
		int result = findSmallestInt(arr);
		System.out.println(result);
	}
	
	public static int findSmallestInt(int[] arr) {
		int min = arr[0];
		for(int number : arr) {
			if(number < min) {
				min = number;
			}
		}
		return min;
	}
	
}
