package twentybasicexercises;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String[] studentIDs = new String[5];
		String regex = "B170[1-9]{4}";
		
		for(int i = 0; i < studentIDs.length; i++) {
			while(true) {
				System.out.println("Enter student ID " + (i + 1) + ": ");
				String id = ip.nextLine();
				
				if(Pattern.matches(regex, id)) {
					studentIDs[i] = id;
					break;
				} else {
					System.out.println("Invalid format. The student ID must be in the format"
							+ " 'B170xxxx' where 'x' is a digit from 1-9.");
				}
			}
		}
		
		System.out.println("Valid student id: ");
		for(String id : studentIDs) {
			System.out.println(id);
		}
		ip.close();
		
	}
	
}
