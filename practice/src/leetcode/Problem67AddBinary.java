package leetcode;

public class Problem67AddBinary {

	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		System.out.println(addBinary(a, b));
	}
	
	public static String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();
		int carry = 0;
		
		int i = a.length() - 1;
		int j = b.length() - 1;
		
		while(i >= 0 || j >= 0) {
			int aBit = (i >= 0) ? a.charAt(i) - '0' : 0;
			int bBit = (j >= 0) ? b.charAt(j) - '0' : 0;
			
			int sum = aBit + bBit + carry;
			result.append(sum % 2);
			carry = sum / 2;
			
			i--;
			j--;
		}
		
		if(carry > 0) {
			result.append(carry);
		}
		return result.reverse().toString();
	}
	
}
