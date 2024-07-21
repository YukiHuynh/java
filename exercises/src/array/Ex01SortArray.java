package array;

import java.util.Arrays;

import utils.IOUtils;

public class Ex01SortArray {
	public static void main(String[] args) {
		int[] array1 = IOUtils.IntegerArrayInput();
		String[] array2 = IOUtils.StringArrayInput();
		System.out.println("Original integer array: " + Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("Sorted integer array: " + Arrays.toString(array1));
		System.out.println("Original string array: " + Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("Sorted string array: " + Arrays.toString(array2));
	}
}
