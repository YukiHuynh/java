package twentybasicexercises;

import java.util.Scanner;

import utils.IOUtils;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		int a = IOUtils.triangleSide("Enter side a", ip);
		int b = IOUtils.triangleSide("Enter side b", ip);
		int c = IOUtils.triangleSide("Enter side c", ip);
		if(isTriangleSides(a, b, c)) {
			System.out.println(a + ", " + b + ", " + c + " is three side of a triangle." );
		} else {
			System.out.println(a + ", " + b + ", " + c + " is not three side of a triangle." );
		}
		
	}
	
	private static boolean isTriangleSides(int a, int b, int c) {
		return (a + b) > c && (a + c) > b && (b + c) > a;
	}
	
}
