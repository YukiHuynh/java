package twentybasicexercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your student ID: ");
		
		String studentID = ip.nextLine();
		
		if(isValidStudentID(studentID)) {
			System.out.println("Valid student ID.");
		} else {
			System.out.println("Invalid student ID");
		}
		ip.close();
				
	}
	
	private static boolean isValidStudentID(String studentID) {
		String regex = "B[1-9]{7}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(studentID);
		return matcher.matches();
	}
	
}
