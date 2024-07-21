package array;

public class Ex13FindDuplicateInString {

	public static void main(String[] args) {
		String[] array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if((array[i]).equals(array[j]) && (i != j)) {
					System.out.println("Duplicate element: " + array[j]);
				}
			}
		}
	}
	
}
