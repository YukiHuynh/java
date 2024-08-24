package twentybasicexercises;

import java.util.Arrays;

import utils.IOUtils;

public class Ex14 {

	public static void main(String[] args) {
		
		int n = IOUtils.inpitN();
		int[] array = IOUtils.randomArray(n);
		System.out.println("The array is:" + Arrays.toString(array));
		for(int i = 0; i < n / 2; i++) {
			int temp = array[i];
			array[i] = array[n - i -1];
			array[n - i - 1] = temp;
		}
		System.out.println("New array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
