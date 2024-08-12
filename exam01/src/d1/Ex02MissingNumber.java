package d1;

public class Ex02MissingNumber {

	public static void main(String[] args) {
		int n1 = 6;
		int[] A1 = {3, 2, 1, 6, 5};
		System.out.println("Missig number is: " + getMissingNumber(A1, n1));
		
		int n2 = 10;
		int[] A2 = {3, 7, 9, 2, 1, 6, 5, 4, 10};
		System.out.println("Missing number is: " + getMissingNumber(A2, n2));
	}
	
	public static int getMissingNumber(int[] A, int n) {
		int totalSum = n * (n + 1) / 2;
		int arraySum = 0;
		for(int num : A) {
			arraySum += num;
		}
		return totalSum - arraySum;
	}
	
}
