package bean;

import java.util.Arrays;

public class MultiplicationTask implements Runnable{

	private int[][] matrix1;
	private int[][] matrix2;
	private int[][] result;
	private int startIndex;
	private int endIndex;
	private int matrixSize = 3;
	
	public MultiplicationTask() {
	}

	public MultiplicationTask(int[][] matrix1, int[][] matrix2, int[][] result, int startIndex, int endIndex) {
		this.matrix1 = matrix1;
		this.matrix2 = matrix2;
		this.result = result;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}

	public int[][] getMatrix1() {
		return matrix1;
	}

	public void setMatrix1(int[][] matrix1) {
		this.matrix1 = matrix1;
	}

	public int[][] getMatrix2() {
		return matrix2;
	}

	public void setMatrix2(int[][] matrix2) {
		this.matrix2 = matrix2;
	}

	public int[][] getResult() {
		return result;
	}

	public void setResult(int[][] result) {
		this.result = result;
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
		return "MultiplicationTask [matrix1=" + Arrays.toString(matrix1) + ", matrix2=" + Arrays.toString(matrix2)
				+ ", result=" + Arrays.toString(result) + ", startIndex=" + startIndex + ", endIndex=" + endIndex + "]";
	}
	
	@Override
	public void run() {
		int cols = matrix2[0].length;
		
		for(int i = startIndex; i < endIndex; i++) {
			for(int j = 0; j < cols; j++) {
				for(int k = 0; k < matrixSize; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
	}
}
