package selection;

import java.util.Arrays;

import functional.StringComparator;
import utils.ArrayUtils;

public class Ex02SelectionSortStringDemo {

	public static void main(String[] args) {

		String[] elements = { null, "a123", null, null, "z45", "c1", null, "k5", "d28", null };
		// String[] elements = {"a123", "z45", "c1", "k5", "d28"};

		System.out.println("elements: " + Arrays.toString(elements));
		System.out.println("\n================================================================\n");

		// sorting null first asc
		selectionSort(elements, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
				
			if (s2 == null) {
				return 1;
			}
			return s1.compareTo(s2);
		});

		System.out.println("elements asc:" + Arrays.toString(elements));

	}

	private static void selectionSort(String[] elements, StringComparator stringComp) {

		int length = elements.length;
		for (int i = 0; i < length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < length; j++) {
				if (stringComp.strategy(elements[j], elements[minIndex]) < 0) {
					minIndex = j;
				}
			}
			ArrayUtils.swap(elements, i, minIndex);
		}
	}

}
