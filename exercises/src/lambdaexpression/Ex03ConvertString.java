package lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class Ex03ConvertString {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");
		
		System.out.println("\nOriginal strings:");
		for(String str : stringList) {
			System.out.println(str);
		}
		
		stringList.replaceAll(str -> str.toUpperCase());
		System.out.println("\nUppercase Strings:");
		for(String str : stringList) {
			System.out.println(str);
		}
	}
	
}
