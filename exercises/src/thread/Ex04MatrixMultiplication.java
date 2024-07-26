package thread;

import bean.MultiplicationTask;

public class Ex04MatrixMultiplication {

	private static final int matrixSize = 3;
	private static final int numThreads = 2;
	
	public static void main(String[] args) {
		
		int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		
		int[][] reuslt = new int[matrixSize][matrixSize];
		
		Thread[] threads = new Thread[numThreads];
		int segmentSize = matrixSize / numThreads;
		
		for(int i = 0; i < numThreads; i++) {
			int startIndex = i * segmentSize;
			int endIndex = (i == numThreads - 1) ? matrixSize - 1 : (startIndex + segmentSize -1);
			threads[i] = new Thread(new MultiplicationTask(matrix1, matrix2, reuslt, startIndex, endIndex));
			threads[i].start();
		}
		
		for(Thread thread : threads) {
			try {
				thread.join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Result: ");
		for(int[] row : reuslt) {
			for(int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
	}
	
}
