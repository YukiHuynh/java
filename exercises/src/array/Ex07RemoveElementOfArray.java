package array;

import java.util.Arrays;

import utils.IOUtils;

public class Ex07RemoveElementOfArray {

	public static void main(String[] args) {
		int[] array = IOUtils.randomArray();
		System.out.println("Original array is: " + Arrays.toString(array));
		int removeIndex = IOUtils.inputInteger("Enter index to remove");
		
		for(int i = removeIndex; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		
		System.out.println("After removing number " + removeIndex + ": " + Arrays.toString(array));
	}
	
}
