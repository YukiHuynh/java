package conditional;

import java.util.Scanner;

public class Ex08LetterCheck {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String letter = ip.nextLine();
		
		if (letter.length() != 1 || !Character.isLetter(letter.charAt(0))) {
			System.out.println("Input is not a letter in the alphabet.");
		} else {
			char ch = letter.charAt(0);
			if(isVowel(ch)) {
				System.out.println(ch + " is a vowel");
			} else {
				System.out.println(ch + " is a consonant");
			}
		}
		ip.close();
	}
	
	private static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return ch == 'a' || ch == 'u' || ch == 'i' || ch == 'e' || ch == 'o';
		
	}
	
}
