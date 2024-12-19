package leetcode;

public class Problem58LenthsOfLastWord {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(lengthOfLastWord(s));
	}
	
	public static int lengthOfLastWord(String s) {
		int length = 0;
		int i = s.length() - 1;
		
		while(i >= 0 && s.charAt(i) == ' ') {
			i--;
		}
		
		while(i >= 0 && s.charAt(i) != ' ') {
			length++;
			i--;
		}
		return length;
	}
	
}
