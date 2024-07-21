package array;

import java.util.Arrays;

import utils.IOUtils;

public class Ex15FindCommonElementInt {

	public static void main(String[] args) {
		int[] array1 = IOUtils.randomArray();
		int[] array2 = IOUtils.randomArray();
		
		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2)) ;
		
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j]) {
					System.out.println("Common element: " + array1[i]);
				}
			}
		}
	}
	
}
