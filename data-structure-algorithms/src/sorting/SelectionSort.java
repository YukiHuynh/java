package sorting;

import utils.ArrayUtils;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Mảng ban đầu: ");
		for(int element : array) {
			System.out.print(element + " ");
		}
		selectionSort(array);
		System.out.println("Mảng ban đầu: ");
		for(int element : array) {
			System.out.print(element + " ");
		}
	}
	
	private static void selectionSort(int[] array) {
		int n = array.length;
		for(int i = n - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(array[j] > array[i]) {
					ArrayUtils.swap(array, i, j);
				}
			}
		}
	}
	
}
