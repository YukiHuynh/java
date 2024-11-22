package searching;

import sorting.QuickSort;

public class SearchingMainExample {

	public static void main(String[] args) {
		
		int[] keys = {0, 13, 30, 56, 34, 39, 65, 72, 80, 67, 35, 89, 85, 102, 106, 104, 89, 92, 40, 107, 108, 117, 135, 119, 120, 150, 119, 169, 181, 189};
		int x = 89;
		
		printArray("Các phần tử của array: ", keys);
		System.out.println("Sequential Search for " + x);
		long executionTime = measureExecutionTime(() -> SequentialSearch.sequentialSearch(keys, keys.length, x));
		int result = SequentialSearch.sequentialSearch(keys, keys.length, x);
		
		if (result == 0) {
            System.out.println("Value " + x + " not found.");
        } else {
            System.out.println("Value " + x + " found at position " + result);
        }
		System.out.println("Execution time: " + executionTime + " nanoseconds");
		
		System.out.println("\n==============================================\n");
		int[] sortedKeys = QuickSort.sortedArray(keys);
		printArray("Mảng sau khi sắp xếp: ", sortedKeys);
		
		System.out.println("\nSequential Search for " + x);
		executionTime = measureExecutionTime(() -> BinarySearch.binarySearch(sortedKeys, x));
		result = BinarySearch.binarySearch(sortedKeys, x);
		
		if (result == 0) {
            System.out.println("Value " + x + " not found.");
        } else {
            System.out.println("Value " + x + " found at position " + result);
        }
		System.out.println("Execution time: " + executionTime + " nanoseconds");
		
		System.out.println("\n==============================================\n");
	}
	
//	private static int[] generateArray() {
//		Random rd = new Random();
//		int[] keys = new int[30];
//		for(int i = 0; i < keys.length; i++) {
//			keys[i] = rd.nextInt(200);
//		}
//		return keys;
//	}
	
	private static long measureExecutionTime(Runnable task) {
		long startTime = System.nanoTime();
		task.run();
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
	
	private static void printArray(String prefix, int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
	}
	
}
