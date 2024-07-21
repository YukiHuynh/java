package array;

import java.util.Arrays;

import utils.IOUtils;

public class Ex11ReverseArray {

	public static void main(String[] args) {
		int[] array = IOUtils.randomArray();
		System.out.println("Origin array: " + Arrays.toString(array));
		
		for(int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		
		System.out.println("Reversed array: " + Arrays.toString(array));
	}
	
}
