package recursion;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(greatestCommonDivisor(48, 18));
	}
	
	private static int greatestCommonDivisor(int a, int b) {
		if(b == 0) {
			return a;
		}
		return greatestCommonDivisor(b, a % b);
	}
	
}
