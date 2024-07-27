package multithreading.bean;

public class Counter {

	private int count = 0;
	
	public Counter() {
	}
	
	public Counter(int count) {
		this.count = count;
	}
	

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Counter [count=" + count + "]";
	}

	public synchronized void increment() {
		count++;
	}
	
	
}
