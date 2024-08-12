package logic;

import java.util.Arrays;

public class DoubledArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int[] result = map(arr);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] map(int[] arr) {
		int[] doubled = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			doubled[i] = arr[i] * 2;
		}
		return doubled;
	}
	
}
