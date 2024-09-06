package basicpart;

import java.util.Scanner;

public class B1Ex05 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = ip.nextInt();
		System.out.print("Input second numer: ");
		int num2 = ip.nextInt();
		
		System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
		System.out.println("Sum = " + (num1 + num2) );
		System.out.println("Subtrack = " + (num1 - num2));
		System.out.println("Multiply = " + (num1 * num2));
		System.out.println("Divide = " + (num1 / num2));
		ip.close();
		
		int n = 7;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += Math.pow(i,2);
        }
        System.out.println(sum);
        
        
	}
	
}
