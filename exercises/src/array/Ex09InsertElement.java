package array;

import java.util.Arrays;

import utils.IOUtils;

public class Ex09InsertElement {
	
	public static void main(String[] args) {
		int[] array = IOUtils.randomArray();
		int indexPosition = IOUtils.inputInteger("Enter index position: ");
		int newValue = IOUtils.inputInteger("Input value to insert:");
		System.out.println("Original array: " + Arrays.toString(array));
		
		for(int i = array.length - 1; i > indexPosition; i--) {
			array[i] = array[i - 1];
		}
		
		array[indexPosition] = newValue;
		System.out.println("New Array: " + Arrays.toString(array));
	}
	
}
