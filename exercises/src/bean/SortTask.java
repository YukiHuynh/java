package bean;

import java.util.Arrays;

public class SortTask implements Runnable{

	private int[] array;
	private int startIndex;
	private int endIndex;
	
	public SortTask() {
	}

	public SortTask(int[] array, int startIndex, int endIndex) {
		this.array = array;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	@Override
	public String toString() {
		return "SortTask [array=" + Arrays.toString(array) + ", startIndex=" + startIndex + ", endIndex=" + endIndex
				+ "]";
	}

	@Override
	public void run() {
		Arrays.sort(array, startIndex, endIndex + 1);
	}
	
}
