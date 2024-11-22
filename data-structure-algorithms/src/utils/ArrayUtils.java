package utils;

public class ArrayUtils {

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
	
}
