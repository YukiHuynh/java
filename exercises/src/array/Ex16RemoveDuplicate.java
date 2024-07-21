package array;

import java.util.Arrays;

import utils.IOUtils;

public class Ex16RemoveDuplicate {

	public static void main(String[] args) {
		int[] array = IOUtils.randomArray();
		uniqueArray(array);
	}
	
	static void uniqueArray(int[] array) {
		System.out.println("Original array: ");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		
		int noUniqueElement = array.length;
		
		for(int i = 0; i < noUniqueElement; i++) {
			for(int j = i + 1; j < noUniqueElement; j++) {
				if(array[i] == array[j]) {
					array[j] = array[noUniqueElement - 1];
					noUniqueElement--;
					j--;
				}
			}
		}
		
		int[] array1 = Arrays.copyOf(array, noUniqueElement);
		
		System.out.println();
		System.out.println("Array with unique value: ");
		
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i] + "\t");
		}
		
		System.out.println();
		System.out.println("==================================");
	}
	
}
