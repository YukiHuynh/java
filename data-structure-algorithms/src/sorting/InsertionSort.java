package sorting;

import utils.ArrayUtils;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Mảng ban đầu: ");
		for(int element : array) {
			System.out.print(element + " ");
		}
		insertionSort(array);
		System.out.println("Mảng sau khi sắp xếp: ");
		for(int element : array) {
			System.out.print(element + " ");
		}
	}
	
	private static void insertionSort(int[] array) {
		for(int i = 1; i < array.length; i++) {
			for(int j = 0; j < i; j++) {
				if(array[i] > array[j]) {
					ArrayUtils.swap(array, i, j);
				}
			}
		}
	}
	
}
