package logic;

public class RepeatString {

	public static void main(String[] args) {
		int n = 3;
		String s = "abc";
		System.out.println(repeatString(n, s));
		
	}
	
	public static String repeatString(int n, String s) {
		if(n < 0) {
			throw new IllegalArgumentException("The number of repetitions cannot be negative.");
		}
		return s.repeat(n);
	}
	
}
