package sorting;

import utils.ArrayUtils;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Mảng ban đầu: ");
		for(int element : array) {
			System.out.print(element + " ");
		}
		bubbleSort(array);
		System.out.println("Mảng sau khi sắp xếp: ");
		for(int element : array) {
			System.out.print(element + " ");
		}
	}
	
	private static void bubbleSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j+1]) {
					ArrayUtils.swap(array, j, j+1);
				}
			}
		}
	}
	
}
