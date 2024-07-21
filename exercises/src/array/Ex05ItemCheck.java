package array;

import utils.IOUtils;

public class Ex05ItemCheck {

	public static void main(String[] args) {
		
		int[] array = IOUtils.IntegerArrayInput();
		int inputInteger = IOUtils.inputInteger("Enter number of element");
		boolean contain = contains(array, inputInteger);
		if(contain == true) {
			System.out.println("Array contains " + inputInteger);
		} else {
			System.out.println("Array doesn't contains " + inputInteger);
		}
		
		
	}
	
	public static boolean contains(int[] arr, int item) {
		for(int n : arr) {
			if(item == n) {
				return true;
			}
		}
		return false;
	}
	
}
