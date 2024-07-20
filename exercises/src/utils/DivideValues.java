package utils;

public class DivideValues {

	private int dividend;
	private int divisor;
	
	public DivideValues() {
	}

	public DivideValues(int dividend, int divisor) {
		super();
		this.dividend = dividend;
		this.divisor = divisor;
	}

	public int getDividend() {
		return dividend;
	}

	public void setDividend(int dividend) {
		this.dividend = dividend;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	@Override
	public String toString() {
		return "DivideValues [dividend=" + dividend + ", divisor=" + divisor + "]";
	}
	
}
