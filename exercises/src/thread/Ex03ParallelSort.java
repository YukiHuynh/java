package thread;

import java.util.Arrays;

import bean.SortTask;

public class Ex03ParallelSort {
	
	private static final int arraySize = 400;
	private static final int numThreads = 4;

	public static void main(String[] args) {
		int[] array = createArray();
		System.out.println("Before sorting: " + Arrays.toString(array));
		
		Thread[] threads = new Thread[numThreads];
		int segmentSize = arraySize / numThreads;
		
		for(int i = 0; i < numThreads; i++) {
			int startIndex = i * segmentSize;
			int endIndex = (i == numThreads - 1) ? arraySize - 1 : (startIndex + segmentSize - 1);
			threads[i]  = new Thread(new SortTask(array, startIndex, endIndex));
			threads[i].start();
		}
		
		for(Thread thread : threads) {
			try {
				thread.join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		mergeSort(array, 0, arraySize - 1);
		
		System.out.println("After sorting: " + Arrays.toString(array));
		
	}
	
	private static int[] createArray() {
		int[] array = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			array[i] = (int) (Math.random() * 400);
		}
		return array;
	}
	
	private static void mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}
	
	private static void merge(int[] array, int left, int mid, int right) {
		int[] temp = new int[right - left + 1];
		int i = left, j = mid + 1, k = 0;
		
		while(i <= mid && j <= right) {
			if(array[i] <= array[j]) {
				temp[k++] = array[i++];
			} else {
				temp[k++] = array[j++];
			}
		}
		
		while(i <= mid) {
			temp[k++] = array[i++];
		}
		
		while (j <= right) {
			temp[k++] = array[j++];
		}
		
		System.arraycopy(temp, 0, array, left, temp.length);
		
	}
	
}
