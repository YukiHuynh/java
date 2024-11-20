package calculate_expression.rpn;

import java.util.Scanner;

public class RPNCalculatorMain {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		// Nhập biểu thức RPN
        System.out.print("Enter RPN Expression: ");
        String rpn = ip.nextLine();
        
        RPNCalculator calculator = new RPNCalculator();
        double result = calculator.calculateRPN(rpn);
        
        System.out.printf("%s = %.4f%n", rpn, result);
        ip.close();
		
	}
	
}
