package recursive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex11StringPremutationGenerator {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input a string:");
		String input = ip.nextLine();
		
		List<String> premutations = generatePremutations(input);
		System.out.println("Premutation of \"" + input + "\":");
		for(String premutation: premutations) {
			System.out.println(premutation);
		}
		ip.close();
	}
	
	private static void generatePremutationsHelper(String str, String current, List<String> premutations) {
		if(str.isEmpty()) {
			premutations.add(current);
			return;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String remaining = str.substring(0, i) + str.substring(i + 1);
			generatePremutationsHelper(remaining, current + ch, premutations);
		}
		
	}
	
	public static List< String > generatePremutations(String str) {
		List< String > premutations = new ArrayList< > ();
		generatePremutationsHelper(str, "", premutations);
		return premutations;
	}
	
	
	
}
