package twentybasicexercises;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = ip.nextLine();
		String regex = "^[A-Z][^\s]*[0-9]$";
		char[] array = str.toCharArray();
		
		
		if(array.length <= 20 && str.matches(regex)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		ip.close();
	}
	
}
