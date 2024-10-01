package insertion;

import functional.IntComparator;
import utils.ArrayUtils;
import utils.RandomUtils;

public class Ex01InsertionIntDemo {

	public static void main(String[] args) {
		
		int[] array = RandomUtils.generateRandomArray(10);;
		RandomUtils.printf("Original array:", array);
		
		insertionSort(array, (n1, n2) -> n2 - n1);
		RandomUtils.printf("Sorted array (asc)",array);
		
	}
	
	private static void insertionSort(int[] array, IntComparator intComp) {
		
		for(int i = 1; i < array.length; i++) {
			for(int j = 0; j < i; j++) {
				if(intComp.strategy(array[i], array[j]) > 0) {
					ArrayUtils.swap(array, i, j);
				}
			}
		}
		
	}
	
}
