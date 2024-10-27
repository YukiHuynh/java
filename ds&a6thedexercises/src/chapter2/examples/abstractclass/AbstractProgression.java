package chapter2.examples.abstractclass;

public abstract class AbstractProgression {

	protected long current;
	
	public AbstractProgression() {
		this(0);
	}
	
	public AbstractProgression(long start) {
		current = start;
	}
	
	public long nextValue() {
		long answer = current;
		advance();
		return answer;
	}
	
	public void printProgression(int n) {
		System.out.println(nextValue());
		for(int i = 0; i < n; i++) {
			System.out.println(" " + nextValue());
		}
		System.out.println();
	}
	
	protected abstract void advance();
	
}
