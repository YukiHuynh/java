package utils;

public class Test {

	public static int strCount(String str, char letter) {
		// write code here
		Character[] charArr = new Character[str.length()];
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (charArr[i] == letter) {
				count++;
			}
		}
		return count;
	}

}
