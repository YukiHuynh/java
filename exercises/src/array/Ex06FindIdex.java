package array;

import java.util.Arrays;
import java.util.OptionalInt;

import utils.IOUtils;

public class Ex06FindIdex {

	public static void main(String[] args) {
		int[] array = IOUtils.randomArray();
		System.out.println("Original array is: " + Arrays.toString(array));
		int number = IOUtils.inputInteger("Enter number needed to find");
		findIndex(array, number).ifPresentOrElse(
				index -> System.out.println("Index position of " + number + " is: " + index),
				() -> System.out.println("Number " + number + " not found in array")
				);
	}
	
	public static OptionalInt findIndex(int[] array, int t) {
		if(array == null) {
			return OptionalInt.empty();
		}
		
		int len = array.length;
		int i = 0;
		
		while(i < len) {
			if(array[i] == t) {
				return OptionalInt.of(i);
			} else {
				i += 1;
			}
		}
		return OptionalInt.empty();
	}
	
}
