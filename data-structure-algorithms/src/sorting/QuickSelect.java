package sorting;

import java.util.Random;

import utils.ArrayUtils;

public class QuickSelect {

	public static void main(String[] args) {
		int[] array = {64, 34, 25, 12, 22, 11, 90};
		int p = 4;
		System.out.println("Mảng ban đầu: ");
		for(int element : array) {
			System.out.print(element + " ");
		}
		int result = quickSelect(array, 0, array.length - 1, p - 1); // p-1 vì chỉ số mảng bắt đầu từ 0
        System.out.println("Giá trị đứng thứ " + p + " sau khi sắp xếp: " + result);
	}
	
	// Hàm Select chính
	private static int quickSelect(int[] array, int low, int high, int p) {
		if(low == high) return array[low];	// Nếu chỉ còn một phần tử, đó chính là kết quả
		
		// Chọn pivot ngẫu nhiên
		int pivotIndex = new Random().nextInt(high - low + 1) + low;
		int pivot = array[pivotIndex];
		
		ArrayUtils.swap(array, pivotIndex, low);
		
		int i = low;
		int j = high;
		
		while (i < j) {
			while(i <= j && array[i] < pivot) i++;
			while(array[j] > pivot) j--;
			if(i <= j) {
				ArrayUtils.swap(array, i, j);
				i++;
				j--;
			}
		}
		
		ArrayUtils.swap(array, low, j);
		
		// Kiểm tra vị trí của phần tử p
		if(p <= j) {
			return quickSelect(array, low, j - 1, p);
		}else {
			return quickSelect(array, j + 1, high, p);
		}
		
	}
	
}
