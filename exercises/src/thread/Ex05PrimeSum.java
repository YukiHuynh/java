package thread;

import bean.PrimeSumTask;

public class Ex05PrimeSum {

	private static final int numThreads = 4;
	
	public static void main(String[] args) {
		
		int limit = 10000000;
		
		Thread[] threads = new Thread[numThreads];
		PrimeSumTask[] tasks = new PrimeSumTask[numThreads];
		
		int segmentSize = limit / numThreads;
		int start = 2;
		int end = segmentSize;
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < numThreads; i++) {
			if(i == numThreads - 1) {
				end = limit;
			}
			
		tasks[i] = new PrimeSumTask(start, end);
		threads[i] = new Thread(tasks[i]);
		threads[i].start();
		
		start = end + 1;
		end += segmentSize;
		}
		
		long sum = 0;
		for(int i = 0; i < numThreads; i++) {
			try {
				threads[i].join();
				sum += tasks[i].getSum();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("Sum of prime numbers up to " + limit + ": " + sum);
		System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
		
	}
	
}
