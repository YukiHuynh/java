package chapter03.using_array;

public class InsertionSort {

	public static void main(String[] args) {
		
	}
	
	public static void insertionSort(char[] data) {
		int n = data.length;
		for(int i = 1; i < n; i++) {
			char cur = data[i];
			int j = i;
			while(j > 0 && data[j-1] > cur) {
				data[j] = data[j-1];
				j--;
			}
			data[j] = cur;
		}
	}
	
}
