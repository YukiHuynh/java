package array;

import java.util.Arrays;

public class Ex17FindSecondLargestElement {

	public static void main(String[] args) {
		int[] array = {
				10789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456
		};
		System.out.println("Original array: " + Arrays.toString(array));
		Arrays.sort(array);
		
		int index = array.length - 1;
		
		while(array[index] == array[array.length -1]) {
			index--;
		}
		
		System.out.println("Second largest value: " + array[index]);
		
	}
	
}
