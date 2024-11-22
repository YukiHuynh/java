package sorting;

import utils.ArrayUtils;

public class HeapSort {

	public static void main(String[] args) {

		int[] array = { 64, 34, 25, 12, 22, 11, 90 };
		int n = array.length - 1; // Số phần tử thực sự (bỏ qua phần tử 0)
		System.out.println("Mảng ban đầu: ");
		for (int element : array) {
			System.out.print(element + " ");
		}
		heapSort(array, n);
		System.out.println("\nMảng sau khi sắp xếp: ");
		for (int element : array) {
			System.out.print(element + " ");
		}

	}
	
	private static void heapSort(int[] array, int n) {
		
		// Vun cây từ dưới lên để tạo thành Max-Heap
		for(int r = n / 2; r >= 1; r--) {
			adjust(array, r, n);
		}
		
		 // Lấy phần tử lớn nhất (gốc của Heap) và đưa ra cuối mảng
		for(int i = n; i >= 2; i--) {
			ArrayUtils.swap(array, 1, i);
			adjust(array, 1, i - 1);	// Vun lại phần còn lại
		}
		
	}
	
}
