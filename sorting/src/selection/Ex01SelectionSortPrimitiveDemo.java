package selection;

import java.util.Arrays;
import java.util.Random;

import functional.IntComparator;

public class Ex01SelectionSortPrimitiveDemo {

	public static void main(String[] args) {
		
		int[] originArray = generateRandomArray(10);
		System.out.println(Arrays.toString(originArray));
		
		selectionSort(originArray, (n1,n2) -> n2 - n1);
		printf(originArray);
		System.out.println();
		
		selectionSort2(originArray, (n1,n2) -> n2 - n1);
		printf(originArray);
	}
	
	private static int[] generateRandomArray(int n) {
		
		Random rd = new Random();
		int[] origin = new int[n];
		
		for(int i = 0; i < n; i++) {
			origin[i] = rd.nextInt(100);
		}
		
		return origin;
	}
	
	private static void selectionSort2(int[] elements, IntComparator intComp) {
	    int length = elements.length;
	    for (int i = 0; i < length; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < length; j++) {
	            if (intComp.strategy(elements[j], elements[minIndex]) < 0) {
	                minIndex = j;
	            }
	        }
	        if (minIndex != i) {
	            int temp = elements[i];
	            elements[i] = elements[minIndex];
	            elements[minIndex] = temp;
	        }
	    }
	}
	
	private static void selectionSort(int[] origin, IntComparator intComp) {
		int length = origin.length;
		for(int i = length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(intComp.strategy(origin[j], origin[i]) > 0) {
					int temp = origin[j];
					origin[j] = origin[i];
					origin[i] = temp;
				}
			}
		}
	}
	
	private static void printf(int[] array) {
		for(int val : array) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
	
}
