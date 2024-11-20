package data_structure_and_algorithms.recursion;

import java.util.Scanner;

public class Ex02BinomialCoefficient {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = ip.nextInt();
		System.out.println("Enter k: ");
		int k = ip.nextInt();
		System.out.println("C(" + n + ", " + k + ") = " + calculateBinomialCoefficient(n, k));
		ip.close();
	}
	
	private static int calculateBinomialCoefficient(int n, int k) {
		if(k == 0 || k == n) {
			return 1;
		}
		return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
	}
	
}
