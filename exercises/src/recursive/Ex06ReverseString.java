package recursive;

import java.util.Scanner;

public class Ex06ReverseString {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String str;
		System.out.println("Enter a string: ");
		while(true) {
			str = ip.nextLine();
			if(!str.matches("\\d+")) {
				break;
			}
			System.out.println("Invalid input. Try again:");
		}
		String reversed = reverseString(str);
		System.out.println("Orginal string : " + str + ", and reversed string: " + reversed);
		ip.close();
	}
	
	public static String reverseString(String str) {
		if(str.isEmpty() || str.length() == 1) {
			return str;
		}
		return reverseStringHelper(str, str.length() - 1);
	}
	
	private static String reverseStringHelper(String str, int index) {
		if(index == 0) {
			return Character.toString(str.charAt(0));
		}
		return str.charAt(index) + reverseStringHelper(str, index - 1);
	}
	
}
