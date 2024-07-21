package array;

import java.util.Arrays;

import utils.IOUtils;

public class Ex12FindDuplicateValues {

	public static void main(String[] args) {
		int[] array = IOUtils.randomArray();
		System.out.println("Original array: " + Arrays.toString(array));
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if((array[i] == array[j]) && (i != j)) {
					System.out.println("Duplicate element: " + array[j]);
				}
			}
		}
		
	}
	
}
