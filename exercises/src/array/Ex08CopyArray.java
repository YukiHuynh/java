package array;

import java.util.Arrays;

import utils.IOUtils;

public class Ex08CopyArray {

	public static void main(String[] args) {
		int[] originalArray = IOUtils.randomArray();
		int[] newArray = new int[originalArray.length];
		
		System.out.println("Original array is:" + Arrays.toString(originalArray));
		
		for(int i = 0; i < originalArray.length; i++) {
			newArray[i] = originalArray[i];
		}
		
		System.out.println("New array is: " + Arrays.toString(newArray));
	}
	
}
