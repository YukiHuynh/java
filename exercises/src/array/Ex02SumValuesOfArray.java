package array;

import java.util.Arrays;

import utils.IOUtils;

public class Ex02SumValuesOfArray {

	public static void main(String[] args) {
		int[] array = IOUtils.IntegerArrayInput();
		int sum = 0;
		
		for(int i : array) {
			sum += i;
		}
		
		System.out.println("Sum of " + Arrays.toString(array) + " is: " + sum);
	}
	
}
