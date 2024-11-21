package sorting;

import java.util.Random;

import utils.ArrayUtils;

public class QuickSort {

public static void main(String[] args) {
		
		int[] array = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Mảng ban đầu: ");
		for(int element : array) {
			System.out.print(element + " ");
		}
		quickSort(array, 0, array.length -1);
		System.out.println("\nMảng sau khi sắp xếp: ");
		for(int element : array) {
			System.out.print(element + " ");
		}
		
	}

	private static void quickSort(int[] array, int low, int high) {
		if(low > high) return;
		
		// Chọn pivot và phân chia mảng
		int pivotIndex = partition(array, low, high);
		
		// Đệ quy sắp xếp hai phần
		quickSort(array, low, pivotIndex - 1);
		quickSort(array, pivotIndex + 1, high);
		
	}
	
	private static int partition(int[] array, int low, int high) {
		int pivot = array[new Random().nextInt(high - low + 1) + low];
		int i = low - 1;
		
		for(int j = low; j <= high; j++) {
			if(array[j] <= pivot) {
				i++;
				ArrayUtils.swap(array, i, j);
			}
		}
		return i;
	}
	
	//Hàm QuickSort chính
//	private static void quickSort(int[] array) {
//		partition(array, 0, array.length - 1);
//	}
//	
//	private static void partition(int[] array, int low, int high) {
//		if(low >= high) {
//			return;	// Nếu đoạn chỉ có 1 phần tử hoặc ít hơn, không cần sắp xếp
//		}
//		
//		// Chọn một phần tử ngẫu nhiên làm pivot
//		Random rd = new Random();
//		int pivotIndex = rd.nextInt(high - low + 1) + low;
//		int pivot = array[pivotIndex];
//		
//		int i = low;
//		int j = high;
//		
//		do {
//			// Tìm từ đầu đoạn phần tử ≥ pivot
//			while(array[i] < pivot) {
//				i++;
//			}
//			
//			// Tìm từ cuối đoạn phần tử ≤ pivot
//			while(array[j] > pivot) {
//				j--;
//			}
//			
//			// Nếu tìm thấy cặp phần tử cần hoán đổi
//			if(i <= j) {
//				if(i <j) {
//					ArrayUtils.swap(array, i, j);
//				}
//				i++;
//				j--;
//			}
//		} while (i <= j);
//		
//		// Đệ quy sắp xếp hai đoạn con
//		partition(array, low, j);
//		partition(array, i, high);
//		
//	}

}
