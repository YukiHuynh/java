package twentybasicexercises;

import java.util.Scanner;

import utils.IOUtils;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		int a = IOUtils.triangleSide("Enter side a", ip);
		int b = IOUtils.triangleSide("Enter side b", ip);
		int c = IOUtils.triangleSide("Enter side c", ip);
		if (isRightTriangle(a, b, c)) {
			System.out.println(a + ", " + b + ", " + c + " is three side of a right triangle.");
		} else {
			System.out.println(a + ", " + b + ", " + c + " is not three side of a right triangle.");
		}
	}
	
	private static boolean isRightTriangle(int a, int b, int c) {
		return (Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) ||
			   (Math.pow(a, 2) + Math.pow(c, 2)) == Math.pow(b, 2) ||
			   (Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2);
	}

}
