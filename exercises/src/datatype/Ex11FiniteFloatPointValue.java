package datatype;

public class Ex11FiniteFloatPointValue {

	public static void main(String[] args) {
		checkDoubleFinite("0.000213456321d", 0.000213456321d);
		checkDoubleFinite("dn1/0", 0.000213456321d / 0);
		checkDoubleFinite("Double.POSITIVE_INFINITY * 0", Double.POSITIVE_INFINITY * 0);
		
		checkFloatFinite("5.3f", 5.3f);
        checkFloatFinite("fn1/0", 5.3f / 0);
        checkFloatFinite("0f / 0f", 0f / 0f);
	}
	
	private static void checkDoubleFinite(String label, double number) {
		boolean isFinite = Double.isFinite(number);
		System.out.println("\nFinite Doubles\n------------------------");
		System.out.println("Is" + label + " finite? => " + isFinite);
	}
	
	public static void checkFloatFinite(String label, float number) {
		boolean isFinite = Float.isFinite(number);
		System.out.println("\nFinite Float\n---------------------------");
		System.out.println("Is " + label + " finite? => " + isFinite);
	}
	
}
