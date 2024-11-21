package sorting;

public class ShellSort {

	public static void main(String[] args) {
		
		int[] array = {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Mảng ban đầu: ");
		for(int element : array) {
			System.out.print(element + " ");
		}
		shellSort(array);
		System.out.println("\nMảng sau khi sắp xếp: ");
		for(int element : array) {
			System.out.print(element + " ");
		}
		
	}
	
	private static void shellSort(int[] array) {
		
		// Bắt đầu với khoảng cách h = n / 2 và giảm dần
		for(int h = array.length / 2; h > 0; h /= 2) {
			// Sắp xếp chèn trên các dãy con với khoảng cách h
			for(int i = h; i < array.length; i++) {
				int temp = array[i];
				int j = i - h;
				
				// Dịch chuyển các phần tử lớn hơn tmp
				while(j >= 0 && array[j] > temp) {
					array[j + h] = array[j];
					j -= h;
				}
				
				// Chèn tmp vào đúng vị trí
				array[j+h] = temp;
			}
		}
		
	}
	
}
