package insertion;

import java.util.Arrays;

import functional.StringComparator;
import utils.ArrayUtils;

public class Ex02InsertionStringDemo {

	public static void main(String[] args) {
		
		// String[] elements = { null, "a123", null, null, "z45", "c1", null, "k5", "d28", null };
		String[] elements = {"a123", "z45", "c1", "k5", "d28"};
		String ss1 = "a123";
		String ss2 = "b123";
		System.out.println(ss1.compareTo(ss2));
		System.out.println("elements: " + Arrays.toString(elements));
		System.out.println("\n================================================================\n");
		
		insertionSort(elements, (s1, s2) -> s1.compareTo(s2));
		System.out.println("Insertion Sort non-null(asc) --> " + Arrays.toString(elements));
		
	}
	
	private static void insertionSort(String[] elements, StringComparator stringComp) {
		for(int i = 1; i < elements.length; i++) {
			for(int j = 0; j < i; j++) {
				if(stringComp.strategy(elements[i], elements[j]) > 0) {
					ArrayUtils.swap(elements, i, j);
				}
			}
		}
	}
	
}
