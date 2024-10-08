package view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04ArraySorting {

	public static void main(String[] args) {
		
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
		System.out.println("Original string: " + Arrays.toString(strings));
		
		Arrays.sort(strings, (s1, s2) -> {
			
		});
		System.out.println("After sorting (asc): " + Arrays.toString(strings));
		
	}
	
}
