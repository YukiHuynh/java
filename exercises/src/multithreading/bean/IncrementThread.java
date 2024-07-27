package multithreading.bean;

public class IncrementThread extends Thread{
	
	private Counter counter;
	private int incrementsPerThread;
	
	public IncrementThread() {
	}

	public IncrementThread(Counter counter, int incrementsPerThread) {
		this.counter = counter;
		this.incrementsPerThread = incrementsPerThread;
	}

	public Counter getCounter() {
		return counter;
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}

	public int getIncrementsPerThread() {
		return incrementsPerThread;
	}

	public void setIncrementsPerThread(int incrementsPerThread) {
		this.incrementsPerThread = incrementsPerThread;
	}

	@Override
	public String toString() {
		return "IncrementThread [counter=" + counter + ", incrementsPerThread=" + incrementsPerThread + "]";
	}
	
	@Override
	public void run() {
		for(int i = 0; i < incrementsPerThread; i++) {
			counter.increment();
		}
	}
	
}
