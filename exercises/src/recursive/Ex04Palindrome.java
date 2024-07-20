package recursive;

public class Ex04Palindrome {

	public static void main(String[] args) {
		String palindrome1 = "madam";
		boolean isPalindrome1 = isPalindrome(palindrome1);
		System.out.println("Is " + palindrome1 + " a palindrome? => " + isPalindrome1);
	}
	
	public static boolean isPalindrome (String str) {
		if(str.length() <= 0) {
			return true;
		}
		
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length() - 1);
		if(firstChar != lastChar) {
			return false;
		}
		
		String remainingSubString = str.substring(1, str.length() -1);
		return isPalindrome(remainingSubString);
	}
	
}
