package bean;

public class PrimeSumTask implements Runnable{

	private int start;
	private int end;
	private long sum;
	
	public PrimeSumTask() {
	}

	public PrimeSumTask(int start, int end) {
		this.start = start;
		this.end = end;
		this.sum = 0;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "PrimeSumTask [start=" + start + ", end=" + end + ", sum=" + sum + "]";
	}
	
	@Override
	public void run() {
		for(int i = start; i <= end; i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
	}
	
	private boolean isPrime(int number) {
		if(number < 2) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
