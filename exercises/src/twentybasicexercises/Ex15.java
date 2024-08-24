package twentybasicexercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String[] studentsID = new String[5];
		String regex = "00[2-5]L[0-9]{4}";
		for(int i = 0; i < studentsID.length; i++) {
			while(true) {
				System.out.println("Enter studlen ID " + (i + 1) + ": ");
				String id = ip.nextLine();
				if(Pattern.matches(regex, id)) {
					studentsID[i] = id;
					break;
				} else {
					System.out.println("Invalid format.");
					System.exit(i);
				}
			}
		}
		System.out.println(Arrays.toString(studentsID));
		ip.close();
	}
	
}
