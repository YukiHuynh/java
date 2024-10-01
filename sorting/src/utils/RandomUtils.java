package utils;

import java.util.Random;

public class RandomUtils {

	public static int[] generateRandomArray(int n) {

		Random rd = new Random();
		int[] origin = new int[n];

		for (int i = 0; i < n; i++) {
			origin[i] = rd.nextInt(100);
		}

		return origin;
	}
	
	public static void printf(String prefix, int[] array) {
		System.out.println(prefix + " --> {");
		for(int element : array) {
			System.out.println("    + " + element);
		}
		System.out.println("}\n");
	}
	
	public static <T> void printf(String prefix, T[] items) {
		System.out.println(prefix + " --> {");
		for(T item : items) {
			System.out.println("    + " + item);
		}
		System.out.println("}\n");
	}

}
