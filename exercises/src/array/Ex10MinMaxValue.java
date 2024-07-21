package array;

import java.util.Arrays;

import utils.IOUtils;

public class Ex10MinMaxValue {
	static int min;
	static int max;
	
	public static void main(String[] args) {
		
		int[] array = IOUtils.randomArray();
		System.out.println("Original array: " + Arrays.toString(array));
		minMax(array);
		System.out.println("Maximum value in given array: " + max);
		System.out.println("Minimum value in given array: " + min);
		
	}
	
	public static void minMax(int array[]) {
		max = array[0];
		min = array[0];
		int len = array.length;
		
		for(int i = 0; i < len - 1; i += 2) {
			if(i > len) {
				if(array[i] > max) { max = array[i];}
				if(array[i + 1] < min) { min = array[i];}
			}
			
			if(array[i] > array[i + 1]) {
				if(array[i] > max) { max = array[i]; }
				if(array[i + 1] < min) { min = array[i + 1]; }
			}
			
			if(array[i] < array[i +1]) {
				if(array[i] < min) { min = array[i]; }
				if(array[i + 1] > max) { max = array[i + 1]; }
			}
		}
	}
	
}
