package sorting;

import utils.ArrayUtils;

public class SelectWithMedian {

	public static void main(String[] args) {
		int[] array = {64, 34, 25, 12, 22, 11, 90};
		int p = 4;
		System.out.println("Mảng ban đầu: ");
		for(int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
		int result = select(array, 0, array.length - 1, p - 1); // p-1 vì chỉ số mảng bắt đầu từ 0
        System.out.println("Giá trị đứng thứ " + p + " sau khi sắp xếp: " + result);
	}
	
	// Hàm thực hiện sắp xếp chèn (Insertion Sort)
	private static void insertionSort(int[] array, int low, int high) {
		for(int i = low + 1; i <= high; i++) {
			int key = array[i];
			int j = i - 1;
			
			while(j >= low && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}
	
	// Hàm Select để tìm phần tử nhỏ thứ p
	private static int select(int[] array, int low, int high, int p) {
		if(high - low < 49) {	// Nếu đoạn ngắn hơn 50 phần tử, sử dụng sắp xếp chèn
			insertionSort(array, low, high);
			return array[low + p + 1];	// Trả về phần tử nhỏ thứ p
		}
		
		int j = low - 1;
		for(int i = low; i <= high; i += 5) {	// Chia nhóm 5 phần tử, tìm trung vị và chuyển về đầu đoạn
			int end = Math.min(i + 4, high);
			insertionSort(array, i, end);
			j++;
			ArrayUtils.swap(array, j, i + (end - i) / 2);	// Đưa trung vị vào vị trí đầu tiên chưa dùng
			
		}
		
		// Tìm pivot bằng đệ quy từ trung vị
		int pivot = select(array, low, j, (j - low + 1) / 2);

		// Đếm số phần tử nhỏ hơn và bằng pivot
		int countLess = 0;
		int countEqual = 0;
		for (int i = low; i <= high; i++) {
			if (array[i] < pivot)
				countLess++;
			else if (array[i] == pivot)
				countEqual++;
		}
		
		if(countLess < p && p <= countLess + countEqual) {
			return pivot;	// Nếu phần tử nhỏ thứ p chính là pivot
		}
		
		j = low - 1;
		if(p <= countLess) {	// Phần tử nhỏ thứ p nằm ở đoạn nhỏ hơn pivot
			for(int i = low; i <= high; i++) {
				if(array[i] < pivot) {
					j++;
					ArrayUtils.swap(array, j, i);
				}
			}
			return select(array, low, j, p);
		} else {	// Phần tử nhỏ thứ p nằm ở đoạn lớn hơn pivot
			for(int i = low; i <+ high; i++) {
				if(array[i] > pivot) {
					j++;
					ArrayUtils.swap(array, j, i);
				}
			}
			return select(array, low, j, p - countLess - countEqual);
		}
		
	}
	
}
