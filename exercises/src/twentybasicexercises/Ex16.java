package twentybasicexercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a string:");
		String strInput = ip.nextLine();
		
		System.out.println("Enter a character to search: ");
		char c = ip.next().charAt(0);
		
		char[] array = strInput.toCharArray();
		System.out.println(Arrays.toString(array));
		
		boolean found = false;
		int index = -1;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == c) {
				found = true;
				index = i;
				break;
			} else {
				found = false;
			}
			
		}
		
		if(found == true) {
			System.out.println("Yes. ");
		} else {
			System.out.println("No");
		}
		
		// Ex17
		if(found == true) {
			System.out.println(c + " appear at index " + index);
		} else {
			System.out.println(c + " doesn't exist.");
		}
		
		// Ex18
		System.out.println("This String have number?");
		boolean isNumber = false;
		for(int i = 0; i < array.length; i++) {
			if(Character.isDigit(array[i])) {
				isNumber = true;
				break;
			} else {
				isNumber = false;
			}
		}
		if(isNumber == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == c) {
				count++;
			}
		}
		System.out.println(c + " appear " + count + " time(s).");
		
		ip.close();
	}

}
